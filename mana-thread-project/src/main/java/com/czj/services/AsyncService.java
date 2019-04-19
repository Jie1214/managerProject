package com.czj.services;

import org.springframework.stereotype.Component;

/**
 * Created by Jie on 2019/4/8.
 *
 * @AUTHOR JIE
 * @date 2019/4/8
 */
@Component
public interface AsyncService {

    /**
     * 执行异步任务
     */
    void executeAsync();
}
