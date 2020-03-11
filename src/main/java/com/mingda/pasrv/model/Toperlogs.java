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
@Table(name = "toperlogs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Toperlogs.findAll", query = "SELECT t FROM Toperlogs t")
    , @NamedQuery(name = "Toperlogs.findByIdx", query = "SELECT t FROM Toperlogs t WHERE t.idx = :idx")
    , @NamedQuery(name = "Toperlogs.findByOperlog", query = "SELECT t FROM Toperlogs t WHERE t.operlog = :operlog")
    , @NamedQuery(name = "Toperlogs.findByCtime", query = "SELECT t FROM Toperlogs t WHERE t.ctime = :ctime")})
public class Toperlogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idx")
    private String idx;
    @Column(name = "operlog")
    private String operlog;
    @Column(name = "ctime")
    private String ctime;

    public Toperlogs() {
    }

    public Toperlogs(String idx) {
        this.idx = idx;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getOperlog() {
        return operlog;
    }

    public void setOperlog(String operlog) {
        this.operlog = operlog;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
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
        if (!(object instanceof Toperlogs)) {
            return false;
        }
        Toperlogs other = (Toperlogs) object;
        if ((this.idx == null && other.idx != null) || (this.idx != null && !this.idx.equals(other.idx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication9.Toperlogs[ idx=" + idx + " ]";
    }
    
}
