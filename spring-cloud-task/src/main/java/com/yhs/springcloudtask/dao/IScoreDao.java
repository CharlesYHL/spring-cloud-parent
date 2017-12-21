package com.yhs.springcloudtask.dao;

import javax.transaction.Transactional;

import com.yhs.springcloudtask.entity.Score;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Charles
 * @Title: IScoreDao
 * @Package com.yhs.springcloudtask.dao
 * @Description: TODO
 * @date 2017/12/21 14:08
 */
public interface IScoreDao extends CrudRepository<Score, Integer> {
   /* @Transactional
    @Modifying
    @Query("update Score t set t.score = :score where t.id = :id")
    int updateScoreById(@Param("score") float score, @Param("id") int id);*/

    @Query("select t from Score t ")
    List<Score> getList();

}
