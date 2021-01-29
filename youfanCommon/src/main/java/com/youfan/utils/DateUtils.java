package com.youfan.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static Date tranferTimeBy(String time, String formatString){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString);
        Date date = null;
        try {
            date = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
