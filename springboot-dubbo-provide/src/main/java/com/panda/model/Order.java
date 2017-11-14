package com.panda.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Order implements Serializable{
    private Long orderId;

    private String imei;

    private Integer appid;

    private Integer channelId;

    private String cpOrderId;

    private String channelOrderId;

    private Integer buyAmount;

    private BigDecimal productPerPrice;

    private BigDecimal totalPrice;

    private Boolean status;

    private Boolean deliverStatus;

    private String productName;

    private String productDesc;

    private String uid;

    private Byte notifyTimes;

    private String extendParam;

    private Long channelCtime;

    private Long successTime;

    private Long notifySuccessTime;

    private Integer ctime;

    private String gameServerId;

    private String productId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getCpOrderId() {
        return cpOrderId;
    }

    public void setCpOrderId(String cpOrderId) {
        this.cpOrderId = cpOrderId == null ? null : cpOrderId.trim();
    }

    public String getChannelOrderId() {
        return channelOrderId;
    }

    public void setChannelOrderId(String channelOrderId) {
        this.channelOrderId = channelOrderId == null ? null : channelOrderId.trim();
    }

    public Integer getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(Integer buyAmount) {
        this.buyAmount = buyAmount;
    }

    public BigDecimal getProductPerPrice() {
        return productPerPrice;
    }

    public void setProductPerPrice(BigDecimal productPerPrice) {
        this.productPerPrice = productPerPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(Boolean deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Byte getNotifyTimes() {
        return notifyTimes;
    }

    public void setNotifyTimes(Byte notifyTimes) {
        this.notifyTimes = notifyTimes;
    }

    public String getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(String extendParam) {
        this.extendParam = extendParam == null ? null : extendParam.trim();
    }

    public Long getChannelCtime() {
        return channelCtime;
    }

    public void setChannelCtime(Long channelCtime) {
        this.channelCtime = channelCtime;
    }

    public Long getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Long successTime) {
        this.successTime = successTime;
    }

    public Long getNotifySuccessTime() {
        return notifySuccessTime;
    }

    public void setNotifySuccessTime(Long notifySuccessTime) {
        this.notifySuccessTime = notifySuccessTime;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public String getGameServerId() {
        return gameServerId;
    }

    public void setGameServerId(String gameServerId) {
        this.gameServerId = gameServerId == null ? null : gameServerId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }
}