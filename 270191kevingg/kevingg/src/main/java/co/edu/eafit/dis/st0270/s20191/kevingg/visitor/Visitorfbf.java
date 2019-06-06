package co.edu.eafit.dis.st0270.s20191.kevingg.visitor;

import co.edu.eafit.dis.st0270.s20191.kevingg.abs.PredicateNode;
import co.edu.eafit.dis.st0270.s20191.kevingg.abs.ForallNode;
import co.edu.eafit.dis.st0270.s20191.kevingg.abs.ExistentialNode;
import co.edu.eafit.dis.st0270.s20191.kevingg.abs.NegationNode;
import co.edu.eafit.dis.st0270.s20191.kevingg.abs.AndNode;
import co.edu.eafit.dis.st0270.s20191.kevingg.abs.BiconditionalNode;
import co.edu.eafit.dis.st0270.s20191.kevingg.abs.ConditionalNode;
import co.edu.eafit.dis.st0270.s20191.kevingg.abs.OrNode;
import co.edu.eafit.dis.st0270.s20191.kevingg.abs.Loprior;;

public interface Visitorfbf {
    public void visit(PredicateNode predicate);
    public void visit(ForallNode forall);
    public void visit(ExistentialNode existential);
    public void visit(NegationNode negation);
    public void visit(AndNode and);
    public void visit(OrNode Or);
    public void visit(ConditionalNode conditional);
    public void visit(BiconditionalNode biconditional);
    public void visit(Loprior loprior);
}

