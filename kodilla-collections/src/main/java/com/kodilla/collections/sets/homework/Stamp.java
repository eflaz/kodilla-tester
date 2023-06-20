package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampSize;
    private String stampedStamp;

    public Stamp(String stampName, double stampSize, String stampedStamp) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stampedStamp = stampedStamp;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampSize() {
        return stampSize;
    }

    public String getStampedStamp() {
        return stampedStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampSize, stampSize) == 0 && Objects.equals(stampName, stamp.stampName) && Objects.equals(stampedStamp, stamp.stampedStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stampedStamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize=" + stampSize +
                ", stampedStamp='" + stampedStamp + '\'' +
                '}';
    }
}
