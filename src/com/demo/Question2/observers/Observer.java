package com.demo.Question2.observers;

public interface Observer {
    public String getName();
    public void setName(String name);
    public void update(String stockName, double percent, double price);
}
