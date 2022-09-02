package ltd.newbee.mall.service;

/**
 * @className: ltd.newbee.mall.service.HDFSService
 * @description: TODO
 * @author: zhanghaox
 * @create: 2022-09-02 8:53
 */
public interface HDFSService {
    /**
     * 把埋点的json数据写入HDFS
     */
    public void logToHDFS(String line);
}
