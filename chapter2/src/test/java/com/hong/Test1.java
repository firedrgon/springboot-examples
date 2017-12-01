package com.hong;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sheny on 2017/11/29.
 */
public class Test1 {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void test() {
        logger.warn("test={},test2={}", "test", "test");
        String str = "str%s,%d,%b";
        System.out.println(String.format(str, "str", 3, true));
    }
}
