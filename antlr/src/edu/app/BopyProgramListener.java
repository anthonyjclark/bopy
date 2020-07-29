package edu.app;

import edu.bopy.BopyBaseListener;
import edu.bopy.BopyParser;

public class BopyProgramListener extends BopyBaseListener {
    @Override
    public void enterProgram(final BopyParser.ProgramContext ctx) {
        System.out.println("enter program");
    }
}
