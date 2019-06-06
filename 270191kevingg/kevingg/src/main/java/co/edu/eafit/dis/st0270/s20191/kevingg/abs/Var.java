package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.VisitorTERM;

public class Var extends ASTterm {

    private String var;

    public Var() {

    }

    public Var(String var){
	this.var = var;
    }

    public String getVar() {
	return var;
    }

    public void setVar(String var) {
	this.var = var;
    }

    public void accept(VisitorTERM visitor){
	visitor.visit(this);
    }
}
