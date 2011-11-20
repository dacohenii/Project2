/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

/**
 * <p>An immutable representation of something found in a requires or ensures
 * clause. Represents either a single variable or the application of a single
 * definition to some number of arguments.</p>
 */
public class Expression  {

    private ArrayList<Expression> myArguments;
    private String myName;

    public Expression(ListIterator<String> input, Environment e) {
        myArguments = new ArrayList<Expression>();
        myName = input.next();

        //Read until a left paren or ,. Make sure there is an Expression and 
        //read it in
        String currentToken = input.next();
        if(currentToken.equals("(") || currentToken.equals(",")){
            if(!input.next().equals(")")) {
                input.previous();
                myArguments.add(new Expression(input, e));
            }
        }
        
        //If a right paren was found, evaluate the situation and read in the next
        //Expression if necessary. If not go ahead and exit.
        else if(currentToken.equals(")")) {
            //eating the right parens that we don't need
            while((currentToken = input.next()).equals(")"));
            
            if(!(currentToken.equals("ensures") || currentToken.equals("Operation")
                || currentToken.equals("Procedure"))) {
                myArguments.add(new Expression(input, e));
            }
        }

        System.out.print(myName + ", ");
    }

    

    /**
     * Returns a new Expression with any variable inside it that matches some
     * key in the given map replaced by the value associated with it in the map.
     * All other definition and variable names are left alone.
     */
    /*public Expression substitute(Map<String, String> map){
        return(new Expression());
    }*/
}
