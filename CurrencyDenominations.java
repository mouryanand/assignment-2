package com.greatlearning.iitr.dsa.labsession2;

import java.util.*;
import java.lang.*;

public class CurrencyDenominations{

    Scanner sc = new Scanner(System.in);
    public void countCurrency()
    {
        System.out.println("enter the size of currency denominations ");
        int currencyDenominationSize = sc.nextInt();
        System.out.println("enter the currency denominations value");
        ArrayList<Integer> notesArrayList = new ArrayList<>();
        for (int i = 0; i < currencyDenominationSize; i++) {
            notesArrayList.add(sc.nextInt());
        }
        Collections.sort(notesArrayList,Collections.reverseOrder());
        int[] notes = new int[currencyDenominationSize];
        for (int i = 0; i < notes.length; i++) {
            notes[i] = notesArrayList.get(i);
        }


        int[] noteCounter = new int[currencyDenominationSize];
        System.out.println("enter the amount you want to pay ");
        int amount = sc.nextInt();



        // count notes using Greedy approach
        for (int i = 0; i < noteCounter.length; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        // Print notes
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i = 0; i < notes.length; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }

    // driver function
    public static void main(String argc[]){
        CurrencyDenominations currencyDenominations = new CurrencyDenominations();

        currencyDenominations.countCurrency();
    }

}
