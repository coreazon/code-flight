package model.args;

public class Argument {

    //value goes from min to max | max+1=min; min-1=max

    private int value;

    public Argument(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void add(Argument other) {
        //TODO: handling max+1/min-1
        this.value += other.getValue();
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
