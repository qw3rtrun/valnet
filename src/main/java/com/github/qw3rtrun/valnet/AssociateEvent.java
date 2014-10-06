package com.github.qw3rtrun.valnet;

/**
 * Association event.
 * <p>
 * Created by qw3rtrun on 06.10.14.
 */
public class AssociateEvent {

    private final String name;
    private final double value;

    public AssociateEvent(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssociateEvent that = (AssociateEvent) o;

        if (Double.compare(that.value, value) != 0) return false;
        return !(name != null ? !name.equals(that.name) : that.name != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "AssociateEvent{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
