package com.jay;
public class Racer implements Runnable{
    public static String winner;
    public void run() {
        for (int i=1;i<=100;i++) {
            System.out.println("Distance covered by "+Thread.currentThread().getName() + " is "+i+ " meters");
            boolean isRaceWon = this.isRaceWon(i);
            if(isRaceWon){
                break;
            }
        }
    }

    private boolean isRaceWon(int distance){
        boolean isRaceWon = false;
        if((Racer.winner==null) && distance==100){
            String winnerName = Thread.currentThread().getName();
            Racer.winner = winnerName;
            System.out.println("Winner is "+ Racer.winner);
            isRaceWon = true;
        }else if(Racer.winner==null){
            isRaceWon = false;
        }else if(Racer.winner!=null){
            isRaceWon = true;
        }
        return isRaceWon;
    }
}