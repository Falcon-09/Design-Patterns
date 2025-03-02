package ChainOfResponsibility.handler;

public class LoanHandlerChainBuilder {
    private LoanHandler firstHandler;
    private LoanHandler currentHandler;

    public LoanHandlerChainBuilder addHandler(LoanHandler handler) {
        if (firstHandler == null) {
            firstHandler = handler; // start point of the chain
        } else {
            currentHandler.setNextHandler(handler);
        }
        currentHandler = handler;
        return this;
    }

    public LoanHandler build() {
        return firstHandler; // start point of the chain
    }
}
