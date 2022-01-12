package kd_3n_2;

import java.util.Scanner;
import static java.lang.Math.*;

public class KD_3N_2 {

    public static void main(String[] args) {
        
    System.out.println("\t\tMatematisko funkciju lietosana");
    System.out.println("---------------------------------------------------------");
    Scanner input = new Scanner(System.in);
        
    System.out.println("Ievadiet rinka radiusu: ");
      float rlRad = input.nextFloat();

      double rlGar = (2*PI*rlRad);
    System.out.format("Rinka linijas garums ir: %.2f%n", rlGar);
        
      double rlLauk = (PI*pow(rlRad,2));
    System.out.format("Rinka linijas laukums ir: %.2f%n", rlLauk);
        
    System.out.println("Ievadiet taislenka trisstura pirmas katetes garumu: ");
      float K1Gar = input.nextFloat();
        
    System.out.println("Ievadiet taislenka trisstura otras katetes garumu: ");
      float K2Gar = input.nextFloat();
        
      double hipGar = (pow(K1Gar,2) + pow(K2Gar,2));
        
      double h = sqrt(hipGar);
    System.out.format("Taislenka trisstura hipotenuzas garums ir : %.2f%n", h);
        
      double interv = random() +7;
    System.out.format("Gadijuma skaitlis intervala 0 lidz 10 ir " + interv);
    }
}
