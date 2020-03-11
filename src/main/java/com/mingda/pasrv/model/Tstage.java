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
@Table(name = "tstage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tstage.findAll", query = "SELECT t FROM Tstage t")
    , @NamedQuery(name = "Tstage.findByIdx", query = "SELECT t FROM Tstage t WHERE t.idx = :idx")
    , @NamedQuery(name = "Tstage.findByStagename", query = "SELECT t FROM Tstage t WHERE t.stagename = :stagename")
    , @NamedQuery(name = "Tstage.findByStagetype", query = "SELECT t FROM Tstage t WHERE t.stagetype = :stagetype")
    , @NamedQuery(name = "Tstage.findByCtime", query = "SELECT t FROM Tstage t WHERE t.ctime = :ctime")
    , @NamedQuery(name = "Tstage.findByUtime", query = "SELECT t FROM Tstage t WHERE t.utime = :utime")})
public class Tstage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idx")
    private String idx;
    @Column(name = "stagename")
    private String stagename;
    @Column(name = "stagetype")
    private String stagetype;
    @Column(name = "ctime")
    private String ctime;
    @Column(name = "utime")
    private String utime;

    public Tstage() {
    }

    public Tstage(String idx) {
        this.idx = idx;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getStagename() {
        return stagename;
    }

    public void setStagename(String stagename) {
        this.stagename = stagename;
    }

    public String getStagetype() {
        return stagetype;
    }

    public void setStagetype(String stagetype) {
        this.stagetype = stagetype;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime;
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
        if (!(object instanceof Tstage)) {
            return false;
        }
        Tstage other = (Tstage) object;
        if ((this.idx == null && other.idx != null) || (this.idx != null && !this.idx.equals(other.idx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication9.Tstage[ idx=" + idx + " ]";
    }
    
}
