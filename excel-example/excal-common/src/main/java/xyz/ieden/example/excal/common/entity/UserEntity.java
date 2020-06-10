package xyz.ieden.example.excal.common.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/4/8 16:12
 */
@Getter
@Setter
public class UserEntity {

    /**
     * 主键
     */
    private Long id;

    /**
     * 经纪人的58城市id
     */
    private Integer cityId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 经纪人ID
     */
    private Long agentId;

    /**
     * 经纪人名
     */
    private String agentName;

    /**
     * 公司名
     */
    private String companyName;

    /**
     * 门店名
     */
    private String storeName;

    /**
     * 联系电话（绑定电话）
     */
    private String telephone;

    /**
     * 电话是否认证（0：未认证  1：已认证）
     */
    private Boolean telCertified;

    /**
     * 营业执照是否认证（0：未认证  1：已认证）
     */
    private Boolean licenseCertified;

    /**
     * 服务区域
     */
    private String serveArea;

    /**
     * 服务小区
     */
    private String serveCommunity;

    /**
     * 注册时间
     */
    private Date regTime;

    /**
     * 房源数量
     */
    private Integer houseNum;

    /**
     * 每个类别对应的房源数量（例如：1:30,2:40）
     */
    private String categoryIds;

    /**
     * 店铺url
     */
    private String shopUrl;

    /**
     * 头像图片url
     */
    private String picUrl;

    /**
     * 账户余额
     */
    private Double balance;

    /**
     * 推广优惠余额
     */
    private Double gift;

    /**
     * 推广现金余额
     */
    private Double cash;

    /**
     * 创建人用户名
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改人用户名
     */
    private String modifier;

    /**
     * 最后修改时间
     */
    private Date modifyTime;

    /**
     * 创建人归属的代理商id
     */
    private Long createFa;

    /**
     * 修改人归属的代理商id
     */
    private Long modifyFa;

    /**
     * 被绑定的代理商id
     */
    private Long bindFaId;

    /**
     * 绑定日期
     */
    private Date bindDate;

    /**
     * 绑定方式：1-自动绑定 2-调配
     */
    private Byte bindType;

}
