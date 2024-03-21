package com.reevon.test.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reevon.test.domain.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

	// JPSRepositoryを使用するとメソッド名指定するだけでデータの取得してくれる
    public UserEntity findByUsername(String username);

}
