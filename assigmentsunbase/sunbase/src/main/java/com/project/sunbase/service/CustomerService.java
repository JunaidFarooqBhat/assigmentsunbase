package com.project.sunbase.service;

import com.project.sunbase.model.Customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Customer createCustomer(Customer customer);

    Customer updateCustomer(Integer id, Customer customer);

    Page<Customer> getAllCustomers(Pageable pageable, String keyword);

    Customer getCustomerById(Integer id);

    String deleteCustomer(Integer id);
}
