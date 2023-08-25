package designpattern.command;

public class Invoker {
    Command command;
    Invoker(){}
    void execute(Command command){
        command.executeCommand();
    }
}
