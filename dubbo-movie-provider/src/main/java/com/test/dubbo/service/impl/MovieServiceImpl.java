package com.test.dubbo.service.impl;

import com.test.dubbo.bean.Movie;
import com.test.dubbo.service.MovieService;

public class MovieServiceImpl implements MovieService {
    public Movie getNewMovie() {
        //模拟经过数据库操作，等一些列操作获取了最新的电影
        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("电影名");
        movie.setPrice(96.99);
        System.out.println("电影服务被调用");
        return movie;
    }
}
