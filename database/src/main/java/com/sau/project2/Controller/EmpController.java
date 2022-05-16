package com.sau.project2.Controller;


import com.sau.project2.Model.Emp;
import com.sau.project2.Repository.EmpInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;
import java.util.Optional;

@Controller
public class EmpController {

    @Autowired
    private EmpInfo empInfo;


    public EmpController(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }



    @GetMapping("/")
    public String getIndex(Model model){
        List<Emp> eList = empInfo.findAll();

        model.addAttribute("eList", eList);
        return "index";
    }

    @GetMapping("/addemp")
    public String addEmp(Model model){
        Emp emp = new Emp();
        model.addAttribute("emp", emp);
        return "_addemp";
    }

    @PostMapping("/add")
    public String addEmp(Emp emp, Model model){
        empInfo.save(emp);
        return "redirect:/";
    }

    @GetMapping("/updateemployee")
    public String updateEmployee(Integer empno, Model model){
        Optional<Emp> e = empInfo.findById(empno);
        model.addAttribute("emp", e);
        return "_updateemp";
    }

    @PostMapping("/update")
    public String updateEmp(Emp emp){
        empInfo.save(emp);
        return "redirect:/";
    }

    @GetMapping("/deleteemployee")
    public String deleteEmployee(Integer empno, Model model){
        Optional<Emp> e = empInfo.findById(empno);
        model.addAttribute("emp", e);
        return "_delemp";
    }

    @PostMapping("/delete")
    public String deleteEmp(Integer empno){
        empInfo.deleteById(empno);
        return "redirect:/";
    }

}
