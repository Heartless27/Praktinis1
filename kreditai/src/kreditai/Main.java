/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kreditai;

import java.util.Scanner;

/**
 *
 * @author E J A
 */
public class Main {
       public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char move;
        String newLine = System.getProperty("line.separator");
        Kreditai ch = new Kreditai();
        //int x;
        do {

            System.out.println("1. Busto kreditas" + newLine + "2. Vartojimo kreditas");
            System.out.println("3. Uzbaigti");
            move = keyboard.next().charAt(0);

            switch (move) {
                case '1':
                    ch.busto();

                    break;
                case '2':
                    ch.vartojimo();

            }

        } while (move != '3');

    }
}
