package org.example;

public class TurnOffAcCommand implements ICommand{
    AirConditioner ac;
    TurnOffAcCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
