/**
 * com.direct.gn
 */
package com.direct.gn.enums;


/**
 * @author cc
 *
 */
public interface BaseEmun
{
    String getEmunByCode(String code);
 
    String getCode();
    
    String getMsg();
    
    BaseEmun[] getBaseEmuns();
}
