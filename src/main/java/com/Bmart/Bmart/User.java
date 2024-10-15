package com.Bmart.Bmart;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "velan_registration")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name= "type")
    private String type;
   @Column(name= "product_name")
    	private String name;
   @Column(name= "pincode")
        private String pincode;
   @Column(name= "district")
        private String district;
   @Column(name= "mobile_number")
        private String mobileNumber;
   @Column(name= "email")
        private String email;
   @Column(name= "headcount")
        private int headcount;
   @Column(name= "weight_of _vegetables")
        private double weightOfVegetables;
   @Column(name= "weight_of _fruits")
        private double weightOfFruits;
   @Column(name= "state")
    private String state;
	
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getHeadcount() {
		return headcount;
	}
	public void setHeadcount(int headcount) {
		this.headcount = headcount;
	}
	public double getWeightOfVegetables() {
		return weightOfVegetables;
	}
	public void setWeightOfVegetables(double weightOfVegetables) {
		this.weightOfVegetables = weightOfVegetables;
	}
	public double getWeightOfFruits() {
		return weightOfFruits;
	}
	public void setWeightOfFruits(double weightOfFruits) {
		this.weightOfFruits = weightOfFruits;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
    
    
    
}
