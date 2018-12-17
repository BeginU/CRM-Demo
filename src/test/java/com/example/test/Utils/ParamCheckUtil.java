package com.example.test.Utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 参数检验工具类
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-10-24 13:42
 **/
public class ParamCheckUtil {

    public static void checkParam(Object object) throws Exception{
        if(object == null){
            throw new ParamCheckException("入参为空！");
        }
        Field[] fields = object.getClass().getDeclaredFields();
        for(Field field : fields){
            // 设置private为可以访问权限
            field.setAccessible(true);
            Object value = field.get(object);
            Validated validated = field.getAnnotation(Validated.class);
            // 如果有加验证注解，则开始验证
            if(validated != null){
                if(validated.isNotNull()){
                    if("".equals(value) || value == null){
                        throw new ParamCheckException(validated.description());
                    }
                }else {
                    // 不需要验证则判断是否有值，没有值就直接返回
                    if (value == null) {
                        return;
                    }
                }
            }
            field.setAccessible(false);
        }
    }
}
