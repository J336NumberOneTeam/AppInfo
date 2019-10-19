package appinfo.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "dev_user", schema = "appinfodb", catalog = "")
public class DevUser implements Serializable {
    private long id;
    private String devCode;
    private String devName;
    private String devPassword;
    private String devEmail;
    private String devInfo;
    private Long createdBy;
    private Timestamp creationDate;
    private Long modifyBy;
    private Timestamp modifyDate;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "devCode")
    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    @Basic
    @Column(name = "devName")
    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    @Basic
    @Column(name = "devPassword")
    public String getDevPassword() {
        return devPassword;
    }

    public void setDevPassword(String devPassword) {
        this.devPassword = devPassword;
    }

    @Basic
    @Column(name = "devEmail")
    public String getDevEmail() {
        return devEmail;
    }

    public void setDevEmail(String devEmail) {
        this.devEmail = devEmail;
    }

    @Basic
    @Column(name = "devInfo")
    public String getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(String devInfo) {
        this.devInfo = devInfo;
    }

    @Basic
    @Column(name = "createdBy")
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "creationDate")
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "modifyBy")
    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Basic
    @Column(name = "modifyDate")
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DevUser devUser = (DevUser) o;

        if (id != devUser.id) return false;
        if (devCode != null ? !devCode.equals(devUser.devCode) : devUser.devCode != null) return false;
        if (devName != null ? !devName.equals(devUser.devName) : devUser.devName != null) return false;
        if (devPassword != null ? !devPassword.equals(devUser.devPassword) : devUser.devPassword != null) return false;
        if (devEmail != null ? !devEmail.equals(devUser.devEmail) : devUser.devEmail != null) return false;
        if (devInfo != null ? !devInfo.equals(devUser.devInfo) : devUser.devInfo != null) return false;
        if (createdBy != null ? !createdBy.equals(devUser.createdBy) : devUser.createdBy != null) return false;
        if (creationDate != null ? !creationDate.equals(devUser.creationDate) : devUser.creationDate != null)
            return false;
        if (modifyBy != null ? !modifyBy.equals(devUser.modifyBy) : devUser.modifyBy != null) return false;
        if (modifyDate != null ? !modifyDate.equals(devUser.modifyDate) : devUser.modifyDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (devCode != null ? devCode.hashCode() : 0);
        result = 31 * result + (devName != null ? devName.hashCode() : 0);
        result = 31 * result + (devPassword != null ? devPassword.hashCode() : 0);
        result = 31 * result + (devEmail != null ? devEmail.hashCode() : 0);
        result = 31 * result + (devInfo != null ? devInfo.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (modifyBy != null ? modifyBy.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        return result;
    }
}
