package edu.app;

import edu.bopy.*;
import edu.app.BopyProgramListener;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

class Bopy {
    public static void main(final String[] args) {
        String input_string = "let x = 5\n";
        CharStream input = CharStreams.fromString(input_string);
        final BopyLexer lexer = new BopyLexer(input);

        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final BopyParser parser = new BopyParser(tokens);
        final BopyParser.ProgramContext tree = parser.program();

        final BopyProgramListener listener = new BopyProgramListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
    }
}
