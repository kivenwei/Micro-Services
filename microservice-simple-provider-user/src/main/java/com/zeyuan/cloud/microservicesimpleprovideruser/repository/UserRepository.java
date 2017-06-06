package com.zeyuan.cloud.microservicesimpleprovideruser.repository;

import com.zeyuan.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by weiwei on 2017/6/5.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
