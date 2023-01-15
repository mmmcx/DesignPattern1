package com.study.designpattern.strategy;

import java.math.BigDecimal;

/**
 * 抽象策略类
 */
public interface MemberStrategy {
    /**
     * 计算价格的方法
     * @param originPrice 原价格
     * @param num 商品数量
     * @return
     */
    BigDecimal calcPrice(BigDecimal originPrice , int num);

    /**
     * 会员类型
     * @param type
     * @return
     */
    boolean supportMemberType(int type);

    /**
     * 获取会员类型
     * @return
     */
    Integer getMemberType();

}
