package ltd.newbee.mall.dao;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

import java.io.IOException;
import java.net.URI;

import java.util.Properties;

/**
 * @className: ltd.newbee.mall.dao.HDFSDao
 * @description: TODO
 * @author: zhanghaox
 * @create: 2022-09-02 8:37
 */
public class HDFSDao {
    static FileSystem fileSystem;
    static Properties properties;

    static {
        //properties
        properties = new Properties();

        try {
//            加载配置文件
            properties.load(HDFSDao.class.getClassLoader().getResourceAsStream("application.properties"));

            Configuration conf = new Configuration();
            conf.set("dfs.client.block.write.replace-datanode-on-failure.policy","NEVER");
            conf.set("dfs.client.block.write.replace-datanode-on-failure.enable","true");

             fileSystem = FileSystem.get(URI.create(properties.getProperty("spring.hdfs.url")),conf,"zhx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 增加
     * 对外提供一个方法 获取fileSystem
     */
    public static FileSystem getFileSystem(){
        return fileSystem;
    }
    public static Properties getProperties(){
        return properties;
    }
}
