package com.loaneligibility.Loan.Eligibility.Model;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "users")
public class User {
    @Getter
    @Id
    private String id;
    private String email;
    private String password;
    private String role;

    public User(){}
    public User(String id, String password, String role, String email){
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
    }

}
