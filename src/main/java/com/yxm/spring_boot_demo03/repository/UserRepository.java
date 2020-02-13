package com.yxm.spring_boot_demo03.repository;

import com.yxm.spring_boot_demo03.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2020/2/7
 * Time: 16:53
 * Description:
 */
public interface UserRepository extends JpaRepository<User, Long> {

    public List<User> findAll();

}