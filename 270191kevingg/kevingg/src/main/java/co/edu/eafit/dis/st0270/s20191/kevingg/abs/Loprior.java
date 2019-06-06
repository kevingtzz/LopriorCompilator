package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.Visitorfbf;

public class Loprior extends Unary {

    public Loprior() {
	
    }

    public Loprior(ASTfbf sub) {
	super(sub);
    }

    public String getOperator(){
	return new String("");
    }

    public void accept(Visitorfbf visitor){
	visitor.visit(this);
    }
}
