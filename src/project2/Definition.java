/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Represents a definition, consisting of a myName and a list of arguments.
 */
public class Definition {
    protected String myName;
    protected ArrayList myArgs;
    protected Environment mye;
    protected ListIterator<String>myIterator;

    /**
     * We need to read in all the definitions from the input iterator and store
     * them in e. 
     * @param input Iterator for the input tokens. Should be queued at the start
     * of the file when we get here.
     */
    public Definition(Environment e, ListIterator<String> i){
        mye = e;
        myIterator = i;
        myName = null;
        myArgs = new ArrayList();
    }
    
    public void fillEnvironment(){
        String currToken;

        while(myIterator.hasNext() && (!(currToken = myIterator.next()).equals("Operation"))){
            if (currToken.equals("Definition")){
                getName();
                getArgs();
                mye.addDefinition(myName, new Definition(myName, myArgs));
            }
            
            else{
                System.out.println("Shouldn't be here!");
            }
        }
    }
    
    /**
     * This method gathers all the names that pertain to this definition
     */
    protected void getName() {
        myName = myIterator.next();
        myIterator.next();
    }
    
    /**
     * This method gathers all of the arguments that pertain to this definition
     */
    protected void getArgs() {
        myArgs.clear();
        String currToken = null;
        
        while(!(currToken = myIterator.next()).equals(")")){
                if(!currToken.equals(","))
                    myArgs.add(currToken);
        }
    }
    
    protected Definition(String n, ArrayList a) {
        myName = n;
        myArgs = new ArrayList(a);
    }

    @Override
    public String toString(){
        return(myName + myArgs.toString());
    }
}
