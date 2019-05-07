package com.direct.gn.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtil
{
    private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);

    
    public static int getAge(String birthday, String format)
    {
    	int age=0;
    	try {
			int d=DateUtil.diffDaysfToNow(birthday, format);
			age=d/365;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
    	return age;
    	
    }
    /**
     * if date1 > date2 get date1 , else get data2
     * 
     * @param date1
     * @param date2
     * @return
     */
    public static String getDate(String date1, String date2)
    {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            calendar1.setTime(df.parse(date1));
            calendar2.setTime(df.parse(date2));
        } catch (ParseException e)
        {
            logger.error(e.getMessage(), e);
        }

        if (calendar1.compareTo(calendar2) >= 0)
        {
            return df.format(calendar1.getTime());
        }

        return df.format(calendar2.getTime());
    }

    /**
     * date1 >= date2 = true . date1 == null is return true
     * 
     * @param date1
     * @param date2
     * @return
     */
    public static boolean compareDate(String date1, String date2)
    {
        if (StringUtils.isEmpty(date1))
        {
            return true;
        }

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            calendar1.setTime(df.parse(date1));
            calendar2.setTime(df.parse(date2));
        } catch (ParseException e)
        {
            logger.error(e.getMessage(), e);
            return false;
        }

        return (calendar1.compareTo(calendar2) >= 0);
    }

    /**
     * date1 >= date2 = true . date1 == null is return true
     * 
     * @param date1
     * @param date2
     * @return
     */
    public static boolean compareDate2(String date1, String date2)
    {
        if (StringUtils.isEmpty(date1))
        {
            return true;
        }

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try
        {
            calendar1.setTime(df.parse(date1));
            calendar2.setTime(df.parse(date2));
        } catch (ParseException e)
        {
            logger.error(e.getMessage(), e);
            return false;
        }

        return (calendar1.compareTo(calendar2) >= 0);
    }

    /**
     * currTime > date + number(hour) = true
     * 
     * @param date
     * @param number
     * @return
     */
    public static boolean compareCurrTime(String date, int number)
    {
        Calendar curr = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try
        {
            calendar2.setTime(df.parse(date));
        } catch (ParseException e)
        {
            logger.error(e.getMessage(), e);
        }

        calendar2.add(Calendar.HOUR, number);

        return (curr.compareTo(calendar2) > 0);
    }

    public static long getDateTimeBySubCurrTime(String dateTime, int number)
    {
        Calendar curr = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try
        {
            calendar2.setTime(df.parse(dateTime));
        } catch (ParseException e)
        {
            logger.error(e.getMessage(), e);
        }

        calendar2.add(Calendar.DAY_OF_YEAR, number);

        long tmp = calendar2.getTimeInMillis() - curr.getTimeInMillis();

        if (tmp < 0)
        {
            tmp = 0;
        }

        return tmp;
    }

    public static String getNextDate(String date, int addDay)
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        try
        {
            calendar.setTime(df.parse(date));
        } catch (ParseException e)
        {
            logger.error(e.getMessage(), e);
        }
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + addDay);

        String d = df.format(calendar.getTime());

        return d;
    }

    public static String getNextDate(String date, int addDay, String retFormat)
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if (StringUtils.isEmpty(retFormat))
            retFormat = "yyyy-MM-dd";
        DateFormat df1 = new SimpleDateFormat(retFormat);

        Calendar calendar = Calendar.getInstance();
        try
        {
            calendar.setTime(df.parse(date));
        } catch (ParseException e)
        {
            logger.error(e.getMessage(), e);
        }
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + addDay);

        String d = df1.format(calendar.getTime());

        return d;
    }

    public static String getFormatDate(String date, String curFormat, String retFormat)
    {
        DateFormat df = new SimpleDateFormat(curFormat, Locale.ENGLISH);
        DateFormat df1 = new SimpleDateFormat(retFormat, Locale.ENGLISH);

        Calendar calendar = Calendar.getInstance();
        try
        {
            calendar.setTime(df.parse(date));
        } catch (ParseException e)
        {
            logger.error(e.getMessage(), e);
        }

        String d = df1.format(calendar.getTime());

        return d;
    }

    public static String getCurrDate()
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        String d = df.format(calendar.getTime());

        return d;
    }

    public static String getCurrDate(String format)
    {
        DateFormat df = new SimpleDateFormat(format);
        Calendar calendar = Calendar.getInstance();
        String d = df.format(calendar.getTime());

        return d;
    }

    public static String getDate(String format, String format1, String dateStr)
    {
        String d = null;
        DateFormat df = new SimpleDateFormat(format);
        DateFormat df1 = new SimpleDateFormat(format1);
        Date date = null;
        try
        {
            date = df.parse(dateStr);
            d = df1.format(date);
        } catch (ParseException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return d;
    }

    public static String getCurrDateTime()
    {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String d = df.format(calendar.getTime());

        return d;
    }
    
    public static String getGMTCurrDateTime()
    {

		   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   Calendar cal = Calendar.getInstance(new SimpleTimeZone(0, "GMT"));
		   format.setCalendar(cal);
		   return format.format(Calendar.getInstance().getTime());
		  
    }
    
    public static int getCurrHours()
    {
        return new Date().getHours();
    }

	/**
	 * 两日期相隔的天数
	 * 
	 * @param d1
	 * @param d2
	 * @param pf-日期格式  
	 * @return
	 */
	public static int diffDays(String d1, String d2, String pf) {
		int days = -1;
		try {
			DateFormat df = new SimpleDateFormat(pf);
			Date date1 = df.parse(d1);
			Date date2 = df.parse(d2);
			days = (int) (Math.abs(date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
		} catch (ParseException e) {
			logger.error(e.getMessage(), e);
		}
		return days;
	}
	
	/**
	 * 两日期相隔的天数(yyyyMMdd)
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static int diffDays1(String d1, String d2) {
		return diffDays(d1, d2, "yyyyMMdd");
	}
	
	/**
	 * 与当前日期相隔的天数(yyyyMMdd)
	 * 
	 * @param d1
	 * @return
	 */
	public static int diffDays1(String d1) {
		String p = "yyyyMMdd";
		return diffDays(d1, new SimpleDateFormat(p).format(new Date()), p);
	}
	
	/**
	 * 与当前日期相隔的天数(yyyyMMdd)
	 * 
	 * @param d1
	 * @param  format
	 * @return
	 */
	public static int diffDaysfToNow(String d1,String format) {
		String p =format;
		return diffDays(d1, new SimpleDateFormat(p).format(new Date()), p);
	}

    
    public static void main(String[] args)
    {
        //SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HHmmss");
    	SimpleDateFormat format = new SimpleDateFormat("ddMMyyHHmm");
		Calendar cal = Calendar.getInstance();
		//cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) + 2);
		cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) + 60);
		Date date=cal.getTime();
        System.out.println(format.format(date));
        System.out.println(format.format(date).substring(0, 6));
        System.out.println(format.format(date).substring(6, 10));
        System.out.println(getCurrDateTime());
        
    }
}
