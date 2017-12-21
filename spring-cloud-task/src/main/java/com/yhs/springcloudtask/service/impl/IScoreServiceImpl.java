package com.yhs.springcloudtask.service.impl;

import com.yhs.springcloudtask.dao.IScoreDao;
import com.yhs.springcloudtask.entity.Score;
import com.yhs.springcloudtask.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Charles
 * @Title: IScoreServiceImpl
 * @Package com.yhs.springcloudtask.service.impl
 * @Description: TODO
 * @date 2017/12/21 14:11
 */
@Service
public class IScoreServiceImpl implements IScoreService {

    @Autowired
    IScoreDao dao;

  /*  @Override
    public int updateScoreById(float score, int id) {
        return dao.updateScoreById(score,id);
    }*/

    @Override
    public List<Score> getList() {
        return dao.getList();
    }
}
