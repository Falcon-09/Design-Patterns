package ChainOfResponsibility.service;

import ChainOfResponsibility.handler.*;
import ChainOfResponsibility.model.LoanRequest;

public class LoanApprovalService {
    private LoanHandler chain;

    public LoanApprovalService() {
        // Build the chain dynamically
        this.chain = new LoanHandlerChainBuilder()
                .addHandler(new ManagerHandler())
                .addHandler(new DirectorHandler())
                .addHandler(new VicePresidentHandler())
                .addHandler(new PresidentHandler())
                .build();
    }

    public void processLoanRequest(LoanRequest request) {
        chain.handleRequest(request);
    }
}
