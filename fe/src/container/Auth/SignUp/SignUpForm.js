import React, { useContext, useState } from 'react';
import { Redirect } from 'react-router-dom';
import { useForm, Controller } from 'react-hook-form';
import { MdLockOpen } from 'react-icons/md';
import { Input, Switch, Button } from 'antd';
import FormControl from 'components/UI/FormControl/FormControl';
import { AuthContext } from 'context/AuthProvider';
import { FieldWrapper, SwitchWrapper, Label } from '../Auth.style';
import { TextField } from '@material-ui/core';
import axios from 'axios';

const SignUpForm = () => {

  const [ userid, setUserid ] = useState('')
  const [ password, setPassword ] = useState('')
  const [ username, setUsername ] = useState('')
  const [ email, setEmail ] = useState('')
  const [ gender, setGender ] = useState('')
  const [ birthday, setBirthday ] = useState('')
  const [ phoneNumber, setPhoneNumber ] = useState('')
  const [ preferGenre, setPreferGenre ] = useState('')
  const url = '/users/save'
  const register = e => {
    e.preventDefault()
    axios.post(url, {
      userid, password, username, email, gender, birthday, phoneNumber,preferGenre
    })
    .then(resp => {
      alert(`회원가입 성공`)
    })
    .catch(err => {
      alert(`회원가입 실패`)
    })
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
        <label>Name</label>
        <Input name="username" placeholder = "Name"
          onChange = { e => { setUsername(`${e.target.value}`) }}
          required />
      </div>
      <div>
        <label>Email Address</label>
        <Input name="email" placeholder = "Email" 
          onChange = { e => { setEmail(`${e.target.value}`) }}
          required />
      </div>
      <div>
        <label>Password</label>
        <Input type="password" name="password" placeholder = "Password" 
          onChange = { e => { setPassword(`${e.target.value}`) }}
        />
      </div>
      <div>
        <label>Birthday</label>
        <Input name="birthday" placeholder = "Birthday" 
          onChange = { e => { setBirthday(`${e.target.value}`) }}
        />
      </div>
      <br/>
      <Button
        className="signin-btn"
        type="submit"
        size="large"
        style={{ width: '100%' }} 
        onClick={ register }>
          <MdLockOpen />Register
        </Button>
    </form>
  );
};

export default SignUpForm;
