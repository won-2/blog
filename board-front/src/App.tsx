import React, { useState } from 'react';
import './App.css';
import BoardItem from 'components/BoardItem';
import { latestBoardListMock, top3BoardListMock, commentListMock, favoriteListMock } from 'mocks';
import Top3Item from 'components/Top3Item';
import CommentItem from 'components/CommentItem/inedex';
import FavoriteItem from 'components/FavoriteItem';
import InputBox from 'components/InputBox';

function App( ) {

  const [value, setValue] = useState<string>('');
  return (
    <>
      <InputBox label='이메일' type='text' placeholder='이메일 주소를 입력해 주세요' value={value} error={true} setValue={setValue} message='9738294732984' />
      
    </>
  );
}

export default App;
