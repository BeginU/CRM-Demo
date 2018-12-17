package com.example.test.Utils;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 测试主函数·
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-10-24 14:33
 **/
public class TestMain {
    @Test
    public void test() throws Exception{
        ActiveBaseInfo activeBaseInfo = new ActiveBaseInfo();
        activeBaseInfo.setActiveType(1);
        activeBaseInfo.setActiveName("111");
        try {
            ParamCheckUtil.checkParam(activeBaseInfo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
