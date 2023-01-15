package com.study.designpattern.strategy;



import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

/**
 * 会员类型枚举
 * @author cx
 * @date 2022/9/14 001410:36
 */
public enum MemberEnum {
    PRIMARY_MEMBER(1,"普通用户"),
    VIP_MEMBER(2,"VIP用户"),
    ADVANCE_MEMBER(3,"超级VIP")
    ;

    @Getter
    private int type;

    @Getter
    private String desc;

    MemberEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getTypeByDesc(String desc){

        Optional<MemberEnum> first = Arrays.stream(values()).filter(v -> v.desc.equals(desc)).findFirst();
        return first.map(MemberEnum::getType).orElse(0);
    }



}
