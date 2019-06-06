package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.Visitorfbf;

public class NegationNode extends Unary {

    public NegationNode(){
	
    }

    public NegationNode(ASTfbf sub) {
	super(sub);
    }

    public String getOperator() {
	return new String("!");
    }
    
    public void accept(Visitorfbf visitor){
	visitor.visit(this);
    }
}
