package OneToMany_uni_pesm27.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import OneToMany_uni_pesm27.dto.Bank;
import OneToMany_uni_pesm27.dto.Customer;

public class BankDao {
	
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("rajath").createEntityManager();
	}
	
	public void savaBank(Bank bank)
	{
	 EntityManager entityManager=getEntityManager();
	 EntityTransaction entityTransaction=entityManager.getTransaction();
	 entityTransaction.begin();
	 List<Customer>customers=bank.getCustomers();
	 for(Customer customer:customers)
	 {
		 entityManager.persist(customer);
	 }
	 entityManager.persist(bank);
		entityTransaction.commit();
		
	}
	
	public void  updateBank(int id,Bank bank)
	{
		EntityManager entityManager=getEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 Bank receiverdBank =entityManager.find(Bank.class, id);
		  if(receiverdBank !=null)
		  {
			bank.setId(id);  
			bank.setCustomers(receiverdBank.getCustomers());
			entityTransaction.begin();
			entityManager.merge(bank);
			entityTransaction.commit();
			System.out.println("Update Successfull!!!");
			  
		  }
		  else {
				System.out.println("The bank doesn't exist!");
		}
	}
	
	public void deleteBank(int id)
	{
		EntityManager entityManager=getEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 Bank bank =entityManager.find(Bank.class, id);
		 entityTransaction.begin();
			entityManager.remove(bank);
			entityTransaction.commit();
			System.out.println("Delete Successfull!!!");
			  
	}
	public Bank getBankById(int id)
	{
		EntityManager entityManager=getEntityManager();
		 Bank bank =entityManager.find(Bank.class, id);
		 return bank;
	}
	
//	public List<Bank> getAllBank()
//	{
//		EntityManager entityManager=getEntityManager();
//		Query query= (Query) entityManager.createQuery("SELECT c FROM Company c");
//		List<Bank>list=query.getResultList();
//		return list;
//		
//	}
//	

}
