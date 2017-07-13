package com.devix.www;

public class Main {

    public static void main(String[] args) {
        TwoThreadLive twoThreadLive = new TwoThreadLive();
        twoThreadLive.setName("Thread");
        System.out.println("before start(), tt.isAlive()=" + twoThreadLive.isAlive());
        twoThreadLive.start();
        System.out.println("just after start(), tt.isAlive()=" + twoThreadLive.isAlive());

        for (int i = 0; i < 10; i++) {
            twoThreadLive.printMsg();
        }

    }

    private static class TwoThreadLive extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                printMsg();
            }
        }

        private void printMsg() {
            Thread thread = Thread.currentThread();
            String name = thread.getName();
            System.out.println("Name " + name);
        }
    }
}
