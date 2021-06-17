package com.springboottest.springboottest.impl;

import com.springboottest.springboottest.Bean.GameInfo;
import com.springboottest.springboottest.mapper.GameInfoMapper;
import com.springboottest.springboottest.service.GameInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lang
 * @since 2021-06-17
 */
@Service
public class GameInfoServiceImpl extends ServiceImpl<GameInfoMapper, GameInfo> implements GameInfoService {

}
