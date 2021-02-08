package com.test.dubbo.service.impl;

import com.test.dubbo.bean.Movie;
//import com.test.dubbo.bean.Order;
import com.test.dubbo.service.MovieService;
import com.test.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    MovieService movieService;

//    public MovieService getMovieService() {
//        return movieService;
//    }
//
//    public void setMovieService(MovieService movieService) {
//        this.movieService = movieService;
//    }


    public Movie buyNewMovie() {

        //Order order = new Order();
        //1.远程查询最新电影，并返回

        System.out.println("consumer消费者工程开始调用远程电影服务");
        Movie movie = movieService.getNewMovie();
        System.out.println("consumer消费者工程调用远程电影服务，获取了最新的电影"+movie);
        System.out.println("consumer消费者工程调用远程电影服务结束");



        //2.封装Order对象，并返回

//        order.setUserName(user.getUsername());
//        order.setMovieId(movie.getId());
//        order.setMovieName(movie.getMovieName());
        return movie;



    }
}
