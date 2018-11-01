package com.crm.pharma.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.pharma.entity.Employee;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}