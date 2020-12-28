package com.alibaba.chaosblade.exec.plugin.kafka.model;

import com.alibaba.chaosblade.exec.common.model.matcher.BasePredicateMatcherSpec;
import com.alibaba.chaosblade.exec.plugin.kafka.KafkaConstant;

/**
 * @author ljzhxx@gmail.com
 */
public class ProducerMatcherSpec extends BasePredicateMatcherSpec implements KafkaConstant {
    @Override
    public String getName() {
        return PRODUCER_KEY;
    }

    @Override
    public String getDesc() {
        return "";
    }

    @Override
    public boolean noArgs() {
        return true;
    }

    @Override
    public boolean required() {
        return false;
    }
}
