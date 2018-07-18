package command;

/**
 * 用来执行具体的命令
 */
public class ConcreteCommandOpen implements Command {

    private Door door;

    public ConcreteCommandOpen(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        //执行请求
        door.on();
    }
}
