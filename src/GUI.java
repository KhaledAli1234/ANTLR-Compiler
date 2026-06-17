import javax.swing.*;
import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class GUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("MiniJava Compiler");
        frame.setSize(900, 650);

        JTextArea input = new JTextArea();
        JTextArea output = new JTextArea(); // optional debug

        JButton parseBtn = new JButton("Parse");
        JButton loadBtn = new JButton("Load File");

        JTree treeView = new JTree();
        JScrollPane treeScroll = new JScrollPane(treeView);

        loadBtn.addActionListener(e -> {
            try {
                String content = new String(
                        Files.readAllBytes(Paths.get("samples/test1.java"))
                );
                input.setText(content);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error loading file: " + ex.getMessage());
            }
        });


        parseBtn.addActionListener(e -> {
            try {
                if (input.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please load or enter code first!");
                    return;
                }

                ANTLRStringStream in = new ANTLRStringStream(input.getText());
                MiniJavaLexer lexer = new MiniJavaLexer(in);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                MiniJavaParser parser = new MiniJavaParser(tokens);

                MiniJavaParser.program_return result = parser.program();

                if (parser.getNumberOfSyntaxErrors() > 0) {
                    JOptionPane.showMessageDialog(frame, "Syntax Error!");
                    return;
                }

                CommonTree tree = (CommonTree) result.getTree();

                treeView.setModel(
                        new javax.swing.tree.DefaultTreeModel(
                                ASTUtil.convert(tree)
                        )
                );

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
            }
        });


        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        topPanel.add(loadBtn);
        topPanel.add(parseBtn);

        frame.setLayout(new BorderLayout());

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(input), BorderLayout.CENTER);
        frame.add(treeScroll, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}