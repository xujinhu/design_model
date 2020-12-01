package com.xjh.decorator;

import java.math.BigDecimal;
/**
 * <p>Description: 火腿装饰着</p>
 * @Date 2020-12-01
 * @author xujinhu
 */
public class HamDecoratory extends AbstractDecorator {

    public HamDecoratory(IPancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(2).add(pancake.cost());
    }
}
