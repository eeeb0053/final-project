import React, { useContext, useState, useEffect } from 'react';
import { Link, Redirect } from 'react-router-dom';
import { useForm, Controller } from 'react-hook-form';
import { MdLockOpen } from 'react-icons/md';
import { Input, Switch, Button } from 'antd';
import FormControl from 'components/UI/FormControl/FormControl';
import { AuthContext } from 'context/AuthProvider';
import { FORGET_PASSWORD_PAGE } from 'settings/constant';
import { FieldWrapper, SwitchWrapper, Label } from '../Auth.style';
import axios from 'axios'

const SignInForm = () => {
  const [ userid, setUserid ] = useState('')
  const [ password, setPassword ] = useState('')

  const URL = 'http://localhost:8080/api/users/login'

  const authHeader = () => {
    const user = JSON.parse(localStorage.getItem('user'));
  
    if (user && user.accessToken) {
      return { Authorization: 'Bearer ' + user.accessToken }; // for Spring Boot back-end
      // return { 'x-access-token': user.accessToken };       // for Node.js Express back-end
    } else {
      return {};
    }
  }

  const login = (userid, password) => {
    return axios
      .post(URL, {
        userid,
        password
      })
      .then(resp => {
        alert('로그인 성공')
        localStorage.setItem("user", JSON.stringify(resp.data));

        return resp.data;
      })
      .catch(err => {
        alert(`회원가입 실패`)
      })
  }

  const logout = () => {
    localStorage.removeItem("user");
  }

  const getCurrentUser = () => {
    return JSON.parse(localStorage.getItem('user'));;
  }

  const {signUp, loggedIn} = useContext(AuthContext);

  return (
    <form> 
      <div>
        <label>ID</label>
        <Input name="userid" 
          onChange = { e => { setUserid(`${e.target.value}`) }}
          placeholder = "ID"
          required /> <br/>
      </div>
      <div>
        <label>Password</label>
        <Input type="password" name="password" placeholder = "Password" 
          onChange = { e => { setPassword(`${e.target.value}`) }}
        />
      </div>
      <br/>
      <Button
        className="signin-btn"
        type="submit"
        size="large"
        style={{ width: '100%' }} 
        onClick={ login }>
          <MdLockOpen />LogIn
        </Button>
    </form>
  );
};

export default SignInForm;
