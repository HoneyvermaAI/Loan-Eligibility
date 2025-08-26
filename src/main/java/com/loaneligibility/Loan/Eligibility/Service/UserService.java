package com.loaneligibility.Loan.Eligibility.Service;
import com.loaneligibility.Loan.Eligibility.Model.User;
import com.loaneligibility.Loan.Eligibility.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import lombok.Getter;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    // To Register New User--->
    public User registerUser(User user){
        return userRepository.save(user);
    }
    // To Get all users
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    // Find User by ID--->
    public Optional<User> findById(String id){
        return userRepository.findById(id);
    }
    // Login by UserId and Password--->
    public User loginUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    // For deleting the user by ID
    public void deleteUserById(String id){
        userRepository.deleteById(id);
    }
}
