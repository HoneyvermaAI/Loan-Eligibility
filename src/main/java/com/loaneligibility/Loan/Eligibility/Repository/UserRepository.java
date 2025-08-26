package com.loaneligibility.Loan.Eligibility.Repository;

import com.loaneligibility.Loan.Eligibility.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User, String>{

    User findByEmail(String email);

    //Optional has been used to be safe from null pointer exception--->
}
