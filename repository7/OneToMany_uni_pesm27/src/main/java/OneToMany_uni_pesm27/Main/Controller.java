package OneToMany_uni_pesm27.Main;

import java.util.ArrayList;
import java.util.List;

import OneToMany_uni_pesm27.dao.BankDao;
import OneToMany_uni_pesm27.dto.Bank;
import OneToMany_uni_pesm27.dto.Customer;

public class Controller {
	
	public static void main(String[] args) {
		
		
		Customer C1=new Customer();
		C1.setName("Shubham");
		C1.setA_c(3828902882982020l);
		C1.setAddress("Jalgaon");
		
		Customer C2=new Customer();
		C2.setName("Arjuna");
		C2.setA_c(382832882982020l);
		C2.setAddress("Krurushetra");
		
		
		Customer C3=new Customer();
		C3.setName("Mahesh");
		C3.setA_c(382890288292020l);
		C3.setAddress("Pahur");
		   
		
		List<Customer>customers=new ArrayList<Customer>();
		customers.add(C1);
		customers.add(C2);
		customers.add(C3);
		
		
		Bank bank=new Bank();
		bank.setName("Union_Bank");
		bank.setHelpnumber(90383929839299l);
		bank.setCustomers(customers);
		
		
		BankDao Dao=new BankDao();
		//Dao.savaBank(bank);
	//	Dao.updateBank(3, bank);
		//Dao.deleteBank(3);
		Dao.getBankById(3);
	}

}
