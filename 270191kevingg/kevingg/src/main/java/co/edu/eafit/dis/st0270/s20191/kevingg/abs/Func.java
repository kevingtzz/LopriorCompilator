package co.edu.eafit.dis.st0270.s20191.kevingg.abs;

import co.edu.eafit.dis.st0270.s20191.kevingg.visitor.VisitorTERM;
import java.util.ArrayList;

public class Func extends ASTterm {

    private String name;
    ArrayList<ASTterm> list;

    public Func () {
	
    }

    public Func(String name, ArrayList<ASTterm> list){
    this.name = name;
    this.list = list;
    }

    public String getName() {
	return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public ArrayList<ASTterm> getlist() {
        return list;
    }
    
    public void setList(ArrayList<ASTterm> list) {
        this.list = list;
    }
    
    public void accept(VisitorTERM visitor){
	visitor.visit(this);
    }
}
