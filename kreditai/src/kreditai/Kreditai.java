/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kreditai;

import static java.lang.Integer.getInteger;
import java.math.BigDecimal;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author kraputis
 */
public class Kreditai {

    private Scanner in;
    private int m;
    private float b;
    private float t, t1;
    private float v;

    public Kreditai() {
        setIn(new Scanner(System.in));
        setM(0);
        setB(0);
        setT(0);
        setT1(0);
        setT1(0);
        setV(0);
    }

    //-----------------Setter--------------------//
    public void setIn(Scanner in) {
        this.in = in;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setT(float t) {
        this.t = t;
    }

    public void setT1(float t1) {
        this.t1 = t1;
    }

    public void setV(float v) {
        this.v = v;
    }

    //************END****Setter***************//
    //--------------Getter-------------------//
    public Scanner getIn() {
        return in;
    }

    public int getM() {
        return m;
    }

    public float getB() {
        return b;
    }

    public float getT() {
        return t;
    }

    public float getT1() {
        return t1;
    }

    public float getV() {
        return v;
    }

    //*********END*GETTER*******************//
    void busto() {
        System.out.println("Iveskite vaiku skaiciu nuo 0-10");
        int x = in.nextInt();
        System.out.println("Seimos pajamos nuo 0 iki 30000eur");
        int y = in.nextInt();
        System.out.println("Seimos finansiniai isipareigojimai nuo 0 iki 15000eur");
        int z = in.nextInt();
        System.out.println("Paskola neribojama");
        int c = in.nextInt();
        System.out.println("Laikotarpis 50 metų - pastato amžius, bet ne daugiau 40 metų");
        int l = in.nextInt();
        print_title("Kredito skaiciuokle");
        System.out.println("Menesine imoka : ");
        setM(c / (l * 12));
        System.out.println(getM());
        System.out.println("Bendra grazintine suma : ");
        setB((c + (c * 13f / 100f)));
        System.out.println(getB());
        print_title(" Sutarties sudarimo apskaiciavimai");
        setT((200 * x));
        setT1(getM() + (getM() * 40f / 100f));
        //System.out.println("Menesine imoka 40%");
        //System.out.println(t1);
        if (y <= getT()) {
            System.out.println("Kreditas nesuteikiamas");

        } else {
            if (getT1() > ((y - getT()) - z)) {
                System.out.println("Kreditas nesuteikiamas");
            } else {
                System.out.println("Kreditas suteikiamas");
            }
        }
        print_title("Kredito grazinimo laikotarpis");
        setV(getB() / getM());
        System.out.println("Kredito grazinimas menesiais");
        System.out.println(getV());
        System.out.println("Kredito grazinimas metais");
        System.out.println(round(getV() / 12, 2));
        System.out.println("");
    }

    void vartojimo() {
        System.out.println("Iveskite vaiku skaiciu nuo 0-10");
        int x = in.nextInt();
        System.out.println("Seimos pajamos nuo 0 iki 10000eur");
        int y = in.nextInt();
        System.out.println("Seimos finansiniai isipareigojimai nuo 0 iki 5000eur");
        int z = in.nextInt();
        System.out.println("Paskola nuo 300 iki 26000eur");
        int c = in.nextInt();
        System.out.println("Laikotarpis iki 5 metu");
        int l = in.nextInt();
        print_title("Kredito skaiciuokle");
        System.out.println("Menesine imoka : ");
        setM(c / (l * 12));
        System.out.println(getM());
        System.out.println("Bendra grazintine suma : ");
        setB(c + (c * 1f / 100f));
        System.out.println(getB());
        print_title("Sutarties sudarimo apskaiciavimai");
        setT(200 * x);
        setT1(getM() + (getM() * 40f / 100f));
        //System.out.println("Menesine imoka 40%");
        //System.out.println(t1);
        if (y <= getT()) {
            System.out.println("Kreditas nesuteikiamas");

        } else {
            if (getT1() > ((y - getT()) - z)) {
                System.out.println("Kreditas nesuteikiamas");
            } else {
                System.out.println("Kreditas suteikiamas");
            }
        }
        print_title("Kredito grazinimo laikotarpis");
        setV(getB() / getM());
        System.out.println("Kredito grazinimas menesiais");
        System.out.println(getV());
        System.out.println("Kredito grazinimas metais");
        System.out.println(getV() / 12);
        System.out.println("");
    }

    private void print_title(String title) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("                       " + title + "                          ");
        System.out.println("--------------------------------------------------------------");
    }

}
