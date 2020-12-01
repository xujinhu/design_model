package com.xjh.decorator;

import java.math.BigDecimal;

/**
 * <p>Description: 杂粮煎饼,还有其他煎饼,省略</p>
 * @Date 2020-12-01
 * @author xujinhu
 */
public class CoarsePancake implements IPancake {

    @Override
    public BigDecimal cost() {
        return new BigDecimal(7);
    }
}
