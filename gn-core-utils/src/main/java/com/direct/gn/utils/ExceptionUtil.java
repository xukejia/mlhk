package com.direct.gn.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionUtil
{
    private static final Logger logger = LoggerFactory.getLogger(ExceptionUtil.class);

    
    public static String getStackTrace(Throwable throwable)
    {
    	String ss="";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        try
        {
            throwable.printStackTrace(pw);
            ss=sw.toString();
        } finally
        {
            pw.close();
        }
        return ss;
    }


    
    public static void main(String[] args)
    {

        
    }
}
