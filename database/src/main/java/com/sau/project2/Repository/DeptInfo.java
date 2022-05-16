package com.sau.project2.Repository;

import com.sau.project2.Model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptInfo extends JpaRepository<Dept, Integer> {

}
