package com.example.demo;

import java.util.Objects;

public class CatFact {
    String fact;
    int length;

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "CatFact{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CatFact)) return false;
        CatFact catFact = (CatFact) o;
        return getLength() == catFact.getLength() && getFact().equals(catFact.getFact());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFact(), getLength());
    }

}
