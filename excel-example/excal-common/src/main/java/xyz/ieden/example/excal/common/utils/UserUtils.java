package xyz.ieden.example.excal.common.utils;

import xyz.ieden.example.excal.common.entity.UserEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/4/8 16:20
 */
public class UserUtils {

    /**
     * 获取数据
     *
     * @param dataSize
     * @return
     */
    public static List<UserEntity> getUserData(Integer dataSize) {
        List<UserEntity> dataList = new ArrayList<>(dataSize);

        UserEntity userEntity = null;
        for (int i = 0; i < dataSize; i++) {
            userEntity = new UserEntity();
            userEntity.setId(Long.valueOf(i));
            userEntity.setCityId(i);
            userEntity.setUserId(Long.valueOf(i));
            userEntity.setUserName("张三_" + i);
            userEntity.setAgentId(Long.valueOf(i));
            userEntity.setAgentName("李四_" + i);
            userEntity.setCompanyName("公司_" + i);
            userEntity.setStoreName("门店_" + i);
            userEntity.setTelephone("123-" + i);
            userEntity.setTelCertified(i % 2 == 0);
            userEntity.setLicenseCertified(i % 2 == 0);
            userEntity.setServeArea("区域_" + i);
            userEntity.setServeCommunity("小区_" + i);
            userEntity.setRegTime(new Date());
            userEntity.setHouseNum(i % 10);
            userEntity.setCategoryIds("1:30,2:40");
            userEntity.setShopUrl("http://www.img.com/shop/" + i);
            userEntity.setPicUrl("http://www.img.com/pic/" + i);
            userEntity.setBalance(Double.valueOf(i + 10));
            userEntity.setGift(Double.valueOf(i + 1.1));
            userEntity.setCash(Double.valueOf(i + 2));
            userEntity.setCreator("创建者_" + i);
            dataList.add(userEntity);
        }
        return dataList;
    }

}
