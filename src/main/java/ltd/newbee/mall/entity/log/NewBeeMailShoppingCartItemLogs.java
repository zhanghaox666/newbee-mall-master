package ltd.newbee.mall.entity.log;

import java.util.Date;

/**
 * @className: ltd.newbee.mall.entity.log.NewBeeMailShoppingCartItemLogs
 * @description: TODO
 * @author: zhanghaox
 * @create: 2022-09-01 15:08
 */
public class NewBeeMailShoppingCartItemLogs {

    private Long userId;

    private Long goodsId;

    private String goodsName;

    private String goodsIntro;

    private Long goodsCategoryId;

    private Integer sellingPrice;

    private Date updateTime;



    public NewBeeMailShoppingCartItemLogs() {
    }

    public NewBeeMailShoppingCartItemLogs(Long userId, Long goodsId, String goodsName, String goodsIntro, Long goodsCategoryId, Integer sellingPrice, Date updateTime) {
        this.userId = userId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsIntro = goodsIntro;
        this.goodsCategoryId = goodsCategoryId;
        this.sellingPrice = sellingPrice;
        this.updateTime = updateTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsIntro() {
        return goodsIntro;
    }

    public void setGoodsIntro(String goodsIntro) {
        this.goodsIntro = goodsIntro;
    }

    public Long getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(Long goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public Integer getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }



    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "NewBeeMailShoppingCartItemLogs{" +
                "userId=" + userId +
                ", goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsIntro='" + goodsIntro + '\'' +
                ", goodsCategoryId=" + goodsCategoryId +
                ", sellingPrice=" + sellingPrice +
                ", updateTime=" + updateTime +
                '}';
    }
}
