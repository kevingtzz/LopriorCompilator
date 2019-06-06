package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.VisitorTERM;

public class Nom extends ASTterm {

    private String nom;

    public Nom() {
	
    }

    public Nom(String nom) {
	this.nom = nom;
    }

    public String getNom(){
	return nom;
    }

    public void setNom(String nom){
	this.nom = nom;
    }

    public void accept(VisitorTERM visitor) {
	visitor.visit(this);
    }
}
