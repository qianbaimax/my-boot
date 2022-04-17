package com.atguigu.boot01helloworld.service.impl;

import com.atguigu.boot01helloworld.service.TestRetry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @author chenlong
 * @since 2022/4/17 9:22
 */
@Service
@Slf4j
public class TestRetryImpl implements TestRetry {
    /**
     * 测试重试
     *
     * @return
     */
    @Override
    @Retryable(backoff = @Backoff(delay = 3000, multiplier = 1.5), recover = "otherRecover")
    public String getTestRetryResult() throws Exception {
        log.info("service方法开始执行");
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            log.info("catch中报错了哈哈");
            throw new RuntimeException("抛出异常");
        }
        return "service方法执行结束";
    }

    /**
     * 所有重试失败之后执行的方法,必须和重试方法放在同一个类中
     *
     * @param e
     * @return
     */
    @Recover
    public String recover(Exception e) {
        log.info("最终还是失败");
        return "最终结果失败";
    }

    @Recover
    public String otherRecover(Exception e) {
        log.info("otherRecover最终还是失败");
        return "otherRecover最终结果失败";
    }
}
