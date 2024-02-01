package org.example;

public class TurnOnAcCommand implements  ICommand{

    AirConditioner ac;
    TurnOnAcCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
