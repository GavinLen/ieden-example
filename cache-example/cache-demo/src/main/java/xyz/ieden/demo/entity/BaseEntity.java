package xyz.ieden.demo.entity;

import java.util.Date;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/3/18 21:43
 */
public class BaseEntity {

    private Integer id;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
