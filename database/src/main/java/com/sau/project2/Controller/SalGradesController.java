package com.sau.project2.Controller;

import com.sau.project2.Model.Salgrade;
import com.sau.project2.Repository.SalgradeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SalGradesController {

    @Autowired
    private SalgradeInfo salgradeInfo;

    public SalGradesController(SalgradeInfo salgradeInfo) {
        this.salgradeInfo = salgradeInfo;
    }

    @GetMapping("/_salgrades")
    public String getSalGrade(Model model){
        List<Salgrade> sList = salgradeInfo.findAll();

        model.addAttribute("sList", sList);
        return "_salgrades";
    }
}
