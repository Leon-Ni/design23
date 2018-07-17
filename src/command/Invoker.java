package command;

/**
 * 调用命令
 */
public class Invoker {
	private Command command;

	//设置命令
	public void setCommand(Command command) {
		this.command = command;
	}

	//执行命令
	public void RunCommand() {
		command.execute();
	}
}
