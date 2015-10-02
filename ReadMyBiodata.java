/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printbiodata;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fauzan
 */
public class ReadMyBiodata {
    public static void main(String[] args){
        
       try{
        FileInputStream path = new FileInputStream("C:/Users/Fauzan/Desktop/Nur Fauzan Ikmi.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(path));
        
        //read line
        String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }           

        System.out.println();
       }catch(FileNotFoundException e){
           e.printStackTrace();
       }catch(IOException e){
           e.printStackTrace();
       }
       
    }
    
}
