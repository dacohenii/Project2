/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author jmaggio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File inputFile = new File("Project2Input.txt");
        ArrayList inputTokens = null;
        try {
            inputTokens = lex(inputFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Bad input file");
        }

        
        ListIterator<String> inputIterator = inputTokens.listIterator();
        Environment e = new Environment();
        
        //Generate all of our definitions
        Definition defs = new Definition(e, inputIterator);
        defs.fillEnvironment();
        
        //now generate all of the operations
        Operation ops = new Operation(e, inputIterator);
        ops.fillEnvironment();

        System.out.println(e.toString());

    }

    /**
     * Takes the input file and tokenizes it on whitespace and parens ( )
     * Parens get their own token.
     * @param input
     * @return
     * @throws FileNotFoundException
     */
    private static ArrayList<String> lex(File input) throws FileNotFoundException {
        ArrayList<String> tokens = new ArrayList();
        String currentToken, finalToken;

        Scanner inputScanner = new Scanner(input);
        StringTokenizer whiteSpaceTokenizer;
        StringTokenizer parenTokenizer;

        while(inputScanner.hasNextLine()){
            String currLine = inputScanner.nextLine();
            whiteSpaceTokenizer = new StringTokenizer(currLine);
            //Remove whitespace
            while (whiteSpaceTokenizer.hasMoreTokens()){
                currentToken = whiteSpaceTokenizer.nextToken();
                parenTokenizer = new StringTokenizer(currentToken, "(),", true);
                //Grab parens
                while(parenTokenizer.hasMoreTokens()){
                    finalToken = parenTokenizer.nextToken();
                    //Throw out commas
                    //finalToken = finalToken.replace(",", "");
                    finalToken = finalToken.replaceAll("[\\s+]", "");
                    
                    tokens.add(finalToken);
                }
            }
        }
        return tokens;
}
}
