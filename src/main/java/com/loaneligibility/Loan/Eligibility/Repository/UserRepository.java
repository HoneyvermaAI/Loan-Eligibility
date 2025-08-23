package com.loaneligibility.Loan.Eligibility.Repository;

import com.loaneligibility.Loan.Eligibility.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository <User, String>{

    Optional<User> findByEmail(String email);

    //Optional has been used to be safe from null pointer exception--->
}
