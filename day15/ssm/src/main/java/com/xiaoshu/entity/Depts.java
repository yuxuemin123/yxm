package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Depts implements Serializable {
    @Id
    private Integer deptid;

    private String dname;

    private static final long serialVersionUID = 1L;

    /**
     * @return deptid
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * @param deptid
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
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
        sb.append(", deptid=").append(deptid);
        sb.append(", dname=").append(dname);
        sb.append("]");
        return sb.toString();
    }
}