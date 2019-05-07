package com.direct.gn.datasource;

/**
 * Created by w2017 on 2017/6/22.
 */
public class DBContextHolder {
    /**
     * 线程threadlocal
     */
    private static ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static String DB_TYPE_RW = "dataSource";
    public static String DB_TYPE_R = "dataSource_R";

    public static String getDbType() {
        String db = contextHolder.get();
        if (db == null) {
            db = DB_TYPE_RW;// 默认是读写库
        }
        return db;
    }

    /**
     * 设置本线程的dbtype
     */
    public static void setDbType(String str) {
        contextHolder.set(str);
    }

    /**
     * clearDBType
     *
     * @Title: clearDBType
     * @Description: 清理连接类型
     */
    public static void clearDBType() {
        contextHolder.remove();
    }
}
