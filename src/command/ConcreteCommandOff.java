package command;

/**
 * 用来执行具体的命令
 */
public class ConcreteCommandOff implements Command {

    private Door door;

    public ConcreteCommandOff(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.off();
    }
}
