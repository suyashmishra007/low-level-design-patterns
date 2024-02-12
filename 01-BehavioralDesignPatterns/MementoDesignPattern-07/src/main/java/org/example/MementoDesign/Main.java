package org.example.MementoDesign;

public class Main {
    public static void main(String[] args) {
        /*
        -> Provides the ability to revert the object to a previous state i.e UNDO capability. And it does not expose the object internal implementation.

        -> AKA snapshot design pattern.
        */

        ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();
        ConfigurationOriginator originatorObject = new ConfigurationOriginator(5,10);

        // Save it
        ConfigurationMemento snapshot1 = originatorObject.createMemento();

        // add it to the history
        careTakerObject.addMemento(snapshot1);

        //originator changing to new state
        originatorObject.setHeight(25);
        originatorObject.setWidth(35);

        // Save it
        ConfigurationMemento snapshot2 = originatorObject.createMemento();

        // add it to the history
        careTakerObject.addMemento(snapshot2);

        //originator changing to new state
//        originatorObject.setHeight(55);
//        originatorObject.setWidth(60);

        // Save it
//        ConfigurationMemento snapshot3 = originatorObject.createMemento();

        // add it to the history
        // careTakerObject.addMemento(snapshot3);

        // UNDO
        ConfigurationMemento restoredMemento = careTakerObject.undo();
        originatorObject.restoreMemento(restoredMemento);

        System.out.println("Height is: " + originatorObject.getHeight() + " , Width is : " + originatorObject.getWidth());
    }
}
