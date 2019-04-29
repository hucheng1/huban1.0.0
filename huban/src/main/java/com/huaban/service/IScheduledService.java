package com.huaban.service;

/**
 * 定时任务服务类
 */
public interface IScheduledService {

    /**
     * 使用定时任务,使ES搜索引擎的数据和数据库数据同步的执行方法。
     */
    void EsAndMySqlSynchronize();
}
