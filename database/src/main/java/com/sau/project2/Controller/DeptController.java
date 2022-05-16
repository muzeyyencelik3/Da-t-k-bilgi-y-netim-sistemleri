package com.sau.project2.Controller;

import com.sau.project2.Model.Dept;
import com.sau.project2.Repository.DeptInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    private DeptInfo deptInfo;

    public DeptController(DeptInfo deptInfo) {
        this.deptInfo = deptInfo;
    }

    @GetMapping("/_department")
    public String getDepartment(Model model){
        List<Dept> dList = deptInfo.findAll();

        model.addAttribute("dList", dList);
        return "_department";
    }
}
