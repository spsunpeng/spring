package com.mashibing.service;

import com.mashibing.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sunpeng
 * @Date 2021-02-04 15:28
 */
@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    /**
     * 结账：传入哪个用户买了哪本书
     * @param username
     * @param id
     */
    @Transactional(timeout = 10)
    public void checkout(String username,int id){

        bookDao.updateStock(id);

        int price = bookDao.getPrice(id);
        bookDao.updateBalance(username,price);
        int i = 1/0;
    }
}
