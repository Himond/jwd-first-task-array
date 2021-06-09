package by.training.array.entity;

import java.util.Arrays;

public class ArrayMod {

    private double[] array;

    public ArrayMod() {
        this.array = new double[]{};
    }

    public ArrayMod(double[] array) {
        this.array = array;
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }

    public int getLength() {
        return this.array.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayMod arrayMod = (ArrayMod) o;
        return Arrays.equals(array, arrayMod.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "ArrayMod{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
