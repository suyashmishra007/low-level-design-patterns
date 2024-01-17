package org.example.Observable;

import org.example.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscriber();
    void setStockCount(int newStockAmount);
    int getStockAmount();
}
