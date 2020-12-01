package com.xjh.decorator;

import java.math.BigDecimal;
/**
 * <p>Description: 辣条装饰者</p>
 * @Date 2020-12-01
 * @author xujinhu
 */
public class LaTiaoDecoratory extends AbstractDecorator {

    public LaTiaoDecoratory(IPancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(3).add(pancake.cost());
    }
}
