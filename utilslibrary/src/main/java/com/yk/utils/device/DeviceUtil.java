package com.yk.utils.device;

import android.os.Build;

public class DeviceUtil {
    /**
     * 获取厂商名称
     * @return
     */
    public static String getManufacturer(){
        return Build.MANUFACTURER;
    }

    /**
     * 获取产品名称
     * @return
     */
    public static String getProduct(){
        return Build.PRODUCT;
    }

    /**
     * 获取手机品牌
     * @return
     */
    public static String getBrand(){
        return Build.BRAND;
    }

    /**
     * 获取手机型号
     * @return
     */
    public static String getModel(){
        return Build.MODEL;
    }

    /**
     * 获取手机主板名称
     * @return
     */
    public static String getBoard(){
        return Build.BOARD;
    }

    /**
     * 获取设备名
     * @return
     */
    public  static String getDevice(){
        return Build.DEVICE;
    }

    /**
     *获取硬件序列
     * @return
     */
    public static String getDerial(){
        return Build.SERIAL;
    }

    /**
     * 获取手机Andord 系统SDK
     * @return
     */
    public static int getSDK(){
        return Build.VERSION.SDK_INT;
    }

    /**
     * 获取手机Android版本
     * @return
     */
    public static String getAndroidVersion(){
        return Build.VERSION.RELEASE;
    }

}
