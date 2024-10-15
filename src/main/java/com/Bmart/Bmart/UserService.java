package com.Bmart.Bmart;

import com.Bmart.Bmart.User;
import com.Bmart.Bmart.UserRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired 
    private UserAuthRepository userauthRepository;
    
    @Autowired
    private VegetableRepo vegetablerepo;
    
    @Autowired
    private FruitRepo fruitrepo;

    public User saveUser(User user) {
    	
        return userRepository.save(user);
    }
        
    	public List<String> validateUser(User user) {
    		// TODO Auto-generated method stub
     
    		List<String> errors = new ArrayList<String>();

    		if (!(user.getPincode().length() == 6)) {
    			errors.add(" Please enter PIN CODE with 6 DIGITS");

    		}
    		
    		if (!(user.getMobileNumber().length() == 10)) {
    			errors.add(" Please enter correct mobile number");

    		}
    		
    		if (!(user.getEmail().contains("@"))) {
    		    errors.add(" Please enter a valid emailId");
    		}
    		

    		if (!(user.getHeadcount() >= 100) ){
    		    errors.add("Headcount must be greater than 100");
    		}
    		
    		if (!(user.getWeightOfVegetables() >= 100) ){
    		    errors.add("Vegetables must be greather than 100KGs");
    		}
    		
    		if (!(user.getWeightOfFruits() >= 100) ){
    		    errors.add("Fruits must be greather than 100KGs");
    		}
    		return errors;
    }
    
    public UserAuth saveUserAuth(UserAuth userauth) {
        return userauthRepository.save(userauth);
    }
    
  
    public Vegetables saveVegetables(Vegetables vegetables) {
    	return vegetablerepo.save(vegetables);
    }
    
    public List<Vegetables> getAllVegetables() {
        return vegetablerepo.findAll(); // Assuming you have a repository for accessing the database
    }
    
    public Vegetables getVegetableById(Long id) {
        return vegetablerepo.findById(id).orElse(null); // Assuming you have a repository for accessing the database
    }

    
    public void deleteVegetableById(Long id) {
        vegetablerepo.deleteById(id); // Assuming you have a repository for accessing the database
    }
    
    
   
    
    public Fruits saveFruits(Fruits fruits) {
    	return fruitrepo.save(fruits);
    }
    
    public List<Fruits> getAllFruits() {
        return fruitrepo.findAll(); // Assuming you have a repository for accessing the database
    }
    
    public Fruits getFruitById(Long id) {
        return fruitrepo.findById(id).orElse(null); // Assuming you have a repository for accessing the database
    }

    
    public void deleteFruitById(Long id) {
        fruitrepo.deleteById(id); // Assuming you have a repository for accessing the database
    }


}
