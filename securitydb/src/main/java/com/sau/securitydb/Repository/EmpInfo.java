package com.sau.securitydb.Repository;

import com.sau.securitydb.Model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpInfo extends JpaRepository<Emp, Integer> {
}
