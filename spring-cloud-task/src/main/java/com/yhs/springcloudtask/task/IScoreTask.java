package com.yhs.springcloudtask.task;

import com.yhs.springcloudtask.dao.IScoreDao;
import com.yhs.springcloudtask.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Charles
 * @Title: IScoreTask
 * @Package com.yhs.springcloudtask.task
 * @Description: TODO
 * @date 2017/12/21 14:17
 */

//@Component
public class IScoreTask {

    @Autowired
    IScoreDao dao;

    public CommandLineRunner commandLineRunner(){
        return strings ->{
            List<Score> list = dao.getList();
            System.out.print(list.get(0).getSubjectName());
        };
    }
}
