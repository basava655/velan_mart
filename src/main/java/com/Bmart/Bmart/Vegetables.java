package com.Bmart.Bmart;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vegetables")
public class Vegetables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="vegetable_Name")
    private String vegetablename ;
    @Column(name="Farmer_Name")
    private String farmername ;
    @Column(name="Harvest_Date")
    private String harvestdate ;
    @Column(name="Location")
    private String location ;
    @Column(name="Weight")
    private String weight ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVegetablename() {
		return vegetablename;
	}
	public void setVegetablename(String vegetablename) {
		this.vegetablename = vegetablename;
	}
	public String getFarmername() {
		return farmername;
	}
	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}
	public String getHarvestdate() {
		return harvestdate;
	}
	public void setHarvestdate(String harvestdate) {
		this.harvestdate = harvestdate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
    
  
    
    
    
    
}


