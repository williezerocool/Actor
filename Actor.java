/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actor;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
public class Actor {

    String name;
    String role;
    String birthdate;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
       
        String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
        Scanner inFile = new Scanner((new java.net.URL(url)).openStream());
        
        int count = 0;
        while(inFile.hasNext()){
        
            
            
            Actor a = getActor(inFile);
            System.out.print(a.name + " was born on " + a.birthdate);
            System.out.println(" and played " + a.role);
            
            count++;
        }
        System.out.println(count + " records were displayed");
        inFile.close();
    }
    
    public static Actor getActor(Scanner input){
    
        Actor a = new Actor();
        a.name = input.nextLine();
        a.role = input.nextLine();
        a.birthdate = input.nextLine();
        
        return a;
    }
    private String bithdate;
    
}
