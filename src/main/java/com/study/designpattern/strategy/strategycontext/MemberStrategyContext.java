package com.study.designpattern.strategy.strategycontext;


import com.study.designpattern.strategy.MemberStrategy;

import java.math.BigDecimal;

/**
 * 策略上下文
 * @author cx
 * @date 2022/9/14 00149:29
 */
public class MemberStrategyContext {

    private MemberStrategy memberStrategy;
    public MemberStrategyContext(MemberStrategy memberStrategy){
        this.memberStrategy = memberStrategy;
    }

    public BigDecimal qoutePrice(BigDecimal price , int num){

        return memberStrategy.calcPrice(price, num);
    }

}
