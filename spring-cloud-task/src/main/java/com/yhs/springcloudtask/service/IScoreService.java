package com.yhs.springcloudtask.service;

import com.yhs.springcloudtask.entity.Score;

import java.util.List;

/**
 * @author Charles
 * @Title: IScoreService
 * @Package com.yhs.springcloudtask.service
 * @Description: TODO
 * @date 2017/12/21 14:10
 */
public interface IScoreService {
    /*int updateScoreById(float score, int id);*/
    List<Score> getList();
}
