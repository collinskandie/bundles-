package com.credit;
import javax.swing.*;
import java.util.Scanner;

class Main{
    public void main() {
        mainMenu();        
    }
    public void mainMenu(){
        int optionChooser = 0;
        System.out.println("..............................................");
        System.out.println("\t\t\t......Bundles buying prototype for safaricom.....\t\t\t");
        System.out.println("1. Data (No Expiry)");
        System.out.println("2. Data (with expiry)");
        System.out.println("3. Calls & SMS with no expiry");
        System.out.println("4. Okoa Jahazi");
        System.out.println("...........................................");

        do{
            
            switch (optionChooser) {
                case 1: 
                    dataNoExpiry();            
                    break;
                case 2:
                    dataWithExpiry();
                    break;
                case 3:
                    callNoExpiry();
                    break;
                case 4:
                    okoaJahazi();
                    break;                                
                default:
                    exit();                
                    break;
            }
        } while (optionChooser != 5);
        
    }
    public void dataNoExpiry(){
        int chooseRecipt = 0;

        do{
        System.out.println("\t\t\t......Bundles buying prototype for safaricom.....\t\t\t");
        System.out.println("1. Data (No Expiry)");
        System.out.println("2. Data (with expiry)");
        System.out.println("3. Calls & SMS with no expiry");

        }while (chooseRecipt !=0);
        
    }
    public void dataWithExpiry(){}
    public void callNoExpiry(){}
    public void okoaJahazi(){}
    public void exit(){}
}