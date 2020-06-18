package edu.sicnu.jerry.pojo;

public class TbShop {
    private String shopName;

    private Long shopId;

    private Integer shopStates;

    public TbShop(String shopName, Long shopId, Integer shopStates) {
        this.shopName = shopName;
        this.shopId = shopId;
        this.shopStates = shopStates;
    }

    public TbShop() {
        super();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Integer getShopStates() {
        return shopStates;
    }

    public void setShopStates(Integer shopStates) {
        this.shopStates = shopStates;
    }
}