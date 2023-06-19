package OneToMany_uni_pesm27.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getA_c() {
		return A_c;
	}
	public void setA_c(long a_c) {
		A_c = a_c;
	}
	private long  A_c;
	
}
