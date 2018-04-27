/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secret.stringbuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author PolinaYoga
 */
public class SecretStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Open the fle.
        File file = new File("secret.txt");
        try
        {
            Scanner inputFile = new Scanner(file);
            // Read the fle contents into the array.
            StringBuilder object = new StringBuilder();
            
            while (inputFile.hasNext())
            {
                String text = inputFile.nextLine();
                String[] parts = text.split(" ");
               
                for(int i = 0; i < parts.length; i++)
                {
                    if(i%5 == 0)
                    {
                        char firstLetter = Character.toUpperCase(parts[i].charAt(0)); 
                        
                        object.append(firstLetter);
                    }
                    
                }
            }
            // Close the fle.
            inputFile.close();
            
             System.out.print(object + "\n");
        }
        catch(FileNotFoundException e)
        {
            System.err.format("File does not exist\n");
        }
        
    }
    
    
}
