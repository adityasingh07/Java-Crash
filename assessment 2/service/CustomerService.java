package com.mydemos.service;

import com.mydemos.dao.*;


import com.mydemos.dao.CustomerDao;
import com.mydemos.pojo.Customer;

//import demo.student.stud;

public class CustomerService {
		public static void main(String[] args){
			Customer cust = new Customer("Aditya","Singh", "Addr 1");
			CustomerDao dao = new CustomerDao();
			dao.setId(cust);
		}
}
