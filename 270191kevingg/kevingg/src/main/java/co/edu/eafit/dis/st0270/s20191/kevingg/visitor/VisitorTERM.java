package co.edu.eafit.dis.st0270.s20191.kevingg.visitor;

import co.edu.eafit.dis.st0270.s20191.kevingg.abs.Var;
import co.edu.eafit.dis.st0270.s20191.kevingg.abs.Nom;
import co.edu.eafit.dis.st0270.s20191.kevingg.abs.Func;

public interface VisitorTERM {

    public void visit(Var var);
    public void visit(Nom nom);
    public void visit(Func func);
}

