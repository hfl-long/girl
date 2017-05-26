package com.hfl.service;


import com.hfl.domain.Girl;
import com.hfl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:黄飞龙
 * @Date: Created in 12:19 2017/5/16
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional//事物注解
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("BBBBB");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age < 10){
            //返回你还在上小学吧
            throw new Exception("你还在上小学吧");
        }else if (age > 10 && age <16){
            //返回你可能在上初中
            throw new Exception("你可能在上初中");
        }

        //如果>16,加钱
        //..

    }
}
