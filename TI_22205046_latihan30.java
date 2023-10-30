/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saldo.ti_22205046_latihan28;
import java.util.Scanner;
/**
 *
 * @author HP
 */
/**
 * Nama : Andy Widianto
 * nim  : 22205046
 * prody: TEKNIK INFORMATIKA
 * @author HP
 */
public class TI_22205046_latihan30 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
        System.out.println("\u001b[31mKamu \u001b[32mNgerjain Sendiri \u001b[33mLatihan \u001b[34m17 Sampai 30 \u001b[36mIni ? ");
        System.out.print("\u001b[33mJawab \u001b[32m(Yoi/Engga ) : ");
        String Jawab = input.nextLine();
        if (Jawab.equalsIgnoreCase("yoi")){
            System.out.println("");
            System.out.println("\u001b[33mCakep Bener, \u001b[32mGod Job");
        }else if(Jawab.equalsIgnoreCase("engga")) {
            System.out.println("\u001b[33mTetep \u001b[32mCakep Sih");
        }else{
            System.out.println("maaf yang anda masukan");
        }
    }
}
