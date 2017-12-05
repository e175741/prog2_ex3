package jp.ac.uryukyu.ie.ex3.pair07;

public class Dice {
    private int value;

    public Dice(){
        play();
    }

    public int getValue(){ return value; }

    public void setValue(int value){ this.value = value; }

    public void play(){
        value = (int)(Math.random()*6) + 1;
    }
}
