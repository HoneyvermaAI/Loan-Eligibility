package com.loaneligibility.Loan.Eligibility.Service;

import com.loaneligibility.Loan.Eligibility.Model.LoanApplication;
import com.loaneligibility.Loan.Eligibility.Repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanApplicationService {

    @Autowired
    private LoanApplicationRepository loanApplicationRepository;

    // Apply for Loan
    public LoanApplication applyLoan(LoanApplication loan) {
        return loanApplicationRepository.save(loan);
    }

    //  Get all Loan Applications
    public List<LoanApplication> getAllLoans() {
        return loanApplicationRepository.findAll();
    }

    // Get Loan by ID
    public Optional<LoanApplication> getLoanById(String id) {
        return loanApplicationRepository.findById(id);
    }

    // Get Loans by UserId
    public List<LoanApplication> getLoansByUserId(String userId) {
        return loanApplicationRepository.findByUserid(userId);
    }

    // Update Loan Status (Admin approves/rejects)
    public LoanApplication updateLoanStatus(String loanId, String status) {
        Optional<LoanApplication> loanOptional = loanApplicationRepository.findById(loanId);
        if (loanOptional.isPresent()) {
            LoanApplication loan = loanOptional.get();
            loan.setStatues(status); // status update
            return loanApplicationRepository.save(loan);
        }
        return null;
    }

    // Delete Loan by ID
    public void deleteLoan(String id) {
        loanApplicationRepository.deleteById(id);
    }
}
