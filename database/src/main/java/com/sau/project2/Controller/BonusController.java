package com.sau.project2.Controller;

import com.sau.project2.Model.Bonus;
import com.sau.project2.Model.Dept;
import com.sau.project2.Repository.BonusInfo;
import com.sau.project2.Repository.DeptInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BonusController {
    @Autowired
    private BonusInfo bonusInfo;

    public BonusController(BonusInfo deptInfo) {
        this.bonusInfo = bonusInfo;
    }

    @GetMapping("/_bonus")
    public String getBonus(Model model){
        List<Bonus> bList = bonusInfo.findAll();

        model.addAttribute("bList", bList);
        return "_bonus";
    }
}
