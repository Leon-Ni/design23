package chainofresponsibility;

public abstract class Handler {
	protected Handler handler;

	public Handler getHandler() {
		return handler;
	}

	//一个后继处理器
	abstract void handlerRequest(Request request);

}
