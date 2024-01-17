package org.example.Observer;

import org.example.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName,"product is now avaiable");
    }

    private void sendMessageOnMobile(String userName, String message) {
        System.out.println("Notification sent to : "+ userName + " is " + message);
    }


}
