package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.Visitorfbf;

public class ExistentialNode extends Unary {

    private String name;

    public ExistentialNode() {
	this.name = "";
    }

    public ExistentialNode(String name, ASTfbf sub) {
	super(sub);
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getOperator(){
	return new String("&");
    }
    
    public void accept(Visitorfbf visitor) {
	visitor.visit(this);
    }
}
