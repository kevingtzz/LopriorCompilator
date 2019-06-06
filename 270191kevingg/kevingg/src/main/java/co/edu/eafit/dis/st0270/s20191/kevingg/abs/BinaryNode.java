package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.Visitorfbf;

public abstract class BinaryNode extends ASTfbf {

   private ASTfbf left;
   private ASTfbf right;

   public BinaryNode () {
	
}

public BinaryNode(ASTfbf left, ASTfbf right){
	this.left = left;
	this.right = right;
}

    public ASTfbf getLeft() {
	return left;
    }

    public void setLeft(ASTfbf left){
	this.left = left;
    }

    public ASTfbf getRigth() {
	return right;
    }

    public void setRight(ASTfbf right){
	this.right = right;
    }

    public abstract String getOperator();
    
    public abstract void accept(Visitorfbf visitor);
    
}
