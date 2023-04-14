
package com.mycompany.mavenproject3;

import java.util.logging.Level;
import java.util.logging.Logger;


public class SomeProcess implements Runnable {
    public synchronized void doSomething() {
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        while (true) {
             doSomething();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(SomeProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
