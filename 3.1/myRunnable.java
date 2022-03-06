package com.thread;


public class myRunnable implements Runnable {
        public static int myCount = 0;
        public myRunnable(){
         
      }
    public void run() {
        while(myRunnable.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++myRunnable.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        myRunnable mrt = new myRunnable();
        Thread t = new Thread(mrt);
        t.start();
        while(myRunnable.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++myRunnable.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
