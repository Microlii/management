package com.iotek.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
public class TimeUtil {
    public static void main(String[] args) {

    }

    public String getWorkTime(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        String month = String.valueOf(calendar.get(Calendar.MONTH)+1);
        String day = String.valueOf(calendar.get(Calendar.DATE));
        String wh =year+"-"+month+"-"+day+" ";
        return wh;
    }
    public String compareLate(){
        String late="";
        Date date = new Date();
        System.out.println(date);
        Long time = date.getTime();
        System.out.println(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String wh =getWorkTime()+"09:00:00";
        try {
            Date date1 = sdf.parse(wh);
            System.out.println(date1);
            Long time1 = date1.getTime();
            if (time.intValue()>time1.intValue()){
                late= "迟到";
            }else {
                late= "正常上班";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return late;
    }
    public String compareEarly(){
        String late="";
        Date date = new Date();
        Long time = date.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String wh =getWorkTime()+"17:00:00";

        try {
            Date date1 = sdf.parse(wh);
            Long time1 = date1.getTime();
            if (time.intValue()>time1.intValue()){
                late= "正常下班";
            }else {
                late= "早退";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return late;
    }
    public String completion(){
        String late="";
        Date date = new Date();
        Long time = date.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String wh =getWorkTime()+"09:30:00";

        try {
            Date date1 = sdf.parse(wh);
            Long time1 = date1.getTime();

            if (time.intValue()>time1.intValue()){
                late ="旷工";
            }else {
                    late ="正常";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return late;
    }
}
