package com.example.demo.jparepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Customer;

import jakarta.transaction.Transactional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{
	
	// tricking jap into writing crt query via the crt method name
	
	 // Find customers with balance greater than a given amount
    List<Customer> findByBalanceGreaterThan(double amount);
    
    // ------------------------------- jpaql ----------------------------------------------------------------------------
    @Query("select c from Customer c")
    List<Customer> findAllCustomer();
    
    @Query("select c from Customer c where c.actno = :actno")
    public Customer	findByActJPQL(@Param("actno") int actno);
    
    @Query("select c from Customer c where c.name=:name")
	public Customer findByNameJPQL(@Param("name") String name);
    	
	@Transactional
	@Modifying
	@Query("update Customer c set c.balance=c.balance+ :amt  where c.actno=:actno")
    public int deposit1(@Param("actno") int actno, @Param("amt")double amt);
	
	@Transactional
	@Modifying
	@Query("UPDATE Customer c SET c.balance = c.balance - :amt WHERE c.actno = :actno AND c.balance - :amt >= 1000")
	public int withdraw1(@Param("actno") int actno, @Param("amt") double amt);
	
	@Transactional
	@Modifying
	@Query("delete Customer c  WHERE c.actno = :actno")
	public int deletebyId1(@Param("actno") int actno);

//	-------------------------------------------- native -------------------------------------------------
 
	@Query(value="select * from customer",nativeQuery=true)
    List<Customer> findAllCustomers();
	
	@Query(value="select * from customer where actno = :actno",nativeQuery=true)
    public Customer	findByActNQL(@Param("actno") int actno);
	
	@Transactional
	@Modifying
	@Query(value="update customer set balance=balance+ :amt  where actno=:actno",nativeQuery=true)
    public int depositNQL(@Param("actno") int actno, @Param("amt")double amt);
	
	@Transactional
	@Modifying
	@Query("delete from customer WHERE actno = :actno")
	public int deletebyIdNQL(@Param("actno") int actno);
}




//package com.example.demo.JpaRespo;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.Entity.Cutomer;
//
//
//
////crud    jpa   
//@Repository
//public interface CustomerRepo  extends  JpaRepository<Cutomer, Integer> {
//
//}