package com.wonni.boardback.entity;

import com.wonni.boardback.entity.privaryKey.FavoritePk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="faverite")
@Table(name="faverite")
@IdClass(FavoritePk.class)
public class FavoriteEntity {
    
    @Id
    private String userEmail;
    @Id
    private int boardNumber;
}
