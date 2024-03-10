package com.wonni.boardback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wonni.boardback.entity.BoardListViewEntity;

@Repository
public interface BoardListViewRepository extends JpaRepository<BoardListViewEntity, Integer>{
    
}
