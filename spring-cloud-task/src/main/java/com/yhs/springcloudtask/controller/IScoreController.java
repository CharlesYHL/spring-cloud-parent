package com.yhs.springcloudtask.controller;

import com.yhs.springcloudtask.entity.Score;
import com.yhs.springcloudtask.service.IScoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Charles
 * @Title: IScoreController
 * @Package com.yhs.springcloudtask.controller
 * @Description: TODO
 * @date 2017/12/21 14:14
 */
@RestController
@RequestMapping("/score")
public class IScoreController {
    private static final Logger logger = LoggerFactory.getLogger(IScoreController.class);


    @Autowired
    private IScoreService scoreService;

    @RequestMapping("/scoreList")
    public List<Score> getScoreList(){
        logger.info("从数据库读取Score集合");
        // 测试更新数据库
        //logger.info("更新的行数：" + scoreService.updateScoreById(88.8f, 2));
        //scoreService.delete(23);

        return scoreService.getList();
    }
}
