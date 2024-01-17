package org.example;

import org.example.Observable.IphoneObservableImpl;
import org.example.Observable.StocksObservable;
import org.example.Observer.EmailAlertObserverImpl;
import org.example.Observer.MobileAlertObserverImpl;
import org.example.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("suyash@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("mishra@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("sm@gmail.com",iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);
    }
}
/*
 Observable:
    - State change
    - Observable Interface ,listOfObservers ,  add(ObserverInterface)(AKA Register/registration),
      remove(ObserverInterface), notify(l   istOfObservers),
    - ObserableConcreateClass(is a relationship) , add(observer),remove(observer),
        notify : iterate in listOfObservers, then call obj.update()
    - setDate(newData) oldDate = newData , then call notify(observalble)
 Observer:
    - Can be multiple observer
    - Observer interface , update
    - ObserverConcreteClass , update(obj)
 */