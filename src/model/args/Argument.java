package model.args;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Argument argument = (Argument) o;
        return value == argument.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
