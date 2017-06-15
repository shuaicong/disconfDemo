package com.alter.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;



@Service
@Scope("singleton")
@DisconfFile(filename = "global.xml")
public class GlobalCache {
	
	
	private static String [] CLOSE_CHANNEL;
	
	/** IMSI运营商标记 */
	private static Map<String, String> carriers = new HashMap<String, String>();
	
	/** ICCID运营商标记 */
	private static Map<String, String> carrierIccids = new HashMap<String, String>();

	/** 移动手机号省份标识 */
	private static Map<String, String> mobileProvinces = new HashMap<String, String>();
	
	/** 省份对应号段ID */
	private static Map<String, String> provinceIdMobiles = new HashMap<String, String>();
	
	/** 联通手机身份标识 */
	private static Map<String, String> unicomProvinces = new HashMap<String, String>();
	
	/** 省份编码 */
	private static Map<String, String> provinces = new HashMap<String, String>();
	
	private static long [] payUserBlacks;
	private static String [] payImeiBlacks;
	
	
	public static String cornet;//短信网关短号(移动)
	public static String mobileCornet;//短信网关短号(移动)
	public static String unicomCornet;//短信网关短号
	public static String telecomCornet;//短信网关短号
	
	//登陆AES加密开关
	public static boolean AesEncrypt = false;
	
	
	
	
	@DisconfFileItem(name = "global.close-channel", associateField = "close-channel")
	public static String[] getCLOSE_CHANNEL() {
		return CLOSE_CHANNEL;
	}





	public static void setCLOSE_CHANNEL(String[] cLOSE_CHANNEL) {
		CLOSE_CHANNEL = cLOSE_CHANNEL;
	}





	public static Map<String, String> getCarriers() {
		return carriers;
	}





	public static void setCarriers(Map<String, String> carriers) {
		GlobalCache.carriers = carriers;
	}





	public static Map<String, String> getCarrierIccids() {
		return carrierIccids;
	}





	public static void setCarrierIccids(Map<String, String> carrierIccids) {
		GlobalCache.carrierIccids = carrierIccids;
	}





	public static Map<String, String> getMobileProvinces() {
		return mobileProvinces;
	}





	public static void setMobileProvinces(Map<String, String> mobileProvinces) {
		GlobalCache.mobileProvinces = mobileProvinces;
	}





	public static Map<String, String> getProvinceIdMobiles() {
		return provinceIdMobiles;
	}





	public static void setProvinceIdMobiles(Map<String, String> provinceIdMobiles) {
		GlobalCache.provinceIdMobiles = provinceIdMobiles;
	}





	public static Map<String, String> getUnicomProvinces() {
		return unicomProvinces;
	}





	public static void setUnicomProvinces(Map<String, String> unicomProvinces) {
		GlobalCache.unicomProvinces = unicomProvinces;
	}





	public static Map<String, String> getProvinces() {
		return provinces;
	}





	public static void setProvinces(Map<String, String> provinces) {
		GlobalCache.provinces = provinces;
	}





	public static long[] getPayUserBlacks() {
		return payUserBlacks;
	}





	public static void setPayUserBlacks(long[] payUserBlacks) {
		GlobalCache.payUserBlacks = payUserBlacks;
	}





	public static String[] getPayImeiBlacks() {
		return payImeiBlacks;
	}





	public static void setPayImeiBlacks(String[] payImeiBlacks) {
		GlobalCache.payImeiBlacks = payImeiBlacks;
	}




	@DisconfFileItem(name = "global.sms-gateway.cornet", associateField = "cornet")
	public static String getCornet() {
		return cornet;
	}





	public static void setCornet(String cornet) {
		GlobalCache.cornet = cornet;
	}





	public static String getMobileCornet() {
		return mobileCornet;
	}





	public static void setMobileCornet(String mobileCornet) {
		GlobalCache.mobileCornet = mobileCornet;
	}





	public static String getUnicomCornet() {
		return unicomCornet;
	}





	public static void setUnicomCornet(String unicomCornet) {
		GlobalCache.unicomCornet = unicomCornet;
	}





	public static String getTelecomCornet() {
		return telecomCornet;
	}





	public static void setTelecomCornet(String telecomCornet) {
		GlobalCache.telecomCornet = telecomCornet;
	}





	public static boolean isAesEncrypt() {
		return AesEncrypt;
	}





	public static void setAesEncrypt(boolean aesEncrypt) {
		AesEncrypt = aesEncrypt;
	}





	public static void main(String[] args) throws Exception {
	}
	
}
