package ChainOfResponsibility.handler;

import ChainOfResponsibility.model.LoanRequest;

public class PresidentHandler implements LoanHandler{
    @Override
    public void setNextHandler(LoanHandler nextHandler) {
        // President is the last in the chain, so no next handler.
    }

    @Override
    public void handleRequest(LoanRequest request) {
        System.out.println("President approves the loan of $" + request.getAmount());
    }
}
