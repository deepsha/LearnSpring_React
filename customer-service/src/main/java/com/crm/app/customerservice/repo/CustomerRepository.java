package com.crm.app.customerservice.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.app.customerservice.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	
}
