package com.Bmart.Bmart;

import com.Bmart.Bmart.User;
import com.Bmart.Bmart.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // POST Mapping for signup
    @PostMapping("/signup")
    public ResponseEntity<User> signupUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }
    
    @PostMapping("/signupAuth")
    public ResponseEntity<UserAuth> signupUser(@RequestBody UserAuth userauth) {
        UserAuth savedUser = userService.saveUserAuth(userauth);
        return ResponseEntity.ok(savedUser);
    }
    
    @PostMapping("/postvegetable")
    public ResponseEntity<Vegetables> vegetable(@RequestBody Vegetables vegetables) {
        Vegetables savedvegetables = userService.saveVegetables(vegetables);
        return ResponseEntity.ok(savedvegetables);
    }
    
    @GetMapping("/getvegetables")
    public ResponseEntity<List<Vegetables>> getAllVegetables() {
        List<Vegetables> vegetablesList = userService.getAllVegetables();
        return ResponseEntity.ok(vegetablesList);
    }
    
    
    @GetMapping("/getvegetables/{id}")
    public ResponseEntity<Vegetables> getVegetableById(@PathVariable Long id) {
        Vegetables vegetable = userService.getVegetableById(id);
        if (vegetable != null) {
            return ResponseEntity.ok(vegetable);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    
    @DeleteMapping("/vegetable/{id}")
    public ResponseEntity<Void> deleteVegetable(@PathVariable Long id) {
        userService.deleteVegetableById(id);
        return ResponseEntity.noContent().build();
    }
    
    @PostMapping("/postfruits")
    public ResponseEntity<Fruits> fruit(@RequestBody Fruits fruits) {
    	Fruits savedfruits = userService.saveFruits(fruits);
        return ResponseEntity.ok(savedfruits);
    }
    
    @GetMapping("/getfruits")
    public ResponseEntity<List<Fruits>> getAllFruits() {
        List<Fruits> fruitsList = userService.getAllFruits();
        return ResponseEntity.ok(fruitsList);
    }
    
    @GetMapping("/getfruits/{id}")
    public ResponseEntity<Fruits> getFruitById(@PathVariable Long id) {
        Fruits fruit = userService.getFruitById(id);
        if (fruit != null) {
            return ResponseEntity.ok(fruit);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    
    @DeleteMapping("/deletfruits/{id}")
    public ResponseEntity<Void> deletefruit(@PathVariable Long id) {
        userService.deleteFruitById(id);
        return ResponseEntity.noContent().build();
    }
   

    
}
