package com.loaneligibility.Loan.Eligibility.Repository;

import com.loaneligibility.Loan.Eligibility.Model.LoanApplication;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LoanApplicationRepository extends MongoRepository<LoanApplication,String> {
    List<LoanApplication> findByUserid (String userId);
    // To find the user by id.
    List<LoanApplication> findByStatues (String statues);
    // To Check Statues of the loan Weather its pending, approved and rejected.
}
