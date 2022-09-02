package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.HDFSDao;
import ltd.newbee.mall.service.HDFSService;
import ltd.newbee.mall.util.TimeUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Properties;

/**
 * @className: ltd.newbee.mall.service.impl.HDFSServiceImpl
 * @description: TODO
 * @author: zhanghaox
 * @create: 2022-09-02 8:54
 */
@Service
public class HDFSServiceImpl implements HDFSService {

    /**
     * 吧json埋到hdfs
     * @param line
     */
    @Override
    public  void logToHDFS(String line) {
        FileSystem fileSystem = HDFSDao.getFileSystem();
        Properties properties = HDFSDao.getProperties();
        try {
            String path =properties.getProperty("spring.hdfs.NewBeeMailShoppingCartItemLogs")+ TimeUtils.getHDFSDTime() +".log";

            FSDataOutputStream outputStream=null;
            if (fileSystem.exists(new Path(path))){
//                存在
//            获取hdfs的输出流
                outputStream = fileSystem.append(new Path(path));
            }else {
//                不存在
//              只能追加，前提是文件存在
               outputStream = fileSystem.create(new Path(path));
            }
            Configuration conf = new Configuration();
            conf.set("dfs.client.block.write.replace-datanode-on-failure.policy","NEVER");
            conf.set("dfs.client.block.write.replace-datanode-on-failure.enable","true");
            //把String 变成inputStream

            IOUtils.copyBytes(org.apache.commons.io.IOUtils.toInputStream(line+"\r\n"),outputStream,conf,true);

            //关流

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    public static void main(String[] args) {
        new HDFSServiceImpl().logToHDFS("张三,20,男");
    }
}
