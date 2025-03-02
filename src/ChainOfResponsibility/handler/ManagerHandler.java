package ChainOfResponsibility.handler;

import ChainOfResponsibility.model.LoanRequest;

public class ManagerHandler implements LoanHandler{
    private LoanHandler nextHandler;

    @Override
    public void setNextHandler(LoanHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(LoanRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("Manager approves the loan of $" + request.getAmount());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
