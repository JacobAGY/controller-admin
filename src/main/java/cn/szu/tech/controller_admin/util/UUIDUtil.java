package cn.szu.tech.controller_admin.util;


import java.util.UUID;

/**
 * UUID工具类
 */
public class UUIDUtil{

	/** 
     * 生成32位UUID编码
     */
    public static String getUuid(){
		return UUID.randomUUID().toString().trim().replaceAll("-", "");
    }
}
