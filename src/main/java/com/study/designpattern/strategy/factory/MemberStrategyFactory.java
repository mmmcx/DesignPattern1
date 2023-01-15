package com.study.designpattern.strategy.factory;

import com.study.designpattern.strategy.MemberStrategy;
import com.study.designpattern.strategy.impl.AdvanceVIPMemberStrategy;
import com.study.designpattern.strategy.impl.PrimaryMemberStrategy;
import com.study.designpattern.strategy.impl.VIPMemberStrategy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工厂模式
 * @author cx
 * @date 2022/9/14 001414:06
 */
@Component
public class MemberStrategyFactory implements InitializingBean, ApplicationContextAware {

    private ApplicationContext appContext;

//    @Autowired
    private static List<MemberStrategy> memberStrategies = new ArrayList<>(3);

    private static Map<Integer,MemberStrategy> memberStrategyMap = new HashMap<>(3);
//
//    static {
//        memberStrategies.add(new AdvanceVIPMemberStrategy());
//        memberStrategies.add(new VIPMemberStrategy());
//        memberStrategies.add(new PrimaryMemberStrategy());
//    }

    public static MemberStrategy getInstanceByType(int type){

        for (MemberStrategy memberStrategy : memberStrategies) {
            if (memberStrategy.supportMemberType(type)) {
                return memberStrategy;
            }
        }
        return null;
    }

    public static BigDecimal doHandlePrice(Integer memberType,BigDecimal price,int num){

        if (memberStrategies != null && memberStrategies.size() >0) {
            for (MemberStrategy memberStrategy : memberStrategies) {
                if (memberStrategy.supportMemberType(memberType)) {
                    return memberStrategy.calcPrice(price, num);
                }
            }
        }
        return BigDecimal.ZERO;

    }


    @Override
    public void afterPropertiesSet() throws Exception {
        // 将 Spring 容器中所有的 MemberStrategy 注册到 memberStrategyMap
        appContext.getBeansOfType(MemberStrategy.class).values()
                .forEach(handler -> memberStrategyMap.put(handler.getMemberType(),handler));

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        appContext = applicationContext;
    }

    public MemberStrategy getHandler(Integer memberType){
        return memberStrategyMap.get(memberType);
    }
}
