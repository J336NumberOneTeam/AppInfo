package appinfo.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "app_info", schema = "appinfodb", catalog = "")
public class AppInfo implements Serializable {
    private long id;
    private String softwareName;
    private String apkName;
    private String supportRom;
    private String interfaceLanguage;
    private BigDecimal softwareSize;
    private Date updateDate;
    private Long devId;
    private String appInfo;
    private Long status;
    private Timestamp onSaleDate;
    private Timestamp offSaleDate;
    private Long flatformId;
    private Long categoryLevel3;
    private Long downloads;
    private Long createdBy;
    private Timestamp creationDate;
    private Long modifyBy;
    private Timestamp modifyDate;
    private Long categoryLevel1;
    private Long categoryLevel2;
    private String logoPicPath;
    private String logoLocPath;
    private Long versionId;

    //添加查询字段
    private String flatformName;//所属平台名称
    private String categoryLevel1Name;//一级分类名称
    private String categoryLevel2Name;//二级分类名称
    private String categoryLevel3Name;//三级分类名称
    private String statusName;//状态名称
    private String versionNo;//版本号

    public String getFlatformName() {
        return flatformName;
    }

    public void setFlatformName(String flatformName) {
        this.flatformName = flatformName;
    }

    public String getCategoryLevel1Name() {
        return categoryLevel1Name;
    }

    public void setCategoryLevel1Name(String categoryLevel1Name) {
        this.categoryLevel1Name = categoryLevel1Name;
    }

    public String getCategoryLevel2Name() {
        return categoryLevel2Name;
    }

    public void setCategoryLevel2Name(String categoryLevel2Name) {
        this.categoryLevel2Name = categoryLevel2Name;
    }

    public String getCategoryLevel3Name() {
        return categoryLevel3Name;
    }

    public void setCategoryLevel3Name(String categoryLevel3Name) {
        this.categoryLevel3Name = categoryLevel3Name;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "softwareName")
    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    @Basic
    @Column(name = "APKName")
    public String getApkName() {
        return apkName;
    }

    public void setApkName(String apkName) {
        this.apkName = apkName;
    }

    @Basic
    @Column(name = "supportROM")
    public String getSupportRom() {
        return supportRom;
    }

    public void setSupportRom(String supportRom) {
        this.supportRom = supportRom;
    }

    @Basic
    @Column(name = "interfaceLanguage")
    public String getInterfaceLanguage() {
        return interfaceLanguage;
    }

    public void setInterfaceLanguage(String interfaceLanguage) {
        this.interfaceLanguage = interfaceLanguage;
    }

    @Basic
    @Column(name = "softwareSize")
    public BigDecimal getSoftwareSize() {
        return softwareSize;
    }

    public void setSoftwareSize(BigDecimal softwareSize) {
        this.softwareSize = softwareSize;
    }

    @Basic
    @Column(name = "updateDate")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "devId")
    public Long getDevId() {
        return devId;
    }

    public void setDevId(Long devId) {
        this.devId = devId;
    }

    @Basic
    @Column(name = "appInfo")
    public String getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(String appInfo) {
        this.appInfo = appInfo;
    }

    @Basic
    @Column(name = "status")
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Basic
    @Column(name = "onSaleDate")
    public Timestamp getOnSaleDate() {
        return onSaleDate;
    }

    public void setOnSaleDate(Timestamp onSaleDate) {
        this.onSaleDate = onSaleDate;
    }

    @Basic
    @Column(name = "offSaleDate")
    public Timestamp getOffSaleDate() {
        return offSaleDate;
    }

    public void setOffSaleDate(Timestamp offSaleDate) {
        this.offSaleDate = offSaleDate;
    }

    @Basic
    @Column(name = "flatformId")
    public Long getFlatformId() {
        return flatformId;
    }

    public void setFlatformId(Long flatformId) {
        this.flatformId = flatformId;
    }

    @Basic
    @Column(name = "categoryLevel3")
    public Long getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(Long categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    @Basic
    @Column(name = "downloads")
    public Long getDownloads() {
        return downloads;
    }

    public void setDownloads(Long downloads) {
        this.downloads = downloads;
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
    @Column(name = "categoryLevel1")
    public Long getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(Long categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    @Basic
    @Column(name = "categoryLevel2")
    public Long getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(Long categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    @Basic
    @Column(name = "logoPicPath")
    public String getLogoPicPath() {
        return logoPicPath;
    }

    public void setLogoPicPath(String logoPicPath) {
        this.logoPicPath = logoPicPath;
    }

    @Basic
    @Column(name = "logoLocPath")
    public String getLogoLocPath() {
        return logoLocPath;
    }

    public void setLogoLocPath(String logoLocPath) {
        this.logoLocPath = logoLocPath;
    }

    @Basic
    @Column(name = "versionId")
    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppInfo appInfo1 = (AppInfo) o;

        if (id != appInfo1.id) return false;
        if (softwareName != null ? !softwareName.equals(appInfo1.softwareName) : appInfo1.softwareName != null)
            return false;
        if (apkName != null ? !apkName.equals(appInfo1.apkName) : appInfo1.apkName != null) return false;
        if (supportRom != null ? !supportRom.equals(appInfo1.supportRom) : appInfo1.supportRom != null) return false;
        if (interfaceLanguage != null ? !interfaceLanguage.equals(appInfo1.interfaceLanguage) : appInfo1.interfaceLanguage != null)
            return false;
        if (softwareSize != null ? !softwareSize.equals(appInfo1.softwareSize) : appInfo1.softwareSize != null)
            return false;
        if (updateDate != null ? !updateDate.equals(appInfo1.updateDate) : appInfo1.updateDate != null) return false;
        if (devId != null ? !devId.equals(appInfo1.devId) : appInfo1.devId != null) return false;
        if (appInfo != null ? !appInfo.equals(appInfo1.appInfo) : appInfo1.appInfo != null) return false;
        if (status != null ? !status.equals(appInfo1.status) : appInfo1.status != null) return false;
        if (onSaleDate != null ? !onSaleDate.equals(appInfo1.onSaleDate) : appInfo1.onSaleDate != null) return false;
        if (offSaleDate != null ? !offSaleDate.equals(appInfo1.offSaleDate) : appInfo1.offSaleDate != null)
            return false;
        if (flatformId != null ? !flatformId.equals(appInfo1.flatformId) : appInfo1.flatformId != null) return false;
        if (categoryLevel3 != null ? !categoryLevel3.equals(appInfo1.categoryLevel3) : appInfo1.categoryLevel3 != null)
            return false;
        if (downloads != null ? !downloads.equals(appInfo1.downloads) : appInfo1.downloads != null) return false;
        if (createdBy != null ? !createdBy.equals(appInfo1.createdBy) : appInfo1.createdBy != null) return false;
        if (creationDate != null ? !creationDate.equals(appInfo1.creationDate) : appInfo1.creationDate != null)
            return false;
        if (modifyBy != null ? !modifyBy.equals(appInfo1.modifyBy) : appInfo1.modifyBy != null) return false;
        if (modifyDate != null ? !modifyDate.equals(appInfo1.modifyDate) : appInfo1.modifyDate != null) return false;
        if (categoryLevel1 != null ? !categoryLevel1.equals(appInfo1.categoryLevel1) : appInfo1.categoryLevel1 != null)
            return false;
        if (categoryLevel2 != null ? !categoryLevel2.equals(appInfo1.categoryLevel2) : appInfo1.categoryLevel2 != null)
            return false;
        if (logoPicPath != null ? !logoPicPath.equals(appInfo1.logoPicPath) : appInfo1.logoPicPath != null)
            return false;
        if (logoLocPath != null ? !logoLocPath.equals(appInfo1.logoLocPath) : appInfo1.logoLocPath != null)
            return false;
        if (versionId != null ? !versionId.equals(appInfo1.versionId) : appInfo1.versionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (softwareName != null ? softwareName.hashCode() : 0);
        result = 31 * result + (apkName != null ? apkName.hashCode() : 0);
        result = 31 * result + (supportRom != null ? supportRom.hashCode() : 0);
        result = 31 * result + (interfaceLanguage != null ? interfaceLanguage.hashCode() : 0);
        result = 31 * result + (softwareSize != null ? softwareSize.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (devId != null ? devId.hashCode() : 0);
        result = 31 * result + (appInfo != null ? appInfo.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (onSaleDate != null ? onSaleDate.hashCode() : 0);
        result = 31 * result + (offSaleDate != null ? offSaleDate.hashCode() : 0);
        result = 31 * result + (flatformId != null ? flatformId.hashCode() : 0);
        result = 31 * result + (categoryLevel3 != null ? categoryLevel3.hashCode() : 0);
        result = 31 * result + (downloads != null ? downloads.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (modifyBy != null ? modifyBy.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (categoryLevel1 != null ? categoryLevel1.hashCode() : 0);
        result = 31 * result + (categoryLevel2 != null ? categoryLevel2.hashCode() : 0);
        result = 31 * result + (logoPicPath != null ? logoPicPath.hashCode() : 0);
        result = 31 * result + (logoLocPath != null ? logoLocPath.hashCode() : 0);
        result = 31 * result + (versionId != null ? versionId.hashCode() : 0);
        return result;
    }
}
