package com.gradpro.action;

import java.sql.SQLException;
import java.util.List;

import com.gradpro.dao.CollegeDAO;
import com.gradpro.dao.DeptDAO;
import com.gradpro.vo.College;

public class DeptAction {

    private String message;
    
    private String collegeid;
    private String deptid;
    private String dname;
    
    private List<College> colleges = null;
    
    public String toDeptPage(){
        CollegeDAO collegeDao = new CollegeDAO();
        try {
            colleges = collegeDao.getAllColleges();
        } catch (SQLException e) {
            e.printStackTrace();
            message = "系统错误";
            return "notexist";
        }
        
        return "todeptpage";
    }
    
    public String addDept(){
        DeptDAO deptDao = new DeptDAO();
        if("0".equals(collegeid)){
            message = "所属学院编号不能为空";
            return "notexist";
        }
        if(deptDao.isExist(deptid)){
            message = "此专业编号已存在";
            return "notexist";
        }
        try {
            deptDao.insertDept(deptid, dname, collegeid);
        } catch (SQLException e) {
            e.printStackTrace();
            message = "系统错误";
            return "notexist";
        }
        
        message = "添加专业成功！";
        return "success";
    }
    
    public String deleteDept(){
        DeptDAO deptDao = new DeptDAO();
        try {
            deptDao.deleteDeptByID(deptid);
        } catch (SQLException e) {
            e.printStackTrace();
            message = "系统错误";
            return "notexist";
        }
        
        message = "删除专业成功！";
        return "success";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<College> getColleges() {
        return colleges;
    }

    public void setColleges(List<College> colleges) {
        this.colleges = colleges;
    }

    public String getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(String collegeid) {
        this.collegeid = collegeid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    
}
