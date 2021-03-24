import React from 'react';
import { NavLink } from 'react-router-dom';
import { Menu } from 'antd';

import {
  HOME_PAGE,
  LISTING_POSTS_PAGE,
  PRIVACY_PAGE,
  PRICING_PLAN_PAGE,
  AGENT_PROFILE_PAGE,
} from 'settings/constant';

const FooterMenu = () => {
  return (
    <Menu>
      <Menu.Item key="0">
        <NavLink to={`${HOME_PAGE}`}>Home</NavLink>
      </Menu.Item>
      <Menu.Item key="1">
        <NavLink to={`${LISTING_POSTS_PAGE}`}>Exhibition</NavLink>
      </Menu.Item>
      <Menu.Item key="2">
        <NavLink to={`${AGENT_PROFILE_PAGE}`}>Hall</NavLink>
      </Menu.Item>
      <Menu.Item key="3">
        <NavLink to={`${PRICING_PLAN_PAGE}`}>MyPage</NavLink>
      </Menu.Item>
    </Menu>
  );
};

export default FooterMenu;
