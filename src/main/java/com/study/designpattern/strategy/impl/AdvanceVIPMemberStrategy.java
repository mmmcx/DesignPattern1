package com.study.designpattern.strategy.impl;

import com.study.designpattern.strategy.MemberEnum;
import com.study.designpattern.strategy.MemberStrategy;

import java.math.BigDecimal;

/**
 * 超级vip
 * @author cx
 * @date 2022/9/14 00149:27
 */
public class AdvanceVIPMemberStrategy implements MemberStrategy {
    @Override
    public BigDecimal calcPrice(BigDecimal originPrice, int num) {
        BigDecimal multiply = originPrice.multiply(new BigDecimal(num));
        BigDecimal newPrice = multiply.multiply(new BigDecimal("0.2"));
        return multiply.subtract(newPrice);
    }

    @Override
    public boolean supportMemberType(int type) {
        return MemberEnum.ADVANCE_MEMBER.getType() == type;
    }

    @Override
    public Integer getMemberType() {

        return MemberEnum.ADVANCE_MEMBER.getType();
    }
}
