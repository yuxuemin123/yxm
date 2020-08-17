package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Emp implements Serializable {
    @Id
    private Integer empno;

    private String ename;

    private String sex;

    private String hobby;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String birthday;

    private Integer deptno;
    

    private static final long serialVersionUID = 1L;

    /**
     * @return empno
     */
    public Integer getEmpno() {
        return empno;
    }

    /**
     * @param empno
     */
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    /**
     * @return ename
     */
    public String getEname() {
        return ename;
    }

    /**
     * @param ename
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    /**
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * @return deptno
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * @param deptno
     */
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empno=").append(empno);
        sb.append(", ename=").append(ename);
        sb.append(", sex=").append(sex);
        sb.append(", hobby=").append(hobby);
        sb.append(", birthday=").append(birthday);
        sb.append(", deptno=").append(deptno);
        sb.append("]");
        return sb.toString();
    }
}