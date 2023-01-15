package com.study.designpattern.strategy.impl;

import com.study.designpattern.strategy.MemberEnum;
import com.study.designpattern.strategy.MemberStrategy;

import java.math.BigDecimal;

/**
 * 普通会员
 * @author cx
 * @date 2022/9/14 00149:23
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    /**
     * 重写策略方法
     * @param originPrice 原价格
     * @param num 商品数量
     * @return
     */

    @Override
    public BigDecimal calcPrice(BigDecimal originPrice, int num) {
        if (originPrice == null ) {
            return BigDecimal.ZERO;
        }
        return originPrice .multiply(new BigDecimal(num));
    }

    @Override
    public boolean supportMemberType(int type) {
        return MemberEnum.PRIMARY_MEMBER.getType() == type;
    }

    @Override
    public Integer getMemberType() {

        return MemberEnum.PRIMARY_MEMBER.getType();
    }
}
