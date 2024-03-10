package com.wonni.boardback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wonni.boardback.entity.FavoriteEntity;
import com.wonni.boardback.entity.privaryKey.FavoritePk;


@Repository
public interface FaveriteRepository extends JpaRepository<FavoriteEntity, FavoritePk>{
    
}
