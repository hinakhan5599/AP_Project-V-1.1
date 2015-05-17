package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "boards")
@Inheritance(strategy = InheritanceType.JOINED)  
public class boards {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	
	@Column(name = "bid")  
	private int bid;
	
	@Column(name = "name")  
	private String name;

public Integer getId(){return bid;}
public String getBoardName() {return name;}
public void setBoardName(String lName) {this.name = lName;}

}
