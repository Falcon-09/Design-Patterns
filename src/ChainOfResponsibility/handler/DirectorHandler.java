package ChainOfResponsibility.handler;

import ChainOfResponsibility.model.LoanRequest;

public class DirectorHandler implements LoanHandler{
    private LoanHandler nextHandler;

    @Override
    public void setNextHandler(LoanHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(LoanRequest request) {
        if (request.getAmount() <= 50000) {
            System.out.println("Director approves the loan of $" + request.getAmount());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
