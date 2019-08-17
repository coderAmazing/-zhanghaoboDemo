package com.zhb.util;

import org.joda.time.DateTimeZone;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by developer on 17-3-15.
 */
public class DateUtil {
    public static final int SECONDS_IN_DAY = 60 * 60 * 24;
    public static final long MILLIS_IN_DAY = 1000L * SECONDS_IN_DAY;

    public static boolean isSameDayOfMillis(final long ms1, final long ms2) {
        final long interval = ms1 - ms2;
        return interval < MILLIS_IN_DAY
                && interval > -1L * MILLIS_IN_DAY
                && toDay(ms1) == toDay(ms2);
    }

    public static long toDay(long millis) {
        return (millis + TimeZone.getDefault().getOffset(millis)) / MILLIS_IN_DAY;
    }

    /**
     * 获取系统时间的相对时间。
     *
     * @param relativeDays 相对天数
     */
    public static Date getRelativeDate(int relativeDays) {
        Date dNow = new Date();   //当前时间
        Date dBefore = new Date();
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, relativeDays);  //设置为前一天
        dBefore = calendar.getTime();   //得到前一天的时间
        return dBefore;
    }

    /**
     * 获取指定时间对应的毫秒数
     *
     * @param time "HH:mm:ss"
     * @return
     */
    public static long getTimeMillis(String time) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
            DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
            Date curDate = dateFormat.parse(dayFormat.format(new Date()) + " " + time);
            return curDate.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String getTimeStr(String formatStr, Date time) {
        DateFormat dayFormat = new SimpleDateFormat(formatStr);
        return dayFormat.format(time);
    }

    public static Date getDate(long time) {
        try {
            DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
            DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
            Date curDate = dateFormat.parse(dayFormat.format(new Date(time)) + " 00:00:00");
            return curDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static long getTodayZeroPointTimestamps() {
        long currentTimestamps = System.currentTimeMillis();
        long oneDayTimestamps = Long.valueOf(60 * 60 * 24 * 1000);
        return currentTimestamps - (currentTimestamps + 60 * 60 * 8 * 1000) % oneDayTimestamps;
    }

    public static long getZeroPointTimestamps(long time) {
        long oneDayTimestamps = Long.valueOf(60 * 60 * 24 * 1000);
        return time - (time + 60 * 60 * 8 * 1000) % oneDayTimestamps;
    }

    public static  long getEndPointTimestamps(long time){
        return getZeroPointTimestamps(time)+(23*60*60+59*60+59)*1000+999;
    }
    public static DateTimeZone getTimeZone() {
        return DateTimeZone.forTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
    }

}
