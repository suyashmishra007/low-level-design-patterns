package org.example.Observable;

import org.example.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public  int stockCount = 0 ;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer : observerList ){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAmount) {
        if(stockCount == 0){
            notifySubscriber();
        }
        stockCount += newStockAmount;
    }

    @Override
    public int getStockAmount() {
        return stockCount;
    }
}
