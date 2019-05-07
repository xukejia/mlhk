package com.direct.gn.utils;

/**
 * 常用常量配置类
 * 
 * @author cc
 * 
 */
public interface Constant
{
    /**
     * UTF-8 字符集编码
     */
    String CHARACTER_ENCODING_UTF8 = "UTF-8";

    /**
     * GBK 字符集编码
     */
    String CHARACTER_ENCODING_GBK = "GBK";

    // ///////////////////////////////////////

    /**
     * 用户登录session
     */
    String SEESION_USER = "SESSION_USER";

    /**
     * 管理系统菜单
     */
    String MANAGER_SYSTEM_MENU = "MANAGER_SYSTEM_MENU";

    String MANAGER_SYSTEM_RIGHT_MAP = "MANAGER_SYSTEM_MENU_MAP";
    
    // =======================begin验证码key，add by Baker
    // Hou=======================
    /**
     * 图片验证码session key
     */
    String VERIFY_CODE_PICTRUE_SESSION_KEY = "VERIFY_CODE_PICTRUE_SESSION_KEY";

    /**
     * 手机短信验证码session key
     */
    String VERIFY_CODE_PHONE_MESSAGE_SESSION_KEY = "VERIFY_CODE_PHONE_MESSAGE_SESSION_KEY";

    // =======================begin验证码key=======================

    String AIRLINE_ALL = "ALL";
    
    
    /**
     * 系统配置 - 全局单程返点
     */
    String PARAM_GLOBAL_DE_REBATE = "PARAM_GLOBAL_DE_REBATE";
    
    /**
     * 系统配置 - 全局单程留钱
     */
    String PARAM_GLOBAL_DE_MONEY = "PARAM_GLOBAL_DE_MONEY";
    
    /**
     * 系统配置 - 全局单程最大留钱
     */
    String PARAM_GLOBAL_DE_MAX_MONEY = "PARAM_GLOBAL_DE_MAX_MONEY";
    
    
    
    /**
     * 系统配置 - 全局单程返点  中转
     */
    String PARAM_GLOBAL_DE_REBATE_TRANSIT = "PARAM_GLOBAL_DE_REBATE_TRANSIT";
    
    /**
     * 系统配置 - 全局单程留钱　中转
     */
    String PARAM_GLOBAL_DE_MONEY_TRANSIT = "PARAM_GLOBAL_DE_MONEY_TRANSIT";
    
    /**
     * 系统配置 - 全局单程最大留钱　中转
     */
    String PARAM_GLOBAL_DE_MAX_MONEY_TRANSIT = "PARAM_GLOBAL_DE_MAX_MONEY_TRANSIT";
    
    
    
    
    
    /**
     * 系统配置 - 全局往返返点
     */
    String PARAM_GLOBAL_BACK_REBATE = "PARAM_GLOBAL_BACK_REBATE";
    
    /**
     * 系统配置 - 全局往返留钱
     */
    String PARAM_GLOBAL_BACK_MONEY = "PARAM_GLOBAL_BACK_MONEY";
    
    /**
     * 系统配置 - 全局往返最大留钱
     */
    String PARAM_GLOBAL_BACK_MAX_MONEY = "PARAM_GLOBAL_BACK_MAX_MONEY";
    
    
    
    
    
    /**
     * 系统配置 - 全局往返返点　中转
     */
    String PARAM_GLOBAL_BACK_REBATE_TRANSIT = "PARAM_GLOBAL_BACK_REBATE_TRANSIT";
    
    /**
     * 系统配置 - 全局往返留钱　中转
     */
    String PARAM_GLOBAL_BACK_MONEY_TRANSIT = "PARAM_GLOBAL_BACK_MONEY_TRANSIT";
    
    /**
     * 系统配置 - 全局往返最大留钱　中转
     */
    String PARAM_GLOBAL_BACK_MAX_MONEY_TRANSIT = "PARAM_GLOBAL_BACK_MAX_MONEY_TRANSIT";
    
    
    
    /**
     * 系统配置 - 特殊任务停留时间
     */
    String PARAM_SPECIAL_TASK_TIME = "SPECIAL_TASK_TIME";
    
    /**
     * 系统配置 - 特殊任务停留时间
     */
    String PARAM_CACHE_CLEAR_DAY = "CACHE_CLEAR_DAY";
    
    /**
     * 系统配置 - 支付校验差额
     */
    String PARAM_PAY_MAX_LOSS = "PAY_MAX_LOSS";
    
    /**
     * 系统配置 - 验价变价差额
     */
    String PARAM_VERIFY_MAX_DIFF = "VERIFY_MAX_DIFF";
    
    /**
     * 系统配置 - 去哪儿支付校验差额
     */
    String PARAM_QN_PAY_MAX_LOSS = "QN_PAY_MAX_LOSS";
    
    /**
     * 系统配置 -  可售最少座位
     */
    String PARAM_PAY_SEATCOUNT_LIMIT = "PAY_SEATCOUNT_LIMIT";
    
    /**
     * 配置类型 - gw
     */
    String TYPE_GW = "gw";
    
    /**
     * gw配置 -  是否启用新政策(1开启,0关闭)
     */
    String GW_USE_NEW_POLICY_SET = "USE_NEW_POLICY_SET";
}
