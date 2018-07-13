package command;

/**
 * 命令模式:对命令请求者（Invoker）和命令实现者（Receiver）的解耦，方便对命令进行各种控制。
 *
 * 1. 命令模式是通过命令发送者和命令执行者的解耦来完成对命令的具体控制的。
 * 2. 命令模式是对功能方法的抽象，并不是对对象的抽象。
 * 3. 命令模式是将功能提升到对象来操作，以便对多个功能进行一系列的处理以及封装。
 */
public class test {
    public static void main(String[] args) {
        //命令调用者
        Invoker invoker = new Invoker();
        //命令实现者
        Door door = new Door();
        ConcreteCommandOpen open = new ConcreteCommandOpen(door);
        ConcreteCommandOff off = new ConcreteCommandOff(door);
        invoker.setCommand(off);
        invoker.RunCommand();
        invoker.setCommand(open);
        invoker.RunCommand();
    }

}
