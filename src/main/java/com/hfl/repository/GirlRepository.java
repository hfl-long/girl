package com.hfl.repository;

import com.hfl.domain.Girl;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:黄飞龙
 * @Date: Created in 10:06 2017/5/16
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    //通过年龄来查询
    public List<Girl> findByAge(Integer age);

    //通过罩杯来查询
    public List<Girl> findByCupSize(String cupSize);
}
