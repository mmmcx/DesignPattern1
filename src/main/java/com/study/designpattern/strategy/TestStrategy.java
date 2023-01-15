package com.study.designpattern.strategy;

import com.study.designpattern.strategy.factory.MemberStrategyFactory;
import com.study.designpattern.strategy.impl.AdvanceVIPMemberStrategy;
import com.study.designpattern.strategy.impl.PrimaryMemberStrategy;
import com.study.designpattern.strategy.impl.VIPMemberStrategy;
import com.study.designpattern.strategy.strategycontext.MemberStrategyContext;

import java.math.BigDecimal;

/**
 * 测试策略模式
 * @author cx
 * @date 2022/9/14 00149:33
 */
public class TestStrategy {

    public static void main(String[] args) {

        //普通
        MemberStrategyContext primaryContext = new MemberStrategyContext(new PrimaryMemberStrategy());
        //普通vip
        MemberStrategyContext VIPContext = new MemberStrategyContext(new VIPMemberStrategy());
        //高级vip
        MemberStrategyContext AdvanceContext = new MemberStrategyContext(new AdvanceVIPMemberStrategy());

        System.out.println("普通价格:" + primaryContext.qoutePrice(new BigDecimal("30"),2));
        System.out.println("VIP价格:" + VIPContext.qoutePrice(new BigDecimal("30"),2));
        System.out.println("超级vip：" + AdvanceContext.qoutePrice(new BigDecimal("30"),2));

        System.out.println("策略+工厂模式 替换if-else================");

        MemberStrategy instanceByType = MemberStrategyFactory.getInstanceByType(2);
        System.out.println("实例===========>>" + instanceByType);
        assert instanceByType != null;
        System.out.println("价格为:"+instanceByType.calcPrice(new BigDecimal("30"), 2));

        System.out.println(MemberStrategyFactory.doHandlePrice(2, new BigDecimal("30"), 2));
    }

}
