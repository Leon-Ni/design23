package chainofresponsibility;

public class ConcreteHandlerB extends Handler {

	//设置和获取后继处理器的方法，具体的请求处理方法
	@Override
	void handlerRequest(Request request) {
		if (request.getType() == RequestType.type2) {
			System.out.println(request.getName() + " is handle by ConcreteHandlerB");
			return;
		}else {
			System.out.println("B@@@@@@@@@@B");
		}
		if (handler != null){
			handler.handlerRequest(request);
		}
	}
}
