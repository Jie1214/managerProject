package com.caj.utils;

/**
 * @ClassName Demo
 * @Author lee
 * @Time 2019/2/18 16:09.
 */
public class LocationUtils {

    private static final double EARTH_RADIUS = 6378137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * <p>根据两点间经纬度坐标（double值），计算两点间距离，单位为米</p>
     * @param lon1
     * @param lat1
     * @param lon2
     * @param lat2
     * @return
     */
    public static double GetDistance(double lon1, double lat1, double lon2, double lat2)
    {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lon1) - rad(lon2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2) +
                Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000) / 10000;
        return s;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO 自动生成方法存根
        double distance = GetDistance(121.557163, 31.232083, 121.499809, 31.239666);
        System.out.println("Distance is:"+distance);
    }

}
