package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.Visitorfbf;

public abstract class Unary extends ASTfbf {

    private ASTfbf sub;

    public Unary(){
	
    }

    public Unary(ASTfbf sub){
	this.sub = sub;
    }

    public ASTfbf getSub() {
	return sub;
    }

    public void setSub(ASTfbf sub) {
	this.sub = sub;
    }

    public abstract String getOperator();
    
    public abstract void accept(Visitorfbf visitor);
}
