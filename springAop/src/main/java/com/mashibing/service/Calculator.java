package com.mashibing.service;

import org.springframework.stereotype.Service;

/**
 * @author sunpeng
 * @Date 2021-01-28 15:52
 */

public interface Calculator {
    public int add(Integer i, Integer j);
    public int sub(Integer i, Integer j);
    public int mult(Integer i, Integer j);
    public int div(Integer i, Integer j);
}
