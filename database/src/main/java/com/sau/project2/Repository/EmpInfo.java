package com.sau.project2.Repository;

import com.sau.project2.Model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpInfo extends JpaRepository<Emp, Integer> {
}
