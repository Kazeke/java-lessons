package com.javalessons.controlstatement;

public class WhileDo {

    public static void main(String[] args) {

        int finalBallance = 100000;
        double currentBallans = 0;
        int payment = 1000;
        int years = 0;
        double interestRate = 0.1;

        do {
            currentBallans += payment;
            currentBallans = currentBallans + currentBallans * interestRate;
            years++;
            System.out.println("Year " + years + " - " + currentBallans);
        } while (currentBallans < finalBallance && years <15);


    }
}
