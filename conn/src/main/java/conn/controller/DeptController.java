package conn.controller;

import conn.entity.Dept;
import conn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class DeptController {
    @Autowired
    DeptService deptService;
//GET请求
    @GetMapping("dept")
    public List<Dept> selectAllDept(@PathVariable Integer id){
        return deptService.selectAllDept();
    }
//PUT请求
    @PutMapping("dept")
    public String updateById(){
        return "执行了put...";
    }
//DELETE请求
    @DeleteMapping("dept")
    public String deleteByIds(@PathVariable Integer id){
        return "执行了delete...";
    }
//POST请求
    @PostMapping("dept")
    public String insertIntoDept(){
        return "执行了post...";
    }
}
