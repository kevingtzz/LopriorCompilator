package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.Visitorfbf;

public class ConditionalNode extends BinaryNode {

    public ConditionalNode() {
	
    }

    public ConditionalNode(ASTfbf left, ASTfbf right) {
	super(left, right);
    }

    public String getOperator() {
	return new String(">");
    }

    public void accept(Visitorfbf visitor) {
	visitor.visit(this);
    }
}
