import React from 'react'
import Footer from 'layouts/Footer';
import { Outlet, useLocation } from 'react-router-dom';
import Header from 'layouts/Header';
import { AUTH_PATH } from 'constant';

//            component: 레이아웃          //
export default function Container() {

  //            state: 현재 페이지 path name 상태       //
  const {pathname} = useLocation();
  
  //            render: 레이아웃          //
  return (
    <>
      <Header />
      <Outlet />
      {pathname !== AUTH_PATH() && <Footer />}
      
    </>
  )
}
