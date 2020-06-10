package xyz.ieden.example.mapstruct.bo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/5/21 14:56
 */
public class CustomerMapperTest {

    private static Customer customer;
    private static CustomerDto customerDto;

    @BeforeClass
    public static void init() {
        customerDto = new CustomerDto();
        customerDto.id = 100L;
        customerDto.customerName = "test_name";

    }

    @Test
    public void toCustomer() {
        CustomerMapper customerMapper = CustomerMapper.INSTANCE;
        Customer customer = customerMapper.toCustomer(customerDto);

        printInfo(customer);
    }

    private void printInfo(Customer customer) {
        System.out.println(ToStringBuilder.reflectionToString(customer, ToStringStyle.JSON_STYLE));
    }

}
