/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * A procedure is an operation that has some implementing code.
 *
 */
public class Procedure extends Operation{

    private ArrayList<Call> myCalls;
    
    
    public Procedure(Environment e, ListIterator<String> i) {
        super(e, i);
        myCalls = new ArrayList<Call>();
    }
    
    @Override
    public void fillEnvironment() {
        getName();
        getArgs();
        getRequires();
        getEnsures();
        getCalls();
    }
    
    private void getCalls() {
        
        String currTok;
        Call temp = null;
        
        while ((!(currTok = myIterator.next()).equals("end"))) {
            temp = new Call(mye, myIterator);
            myCalls.add(temp.readNewCall());
        }
            
    }
    
    public ProofTable generateProofTable(Environment e){
        return new ProofTable();
    }

    public void addCall(Call c){
        myCalls.add(c);
    }
    public Procedure(ListIterator<String> i){
        super(i);
        myCalls = new ArrayList<Call>();
    }

}
