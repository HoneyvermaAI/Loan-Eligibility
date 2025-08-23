package com.loaneligibility.Loan.Eligibility.Model;
// These are the important libraries for not write manual no argument constructor and parameter constructor also for the getter
// and setter. Lombok dependency does it itself------>
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter // This is for the getter
@Setter // This is for the setter
@NoArgsConstructor // This is for the no argument constructor
@AllArgsConstructor // This is for the parameter constructor

@Document(collection = "loans")
public class LoanApplication {
    @Id
    private String id;
    @Getter
    private String userid;
    private String name;
    private double income;
    private double amount;
    private int tenure;
    private  int creditScore;
    private String statues;
    private String prediction;
}
