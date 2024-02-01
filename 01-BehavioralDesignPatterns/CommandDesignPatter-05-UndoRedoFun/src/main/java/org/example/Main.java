package org.example;

public class Main {
    public static void main(String[] args) {
        /* Problem with above implementation:
            -> Lack of abstraction : Today , process of turning Ac is simple , but if there are more steps  client has to aware  all of that , which is not good.
            -> Undo/Redo Functionality : What if i want to implement the undo/redo capability. How it will be handled.
            -> Difficulty in Code Maintainable : What if in the future , we have to support more commands for more devices example bulb.

            It divides the logic :
                -> Receiver
                -> Invoker
                -> Command
        */

        AirConditioner airConditioner = new AirConditioner();

        MyRemoteControl remoteObj = new MyRemoteControl();

        // cretae the command and press the button
        remoteObj.setCommand(new TurnOnAcCommand(airConditioner));
        remoteObj.setCommand(new TurnOnAcCommand(airConditioner));
        remoteObj.pressButton();

        remoteObj.undo();
    }
}