import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String code = "class Test { int x; public int foo() { x = 5; return x; } }";

        ANTLRStringStream input = new ANTLRStringStream(code);
        MiniJavaLexer lexer = new MiniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);

        MiniJavaParser.program_return result = parser.program();

        CommonTree tree = (CommonTree) result.getTree();

        System.out.println("AST:");
        System.out.println(tree.toStringTree());
    }
}