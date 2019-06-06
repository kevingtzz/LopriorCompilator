package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.VisitorTERM;

public abstract class ASTterm {

    public abstract void accept(VisitorTERM visitor);
}
