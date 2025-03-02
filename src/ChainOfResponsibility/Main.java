package ChainOfResponsibility;

import ChainOfResponsibility.model.LoanRequest;
import ChainOfResponsibility.service.LoanApprovalService;

public class Main {
    public static void main(String[] args) {
        LoanApprovalService service = new LoanApprovalService();

        // Create loan requests
        LoanRequest request1 = new LoanRequest(5000);
        LoanRequest request2 = new LoanRequest(25000);
        LoanRequest request3 = new LoanRequest(75000);
        LoanRequest request4 = new LoanRequest(200000);

        // Process loan requests
        service.processLoanRequest(request1);
        service.processLoanRequest(request2);
        service.processLoanRequest(request3);
        service.processLoanRequest(request4);

    }
}
