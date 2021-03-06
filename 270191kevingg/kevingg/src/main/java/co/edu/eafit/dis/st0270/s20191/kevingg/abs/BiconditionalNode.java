package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.Visitorfbf;

public class BiconditionalNode extends BinaryNode {

    public BiconditionalNode() {
	
    }

    public BiconditionalNode(ASTfbf left, ASTfbf right) {
	super(left, right);
    }

    public String getOperator(){
	return new String("<>");
    }

    public void accept(Visitorfbf visitor) {
	visitor.visit(this);
    }
}
