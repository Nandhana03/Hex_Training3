package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.jparepo.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo Respo;
	public  Customer dsaveD(Customer c )
	 {
	    Customer  c1=	Respo.save(c);
	    return c1;
		
	 }
	
//	public List<Customer> getData1()
//	{
//		
//		 List l=Respo.findAll();
//		
//		 return l;
//	}
	
//	public Customer getSearch(int ac)
//	{
//		 return Respo.findById(ac).orElse(null);
//		
//	}
	
	public Customer deleteCustomer(int ac) {
	    Customer cust = Respo.findById(ac).orElse(null);
	    if (cust != null) {
	        Respo.deleteById(ac);
	    }
	    return cust;
	}
	
	 public List<Customer> getByMinBalance(double min) {
	        return Respo.findByBalanceGreaterThan(min);
	    }
	 

	 public Customer updateCustomer(int ac, double amt) {
		    Customer cust = Respo.findById(ac).orElse(null);
		    if (cust != null) {
		    	double newbal=cust.getBalance()+amt;
		        cust.setBalance(newbal);       
		        return Respo.save(cust);    
		    }
		    return cust;
		}

// ------------------ jpql --------------------------------------------------------------------
	 public List<Customer> getData1()
		{
			
			 List l=Respo.findAllCustomer();
			
			 return l;
		}
	 
	 public Customer getSearch(int ac)
		{
			 return Respo.findByActJPQL(ac);
			
		}  // --> by act
	 
//	 public Customer getSearch(String name)
//		{
//			 return Respo.findByNameJPQL(name);
//			
//		} //by name
	 
	 public int UpdateBal(int ac, double bal) {
			return Respo.deposit1(ac, bal);
		} // --> for deposit
	 
	 
//	 public int UpdateBal(int ac, double bal) {
//			return Respo.withdraw1(ac, bal);
//		} //for withdraw
	 
	 
	 public int deleteAct(int ac)
	 {
		 return Respo.deletebyId1(ac);
	 }
	
}



//package com.example.demo.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
// 
//import com.example.demo.Entity.Cutomer;
//import com.example.demo.JpaRespo.CustomerRepo;
// 
//@Service
//public class CustomerService {
//	
//	@Autowired
//	CustomerRepo Respo;
//	public  Cutomer dsaveD(Cutomer c )
//	 {
//	    Cutomer  c1=	Respo.save(c);
//	    return c1;
//		
//	 }
//	
// 
//}
 
 