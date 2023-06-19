package OneToMany_uni_pesm27.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private long Helpnumber;
	
	@OneToMany
	private List<Customer>customers;

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

	public long getHelpnumber() {
		return Helpnumber;
	}

	public void setHelpnumber(long helpnumber) {
		Helpnumber = helpnumber;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
