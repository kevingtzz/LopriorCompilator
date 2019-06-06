package co.edu.eafit.dis.st0270.s20191.kevingg;

import co.edu.eafit.dis.st0270.s20191.kevingg.abs.ASTfbf;
import co.edu.eafit.dis.st0270.s20191.kevingg.parser.*;
import co.edu.eafit.dis.st0270.s20191.kevingg.flex.*;
import java_cup.runtime.*;
import gnu.getopt.Getopt;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class LopriorMain {
    public static void main( String[] args ) {

        for (int i = 0; i < args.length; i++) {
            try {
                FileReader fr = new FileReader(args[0]);
                LopriorLexer lexer = new LopriorLexer(fr);
                LopriorParser parser = new LopriorParser(lexer);
		
                
                Symbol symbol = parser.parse();
		ASTfbf tree = (ASTfbf) symbol.value;
		//tree.accept();
		System.out.println("OK");
            }
            catch (FileNotFoundException fnfe) {
                System.err.println("File: " + args[i] + "not found");
            }
            catch (IOException IOe) {
                System.err.println("IOException: " + args[i]);
            }
            catch (Exception e) {
                System.err.println("File " + args[i] + "Parser: " + false);
		//System.out.println(e);
            }
        }
    }
}
