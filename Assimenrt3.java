/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assimenrt3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author s4350
 */
public class Assimenrt3 {

    public static void main(String[] args) {
        int number = 0;

        try {//exception
            Scanner e = new Scanner(System.in);//read 
            System.out.println("enter the number");
            number = Integer.parseInt(e.next());

        } catch (NumberFormatException x) {//error
            System.err.println("Invalid");
        }
        
    }
}
