package com.cgx.springdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author cgx
 * @since 2020-04-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TAddress extends Model<TAddress> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String userId;

    /**
     * 所属渠道编号:1-公众号
     */
    private Integer channelId;

    /**
     * 业务编号
     */
    private String bizCode;

    /**
     * 地址类型:房产、实际、户籍、单位
     */
    private String type;

    /**
     * 联系人姓名
     */
    private String receiverName;

    /**
     * 联系电话区域(+86, +1, +44)
     */
    private String phoneRegion;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 所在地区code(中国大陆、台湾、港澳、马来西亚、海外其他)
     */
    private String locationRegion;

    /**
     * 省份code
     */
    private String provinceCode;

    /**
     * 城市code
     */
    private String cityCode;

    /**
     * 县区code
     */
    private String districtCode;

    /**
     * 街道code
     */
    private String streetCode;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 详细地址
     */
    private String addressDetail;

    /**
     * 是否为默认(Y: 有, N: 无)
     */
    private String isDefault;

    /**
     * 是否删除
     */
    private String isDeleted;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 修改者
     */
    private String modifier;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreated;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getPhoneRegion() {
        return phoneRegion;
    }

    public void setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocationRegion() {
        return locationRegion;
    }

    public void setLocationRegion(String locationRegion) {
        this.locationRegion = locationRegion;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public String toString() {
        return "TAddress{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", channelId=" + channelId +
                ", bizCode='" + bizCode + '\'' +
                ", type='" + type + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", phoneRegion='" + phoneRegion + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", locationRegion='" + locationRegion + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", districtCode='" + districtCode + '\'' +
                ", streetCode='" + streetCode + '\'' +
                ", postCode='" + postCode + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                ", isDefault='" + isDefault + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", creator='" + creator + '\'' +
                ", modifier='" + modifier + '\'' +
                ", gmtCreated=" + gmtCreated +
                ", gmtModified=" + gmtModified +
                '}';
    }

    public LocalDateTime getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(LocalDateTime gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
