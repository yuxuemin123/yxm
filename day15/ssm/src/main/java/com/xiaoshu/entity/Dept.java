package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Dept implements Serializable {
    @Id
    private Integer deptno;

    private String dname;

    private static final long serialVersionUID = 1L;

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

    /**
     * @return dname
     */
    public String getDname() {
        return dname;
    }

    /**
     * @param dname
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptno=").append(deptno);
        sb.append(", dname=").append(dname);
        sb.append("]");
        return sb.toString();
    }
}