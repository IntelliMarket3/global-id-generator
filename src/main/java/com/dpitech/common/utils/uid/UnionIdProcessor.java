package com.dpitech.common.utils.uid;

/**
 *
 * 统一id interface
 *
 * @author rusheng
 */
public interface UnionIdProcessor {

    /**
     * 获取全局id，设置为指定的identity位
     * @return long union id
     */
    long getUnionId();

    /**
     * 如何得到业务Id
     * @return long
     */
    long getBizIdPart();

    /**
     * 如何得到机器Id
     * @return long
     */
    long getMachineIdPart();

}
