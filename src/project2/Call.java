/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;

import java.util.ListIterator;

/**
 * Represents the operation calls in the implementation of a procedure. Consists
 * of a name and some number of arguments.
 */
public class Call extends Definition {

    
    public Call(Environment e, ListIterator<String> i) {
        super(e, i);
    }
    
    public Call readNewCall(){
        getName();
        getArgs();
        return this;
    }

    public Call(ListIterator<String> i){
        super(i);
    }
}
