package chainofresponsibility;

public class test {
	public static void main(String[] args) {
		Handler handlerB = new ConcreteHandlerB();
		Handler handlerA = new ConcreteHandlerA(handlerB);
		Request requestA = new Request(RequestType.type1,"RequestA");
		handlerA.handlerRequest(requestA);
		Request requestB = new Request(RequestType.type2,"RequestB");
		handlerA.handlerRequest(requestB);
		handlerB.handlerRequest(requestB);
	}
}
