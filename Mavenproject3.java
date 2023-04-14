
package com.mycompany.mavenproject3;


public class Mavenproject3 {

    public static void main(String[] args) {
        System.out.println("Шандиров Идар, РИБО-02-21, вариант №4");
        Runnable rn = new SomeProcess();
        Thread th1 = new Thread(rn);
        Thread th2 = new Thread(rn);
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        }
        catch (InterruptedException ex) {
        
        }
    }
}
