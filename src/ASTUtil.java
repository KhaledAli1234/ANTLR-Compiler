import javax.swing.tree.DefaultMutableTreeNode;
import org.antlr.runtime.tree.Tree;

public class ASTUtil {

    public static DefaultMutableTreeNode convert(Tree tree) {
        if (tree == null) return null;

        DefaultMutableTreeNode node =
                new DefaultMutableTreeNode(tree.getText());

        for (int i = 0; i < tree.getChildCount(); i++) {
            node.add(convert(tree.getChild(i)));
        }

        return node;
    }
}