package org.example.s01.a05.component;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author qlk
 */
@Component
public class Bean2 {
    private static final Logger log = LoggerFactory.getLogger(Bean2.class);

    public Bean2() {
        log.debug("我被Spring管理了");
    }
}
