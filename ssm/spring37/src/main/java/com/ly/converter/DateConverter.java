package com.ly.converter;



import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//其中泛型中类型为一对，前者为转日期前的字符串类，后者为转换成为的类型
public class DateConverter implements Converter<String, Date> {

    @Override
    //方法内部完成转换
    //将日期字符串转换成真正的日期对象
    public Date convert(String s) {
//        这里的格式是传参时候的格式，即在url输入的是类似yyyy-MM-dd格式的数据
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
