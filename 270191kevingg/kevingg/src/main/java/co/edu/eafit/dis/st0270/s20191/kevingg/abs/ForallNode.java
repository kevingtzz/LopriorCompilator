package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.Visitorfbf;

public class ForallNode extends Unary {

    private String nombre;

    public ForallNode() {
	this.nombre = "";
    }

    public ForallNode(String nombre, ASTfbf sub) {
	super(sub);
	this.nombre = nombre;
    }

    public String getName() {
	return nombre;
    }

    public void setName(String name) {
	this.nombre = nombre;
    }

    public String getOperator(){
	return new String("$");
    }

    public void accept(Visitorfbf visitor){
	visitor.visit(this);
    }
}
