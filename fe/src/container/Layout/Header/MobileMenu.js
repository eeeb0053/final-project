import React, { useContext } from 'react';
import { NavLink } from 'react-router-dom';
import { Menu } from 'antd';
import { AuthContext } from 'context/AuthProvider';
import {
  HOME_PAGE,
  EXHBN_LIST_PAGE,
  PRICING_PLAN_PAGE,
  AGENT_PROFILE_PAGE,
  AGENT_ACCOUNT_SETTINGS_PAGE,
} from 'settings/constant';

const MobileMenu = ({ className }) => {
  // auth context
  const { loggedIn, logOut } = useContext(AuthContext);

  return (
    <Menu className={className}>
      <Menu.Item key="0">
        <NavLink exact to={`${HOME_PAGE}`}>
          Home
        </NavLink>
      </Menu.Item>
      <Menu.Item key="1">
        <NavLink to={`${EXHBN_LIST_PAGE}`}>Exhibition</NavLink>
      </Menu.Item>
      <Menu.Item key="2">
        <NavLink to={`${AGENT_PROFILE_PAGE}`}>Hall</NavLink>
      </Menu.Item>
      <Menu.Item key="3">
        <NavLink to={`${PRICING_PLAN_PAGE}`}>MyPage</NavLink>
      </Menu.Item>
      {loggedIn && (
        <Menu.Item key="4">
          <NavLink to={AGENT_ACCOUNT_SETTINGS_PAGE}>Account Settings</NavLink>
        </Menu.Item>
      )}
      {loggedIn && (
        <Menu.Item key="5">
          <button onClick={e => logOut()}>Log Out</button>
        </Menu.Item>
      )}
    </Menu>
  );
};

export default MobileMenu;
