package com.dpitech.common.utils.uid;


/**
 *
 * 可扩展的全局id生成模版类
 *
 * @author rusheng
 */
public abstract class AbstractUnionIdProcessor implements UnionIdProcessor {

    /**
     * dpitech union id generator
     */
    private final GlobalIdCore core = new GlobalIdCore(getMachineIdPart());

    /**
     * 获取全局id，设置为指定的identity位
     * @return long union id
     */
    @Override
    public long getUnionId() {
        return core.getUnionId(getBizIdPart());
    }

}
