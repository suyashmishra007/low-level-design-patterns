package org.example;

import java.util.Stack;

public class MyRemoteControl {
    Stack<ICommand> commandStack = new Stack<>();
    ICommand command;
    MyRemoteControl(){}

    public void setCommand(ICommand command){
        this.command  = command;
    }
    public void pressButton(){
        command.execute();
        commandStack.add(command);
    }

    public void undo(){
    if(!commandStack.isEmpty()){
        ICommand lastCommand = commandStack.pop();
        lastCommand.undo();
    }
    }
}
