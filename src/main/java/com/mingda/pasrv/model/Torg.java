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
@Table(name = "torg")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Torg.findAll", query = "SELECT t FROM Torg t")
    , @NamedQuery(name = "Torg.findByOrgid", query = "SELECT t FROM Torg t WHERE t.orgid = :orgid")
    , @NamedQuery(name = "Torg.findByOrgname", query = "SELECT t FROM Torg t WHERE t.orgname = :orgname")
    , @NamedQuery(name = "Torg.findByHosturl", query = "SELECT t FROM Torg t WHERE t.hosturl = :hosturl")
    , @NamedQuery(name = "Torg.findByHostport", query = "SELECT t FROM Torg t WHERE t.hostport = :hostport")
    , @NamedQuery(name = "Torg.findByMqtturl", query = "SELECT t FROM Torg t WHERE t.mqtturl = :mqtturl")
    , @NamedQuery(name = "Torg.findByMqttport", query = "SELECT t FROM Torg t WHERE t.mqttport = :mqttport")
    , @NamedQuery(name = "Torg.findByCitme", query = "SELECT t FROM Torg t WHERE t.citme = :citme")
    , @NamedQuery(name = "Torg.findByUtime", query = "SELECT t FROM Torg t WHERE t.utime = :utime")
    , @NamedQuery(name = "Torg.findByRtopic", query = "SELECT t FROM Torg t WHERE t.rtopic = :rtopic")
    , @NamedQuery(name = "Torg.findByStopic", query = "SELECT t FROM Torg t WHERE t.stopic = :stopic")})
public class Torg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "orgid")
    private String orgid;
    @Column(name = "orgname")
    private String orgname;
    @Column(name = "hosturl")
    private String hosturl;
    @Column(name = "hostport")
    private String hostport;
    @Column(name = "mqtturl")
    private String mqtturl;
    @Column(name = "mqttport")
    private String mqttport;
    @Column(name = "citme")
    private String citme;
    @Column(name = "utime")
    private String utime;
    @Column(name = "rtopic")
    private String rtopic;
    @Column(name = "stopic")
    private String stopic;

    public Torg() {
    }

    public Torg(String orgid) {
        this.orgid = orgid;
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

    public String getHosturl() {
        return hosturl;
    }

    public void setHosturl(String hosturl) {
        this.hosturl = hosturl;
    }

    public String getHostport() {
        return hostport;
    }

    public void setHostport(String hostport) {
        this.hostport = hostport;
    }

    public String getMqtturl() {
        return mqtturl;
    }

    public void setMqtturl(String mqtturl) {
        this.mqtturl = mqtturl;
    }

    public String getMqttport() {
        return mqttport;
    }

    public void setMqttport(String mqttport) {
        this.mqttport = mqttport;
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

    public String getRtopic() {
        return rtopic;
    }

    public void setRtopic(String rtopic) {
        this.rtopic = rtopic;
    }

    public String getStopic() {
        return stopic;
    }

    public void setStopic(String stopic) {
        this.stopic = stopic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orgid != null ? orgid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Torg)) {
            return false;
        }
        Torg other = (Torg) object;
        if ((this.orgid == null && other.orgid != null) || (this.orgid != null && !this.orgid.equals(other.orgid))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "{\"orgid\":\"" + orgid + "\", \"orgname\":\"" + orgname + "\", \"hosturl\":\"" + hosturl
				+ "\", \"hostport\":\"" + hostport + "\", \"mqtturl\":\"" + mqtturl + "\", \"mqttport\":\"" + mqttport
				+ "\", \"citme\":\"" + citme + "\", \"utime\":\"" + utime + "\", \"rtopic\":\"" + rtopic
				+ "\", \"stopic\":\"" + stopic + "\"}";
	}

    
}
