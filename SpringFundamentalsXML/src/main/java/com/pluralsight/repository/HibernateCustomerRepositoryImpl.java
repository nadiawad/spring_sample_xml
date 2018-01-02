package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nadi on 20/12/2017.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    //@Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Customer> findAll(){
        System.out.println("DB Username is: "+dbUsername);
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Nadi");
        customer.setLastName("Awad");

        customers.add(customer);

        return customers;
    }
}
