/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

/**
 * <p>Stores a map from names of definitions and operations (as Strings)
 * to objects of type Definition and Operation, as well as a list of all
 * procedures.</p>
 *
 * !!We may want to use two maps, one for definitions and one for operations.
 * !!But maybe not
 */
public class Environment {
    HashMap<String, Definition> definitionsAndOperations;
    ArrayList procedures;

    public Environment(){
        definitionsAndOperations = new HashMap();
        procedures = new ArrayList();
    }

    /**
     * Associates name with defObject in the map.
     * @param name The name of the definition
     * @param defObject A reference to the Definition object associated with
     * name.
     */
    public void addDefinition(String name, Definition defObject){
        definitionsAndOperations.put(name, defObject);
    }
    /**
     * Associates name with opObject in the map.
     * @param name The name of the operation
     * @param opObject A reference to the Operation object associated with
     * name.
     */
    public void addOperation(String name, Operation opObject){
        definitionsAndOperations.put(name, opObject);
    }
    
    public void addProcedure(Procedure p) {
        procedures.add(p);
    }

    public void populate(ListIterator<String> input){
        String niftyKeyword = input.next();
        Procedure lastProcedure = null;
        while(input.hasNext()){
            if(niftyKeyword.equals("Definition")){
                Definition def = new Definition(input);
                def.getName();
                def.getArgs();
                addDefinition(def.getNameForReal(), def);
            }
            else if(niftyKeyword.equals("Operation")){
                Operation op = new Operation(input);
                op.getName();
                op.getArgs();
                op.getRequires();
                op.getEnsures();
                addOperation(op.getNameForReal(), op);
            }
            else if(niftyKeyword.equals("Procedure")){
                Procedure p = new Procedure(input);
                p.getName();
                p.getArgs();
                p.getRequires();
                p.getEnsures();
                input.previous();
                addProcedure(p);
                lastProcedure = p;
            }
            else if(niftyKeyword.equals("begin")){
                    Call c = new Call(input);
                    c.getName();
                    c.getArgs();
                    lastProcedure.addCall(c);
            }


        }
    }

    @Override
    public String toString(){
        String r = definitionsAndOperations.toString();
        return r;
    }
}
