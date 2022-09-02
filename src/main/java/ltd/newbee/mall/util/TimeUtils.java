package ltd.newbee.mall.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @className: ltd.newbee.mall.util.TimeUtils
 * @description: TODO
 * @author: zhanghaox
 * @create: 2022-09-02 9:15
 */
public class TimeUtils {
    public static String getHDFSDTime(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        String format1 = format.format(new Date());
        return format1;
    }
}
