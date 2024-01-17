package org.example.Observer;

import org.example.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId,"product is now avaiable");
    }

    private void sendMail(String emailId, String message) {
        // send the actual email to the end user.
        System.out.println("Email sent to : "+ emailId + " is " + message);
    }
}
