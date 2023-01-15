package com.study.designpattern.strategy.impl;

import com.study.designpattern.strategy.MemberEnum;
import com.study.designpattern.strategy.MemberStrategy;

import java.math.BigDecimal;

/**
 * VIP
 * @author cx
 * @date 2022/9/14 00149:21
 */
public class VIPMemberStrategy implements MemberStrategy {
    @Override
    public BigDecimal calcPrice(BigDecimal originPrice, int num) {

        if (originPrice == null) {
            return BigDecimal.ZERO;
        }
        BigDecimal multiply = originPrice.multiply(new BigDecimal(num));
        BigDecimal newPrice = multiply.multiply(new BigDecimal("0.1"));
        return multiply.subtract(newPrice);
    }

    @Override
    public boolean supportMemberType(int type) {
        return MemberEnum.VIP_MEMBER.getType() == type;
    }

    @Override
    public Integer getMemberType() {

        return MemberEnum.VIP_MEMBER.getType();
    }
}
