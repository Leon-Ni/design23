package chainofresponsibility;

public class ConcreteHandlerA extends Handler {
	public ConcreteHandlerA(Handler handler){
		this.handler = handler;
	}

	//设置和获取后继处理器的方法，具体的请求处理方法
	@Override
	void handlerRequest(Request request) {
		if (request.getType() == RequestType.type1) {
			System.out.println(request.getName() + " is handle by ConcreteHandlerA");
			return;
		} else {
			System.out.println("A@@@@@@@@@@A");
		}
		if (handler != null) {
			System.out.println("handler:"+handler);
			handler.handlerRequest(request);
		}
	}
}
