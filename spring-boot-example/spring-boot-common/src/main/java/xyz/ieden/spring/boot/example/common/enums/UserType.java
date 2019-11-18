package xyz.ieden.spring.boot.example.common.enums;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/15 15:17
 */
public enum UserType {

    /**
     * 游客
     */
    GUEST {
        @Override
        public String toString() {
            return "guest";
        }
    },
    /**
     * 登录
     */
    LOGIN {
        @Override
        public String toString() {
            return "login";
        }
    },
    /**
     * VIP
     */
    VIP {
        @Override
        public String toString() {
            return "vip";
        }
    }

}
