package com.sau.project2.Repository;

import com.sau.project2.Model.Bonus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BonusInfo extends JpaRepository<Bonus, Integer> {
}
