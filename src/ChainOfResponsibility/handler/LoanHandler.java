package ChainOfResponsibility.handler;

import ChainOfResponsibility.model.LoanRequest;

public interface LoanHandler {
    void setNextHandler(LoanHandler nextHandler);
    void handleRequest(LoanRequest request);
}
