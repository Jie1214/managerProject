package com.czj.terminal.pojo;

public class Index extends Number{

    private long num;

    public Index(){}

    @Override
    public int intValue() {
        return (int)num;
    }

    @Override
    public long longValue() {
        return num;
    }

    @Override
    public float floatValue() {
        return num;
    }

    @Override
    public double doubleValue() {
        return num;
    }

    public Index(int num){this.num = num;}

    public void add() {
        add(1);
    }

    public void add(int n) {
        num += + n;
    }

    public void del() {
        del(1);
    }

    public void del(int n) {
        num -= n;
    }

    public boolean equals(Index index) {
        return this.equals(index);
    }

    @Override
    public String toString() {
        return num + "";
    }
}
