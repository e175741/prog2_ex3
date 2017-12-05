package jp.ac.uryukyu.ie.ex3.pair07;

public class ExDice extends Dice {
    private int minValue;
    private int maxValue;

    public ExDice(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    public ExDice(){
        play();
    }

    @Override
    public void play(){
        int temp = (int)(Math.random() * (maxValue - minValue + 1));
        setValue(temp + minValue);
    }
}
