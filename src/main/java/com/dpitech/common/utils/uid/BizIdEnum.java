package com.dpitech.common.utils.uid;

/**
 * @author rusheng
 */
public enum BizIdEnum {

    /**
     * 记录类型ID，例如实体、会员
     */
    RECORD(0L),

    /**
     * 线下实体店相关
     */
    SHOP(1L),

    /**
     * 无业务区分
     * 暂时保留
     */
    OTHER(7L);
    ;

    /**
     * bizId value
     */
    private final long val;

    public long getVal() { return this.val; }

    BizIdEnum(long val) {
        this.val = val;
    }

}
