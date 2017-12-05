package jp.ac.uryukyu.ie.ex3.pair07;

import jp.ac.uryukyu.ie.ex3.pair07.*;

public class Main {
    public static void main(String[] args){
        ExDice exdice = new ExDice(5,7);
        for(int i=0; i<10; i++) {
            exdice.play();
            System.out.println(exdice.getValue());
        }
    }
}
