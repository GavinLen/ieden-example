package xyz.ieden.demo.entity;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/3/18 21:45
 */
public class UserEntity extends BaseEntity {
    private String name;
    private String userName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
