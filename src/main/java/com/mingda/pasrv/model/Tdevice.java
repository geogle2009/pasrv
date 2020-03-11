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
@Table(name = "tdevice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tdevice.findAll", query = "SELECT t FROM Tdevice t")
    , @NamedQuery(name = "Tdevice.findByIdx", query = "SELECT t FROM Tdevice t WHERE t.idx = :idx")
    , @NamedQuery(name = "Tdevice.findByDevicename", query = "SELECT t FROM Tdevice t WHERE t.devicename = :devicename")
    , @NamedQuery(name = "Tdevice.findByDevicetype", query = "SELECT t FROM Tdevice t WHERE t.devicetype = :devicetype")
    , @NamedQuery(name = "Tdevice.findByDevicekind", query = "SELECT t FROM Tdevice t WHERE t.devicekind = :devicekind")
    , @NamedQuery(name = "Tdevice.findByCmdlt", query = "SELECT t FROM Tdevice t WHERE t.cmdlt = :cmdlt")
    , @NamedQuery(name = "Tdevice.findByRnum", query = "SELECT t FROM Tdevice t WHERE t.rnum = :rnum")
    , @NamedQuery(name = "Tdevice.findByStageidx", query = "SELECT t FROM Tdevice t WHERE t.stageidx = :stageidx")
    , @NamedQuery(name = "Tdevice.findByStagename", query = "SELECT t FROM Tdevice t WHERE t.stagename = :stagename")
    , @NamedQuery(name = "Tdevice.findByOrgid", query = "SELECT t FROM Tdevice t WHERE t.orgid = :orgid")
    , @NamedQuery(name = "Tdevice.findByOrgname", query = "SELECT t FROM Tdevice t WHERE t.orgname = :orgname")
    , @NamedQuery(name = "Tdevice.findByCstat", query = "SELECT t FROM Tdevice t WHERE t.cstat = :cstat")
    , @NamedQuery(name = "Tdevice.findByRemark", query = "SELECT t FROM Tdevice t WHERE t.remark = :remark")
    , @NamedQuery(name = "Tdevice.findByCitme", query = "SELECT t FROM Tdevice t WHERE t.citme = :citme")
    , @NamedQuery(name = "Tdevice.findByUtime", query = "SELECT t FROM Tdevice t WHERE t.utime = :utime")})
public class Tdevice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idx")
    private String idx;
    @Column(name = "devicename")
    private String devicename;
    @Column(name = "devicetype")
    private String devicetype;
    @Column(name = "devicekind")
    private String devicekind;
    @Column(name = "cmdlt")
    private String cmdlt;
    @Column(name = "rnum")
    private String rnum;
    @Column(name = "stageidx")
    private String stageidx;
    @Column(name = "stagename")
    private String stagename;
    @Column(name = "orgid")
    private String orgid;
    @Column(name = "orgname")
    private String orgname;
    @Column(name = "cstat")
    private String cstat;
    @Column(name = "remark")
    private String remark;
    @Column(name = "citme")
    private String citme;
    @Column(name = "utime")
    private String utime;

    public Tdevice() {
    }

    public Tdevice(String idx) {
        this.idx = idx;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    public String getDevicekind() {
        return devicekind;
    }

    public void setDevicekind(String devicekind) {
        this.devicekind = devicekind;
    }

    public String getCmdlt() {
        return cmdlt;
    }

    public void setCmdlt(String cmdlt) {
        this.cmdlt = cmdlt;
    }

    public String getRnum() {
        return rnum;
    }

    public void setRnum(String rnum) {
        this.rnum = rnum;
    }

    public String getStageidx() {
        return stageidx;
    }

    public void setStageidx(String stageidx) {
        this.stageidx = stageidx;
    }

    public String getStagename() {
        return stagename;
    }

    public void setStagename(String stagename) {
        this.stagename = stagename;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getCstat() {
        return cstat;
    }

    public void setCstat(String cstat) {
        this.cstat = cstat;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCitme() {
        return citme;
    }

    public void setCitme(String citme) {
        this.citme = citme;
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
        if (!(object instanceof Tdevice)) {
            return false;
        }
        Tdevice other = (Tdevice) object;
        if ((this.idx == null && other.idx != null) || (this.idx != null && !this.idx.equals(other.idx))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "{\"idx\":\"" + idx + "\", \"devicename\":\"" + devicename + "\", \"devicetype\":\"" + devicetype
				+ "\", \"devicekind\":\"" + devicekind + "\", \"cmdlt\":\"" + cmdlt + "\", \"rnum\":\"" + rnum
				+ "\", \"stageidx\":\"" + stageidx + "\", \"stagename\":\"" + stagename + "\", \"orgid\":\"" + orgid
				+ "\", \"orgname\":\"" + orgname + "\", \"cstat\":\"" + cstat + "\", \"remark\":\"" + remark
				+ "\", \"citme\":\"" + citme + "\", \"utime\":\"" + utime + "\"}";
	}
    
    
}
