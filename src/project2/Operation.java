/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * An operation is a definition that has a requires and ensures clause.
 */
public class Operation extends Definition{
    private Expression myRequires, myEnsures;   

    public Operation(Environment e, ListIterator<String> i)
    {
        super(e, i);
        myRequires = null;
        myEnsures = null;
    }

    @Override
    public void fillEnvironment(){
        String currToken;

        currToken = myIterator.previous();
        while(myIterator.hasNext() && (!(currToken = myIterator.next()).equals("Procedure"))){
            if (currToken.equals("Operation")){
                getName();
                getArgs();
                getRequires();
                getEnsures();
                myIterator.previous();
            }
            
            else{
            }
        }
        mye.addOperation(myName, new Operation(myName, myArgs));
    }
    
    
    /**
     * Gathers the information needed to create a new expression. It assigns
     * the new Expression to this classes myRequires variable.
     */
    private void getRequires() {
       System.out.println("\nRequires: ");
       /******************************************/
       myIterator.next();
       myRequires = new Expression(myIterator, mye);
       /******************************************/
       System.out.println("\n");
    }
    
    /**
     * Gathers the information needed to create a new expression. It assigns
     * the new Expression to this classes myEnsures variable.
     */
    private void getEnsures() {
        System.out.println("\nEnsures: ");
        /******************************************/
        String currToken = myIterator.next();
        while(!(currToken = myIterator.next()).equals("ensures"));
        myEnsures = new Expression(myIterator, mye);
        /******************************************/
        System.out.println("\n");
    }
        
    public Operation(String defName, ArrayList arguments){
        super(defName, arguments);
    }
}
