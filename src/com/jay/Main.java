package com.jay;
public class Main {
    public static void main(String[] args) {
        Racer racer = new Racer();
        Thread t1 = new Thread(racer, "Jay");
        Thread t2 = new Thread(racer, "Ram");
        Thread t3 = new Thread(racer, "Vikash");
        Thread t4 = new Thread(racer, "Ajay");
        Thread t5 = new Thread(racer, "Saurav");
        Thread t6 = new Thread(racer, "Vineet");
        Thread t7 = new Thread(racer, "Max");
        Thread t8 = new Thread(racer, "John");
        Thread t9 = new Thread(racer, "Joe");
        Thread t10 = new Thread(racer, "Hex");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }
}

