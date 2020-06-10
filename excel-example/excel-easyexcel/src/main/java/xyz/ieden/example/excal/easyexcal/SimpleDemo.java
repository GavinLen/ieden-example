package xyz.ieden.example.excal.easyexcal;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import xyz.ieden.example.excal.common.entity.UserEntity;
import xyz.ieden.example.excal.common.utils.UserUtils;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/4/8 16:05
 */
public class SimpleDemo {

    public static void main(String[] args) throws FileNotFoundException {

        ExcelWriter excelWriter = EasyExcel.write("/opt/excel/simple_demo.xlsx").build();
        WriteSheet writeSheet = new WriteSheet();
        writeSheet.setSheetNo(1);
        writeSheet.setSheetName("sheet_1");

        WriteTable writeTable = new WriteTable();
        writeTable.setTableNo(0);
        writeTable.setHead(getTableHandle());

        List<UserEntity> dataList = UserUtils.getUserData(10000);

        excelWriter.write(dataList, writeSheet);

        excelWriter.finish();

    }

    /**
     * 获取表头
     *
     * @return
     */
    private static List<List<String>> getTableHandle() {
        List<List<String>> tableHandle = new ArrayList<>();

        tableHandle.add(Arrays.asList("主键"));
        tableHandle.add(Arrays.asList("城市ID"));
        tableHandle.add(Arrays.asList("用户ID"));
        tableHandle.add(Arrays.asList("用户名"));
        tableHandle.add(Arrays.asList("经纪人ID"));
        tableHandle.add(Arrays.asList("经纪人名"));
        tableHandle.add(Arrays.asList("公司名"));
        tableHandle.add(Arrays.asList("门店名"));
        tableHandle.add(Arrays.asList("联系电话（绑定电话）"));
        tableHandle.add(Arrays.asList("电话是否认证"));
        tableHandle.add(Arrays.asList("营业执照是否认证"));
        tableHandle.add(Arrays.asList("服务区域"));
        tableHandle.add(Arrays.asList("服务小区"));
        tableHandle.add(Arrays.asList("注册时间"));
        tableHandle.add(Arrays.asList("房源数量"));
        tableHandle.add(Arrays.asList("每个类别对应的房源数量"));
        tableHandle.add(Arrays.asList("店铺url"));
        tableHandle.add(Arrays.asList("头像图片url"));
        tableHandle.add(Arrays.asList("账户余额"));
        tableHandle.add(Arrays.asList("推广优惠余额"));
        tableHandle.add(Arrays.asList("推广现金余额"));
        tableHandle.add(Arrays.asList("创建人用户名"));
        tableHandle.add(Arrays.asList("创建时间"));
        tableHandle.add(Arrays.asList("最后修改人用户名"));
        tableHandle.add(Arrays.asList("最后修改时间"));
        tableHandle.add(Arrays.asList("创建人归属的代理商id"));
        tableHandle.add(Arrays.asList("修改人归属的代理商id"));
        tableHandle.add(Arrays.asList("被绑定的代理商id"));
        tableHandle.add(Arrays.asList("绑定日期"));
        tableHandle.add(Arrays.asList("绑定方式"));

        return tableHandle;
    }

}
