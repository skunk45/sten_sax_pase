/*
 grupp: Milkyas Joel Isak */


package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
    String flerspelarläge = "";
    String enspelarläge = "";
    int computerint;

    String response;

    Scanner scan = new Scanner(System.in);
    Random generator = new Random();

    System.out.println("Råk päper sisor din nisse");
    System.out.println();

    computerint = generator.nextInt(3)+1;
    if (computerint == 1)
        enspelarläge = "R";
    else if (computerint == 2)
        enspelarläge = "P";
    else if (computerint == 3)
        enspelarläge = "S";

    System.out.println("Sten, sax eller påse?");
    flerspelarläge = flerspelarläge.toUpperCase();
        JOptionPane.showMessageDialog(
                Frame, "välj din noob"
        );
        System.exit(0);

    System.out.println("Datorn spelar: " + enspelarläge);

    if (flerspelarläge.equals(enspelarläge))
        System.out.println("bruh ni valde samma");
    else if (flerspelarläge.equals("R"))
        if (enspelarläge.equals("S"))
            System.out.println("du vann pro");
        else if (enspelarläge.equals("P"))
            System.out.println("noob du förlorade hah");
        else if (flerspelarläge.equals("P"))
            if (enspelarläge.equals("S"))
                System.out.println("du förlorade din boomer");
            else if (enspelarläge.equals("R"))
                System.out.println("du vann :)");
            else if (flerspelarläge.equals("S"))
                if (enspelarläge.equals("P"))
                    System.out.println("Sicken vinst");
                else if (enspelarläge.equals("R"))
                    System.out.println("aja baja dålig förlust");
                else
                    System.out.println("vad i hela fridens namn va det där");

    }
}
