/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mingda.pasrv.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wangj
 */
@Entity
@Table(name = "tcmdlt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tcmdlt.findAll", query = "SELECT t FROM Tcmdlt t")
    , @NamedQuery(name = "Tcmdlt.findByIdx", query = "SELECT t FROM Tcmdlt t WHERE t.idx = :idx")
    , @NamedQuery(name = "Tcmdlt.findByCmdlt", query = "SELECT t FROM Tcmdlt t WHERE t.cmdlt = :cmdlt")
    , @NamedQuery(name = "Tcmdlt.findByRemark", query = "SELECT t FROM Tcmdlt t WHERE t.remark = :remark")})
public class Tcmdlt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idx")
    private String idx;
    @Column(name = "cmdlt")
    private String cmdlt;
    @Column(name = "remark")
    private String remark;

    public Tcmdlt() {
    }

    public Tcmdlt(String idx) {
        this.idx = idx;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getCmdlt() {
        return cmdlt;
    }

    public void setCmdlt(String cmdlt) {
        this.cmdlt = cmdlt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idx != null ? idx.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tcmdlt)) {
            return false;
        }
        Tcmdlt other = (Tcmdlt) object;
        if ((this.idx == null && other.idx != null) || (this.idx != null && !this.idx.equals(other.idx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication9.Tcmdlt[ idx=" + idx + " ]";
    }
    
}
