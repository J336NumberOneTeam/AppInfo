package appinfo.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "app_version", schema = "appinfodb", catalog = "")
public class AppVersion implements Serializable {
    private long id;
    private Long appId;
    private String versionNo;
    private String versionInfo;
    private Long publishStatus;
    private String downloadLink;
    private BigDecimal versionSize;
    private Long createdBy;
    private Timestamp creationDate;
    private Long modifyBy;
    private Timestamp modifyDate;
    private String apkLocPath;
    private String apkFileName;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "appId")
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "versionNo")
    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    @Basic
    @Column(name = "versionInfo")
    public String getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }

    @Basic
    @Column(name = "publishStatus")
    public Long getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Long publishStatus) {
        this.publishStatus = publishStatus;
    }

    @Basic
    @Column(name = "downloadLink")
    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    @Basic
    @Column(name = "versionSize")
    public BigDecimal getVersionSize() {
        return versionSize;
    }

    public void setVersionSize(BigDecimal versionSize) {
        this.versionSize = versionSize;
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

    @Basic
    @Column(name = "apkLocPath")
    public String getApkLocPath() {
        return apkLocPath;
    }

    public void setApkLocPath(String apkLocPath) {
        this.apkLocPath = apkLocPath;
    }

    @Basic
    @Column(name = "apkFileName")
    public String getApkFileName() {
        return apkFileName;
    }

    public void setApkFileName(String apkFileName) {
        this.apkFileName = apkFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppVersion that = (AppVersion) o;

        if (id != that.id) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (versionNo != null ? !versionNo.equals(that.versionNo) : that.versionNo != null) return false;
        if (versionInfo != null ? !versionInfo.equals(that.versionInfo) : that.versionInfo != null) return false;
        if (publishStatus != null ? !publishStatus.equals(that.publishStatus) : that.publishStatus != null)
            return false;
        if (downloadLink != null ? !downloadLink.equals(that.downloadLink) : that.downloadLink != null) return false;
        if (versionSize != null ? !versionSize.equals(that.versionSize) : that.versionSize != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (modifyBy != null ? !modifyBy.equals(that.modifyBy) : that.modifyBy != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (apkLocPath != null ? !apkLocPath.equals(that.apkLocPath) : that.apkLocPath != null) return false;
        if (apkFileName != null ? !apkFileName.equals(that.apkFileName) : that.apkFileName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (versionNo != null ? versionNo.hashCode() : 0);
        result = 31 * result + (versionInfo != null ? versionInfo.hashCode() : 0);
        result = 31 * result + (publishStatus != null ? publishStatus.hashCode() : 0);
        result = 31 * result + (downloadLink != null ? downloadLink.hashCode() : 0);
        result = 31 * result + (versionSize != null ? versionSize.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (modifyBy != null ? modifyBy.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (apkLocPath != null ? apkLocPath.hashCode() : 0);
        result = 31 * result + (apkFileName != null ? apkFileName.hashCode() : 0);
        return result;
    }
}
