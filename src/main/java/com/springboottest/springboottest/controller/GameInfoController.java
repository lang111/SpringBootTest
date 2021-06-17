package com.springboottest.springboottest.controller;


import com.springboottest.springboottest.Bean.GameInfo;
import com.springboottest.springboottest.service.GameInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Lang
 * @since 2021-06-17
 */
@RestController
@RequestMapping("/tb/game-info")
public class GameInfoController {

    @Autowired
    private GameInfoService gameInfoService;
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping(value = "/gameInfo")
    public GameInfo getById(@RequestParam("id")String id){
        GameInfo byId = this.gameInfoService.getById(id);
        return byId;
    }

}

