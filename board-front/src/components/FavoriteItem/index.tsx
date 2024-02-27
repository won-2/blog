import React from 'react';
import './style.css';
import { FavoriteListItem } from 'types/interface';
import defaultProfileImage from 'assets/images/default-profile-image.png'

interface Props{
  favoriteListItem: FavoriteListItem;
}


//              component: Favorite List Item 컴포넌트 
export default function FavoriteItem({favoriteListItem}: Props ) {

  //              properties
  const {profileImage, nickname } = favoriteListItem;
  
  //            render : Favorit List Item 랜더링
  return (
    <div className='favorite-list-item'>
      <div className='favorite-list-item-profile-box'>
        <div className='favorite-list-item-profile-image' style={{ backgroundImage: `url(${profileImage? profileImage: defaultProfileImage})`}}></div>
      </div>
      <div className='favorite-list-item-nickname'>{nickname}</div>
    </div>
  )
    
}
