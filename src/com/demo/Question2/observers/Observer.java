package com.demo.Question2.observers;

import com.demo.Question2.subjects.Stock;

public interface Observer {
    void update(Stock stock);
}
