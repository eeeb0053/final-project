import React, { useContext, useState } from 'react';
import { Redirect } from 'react-router-dom';
import { useForm, Controller } from 'react-hook-form';
import { MdLockOpen } from 'react-icons/md';
import { Input, Switch, Button } from 'antd';
import FormControl from 'components/UI/FormControl/FormControl';
import { AuthContext } from 'context/AuthProvider';
import { FieldWrapper, SwitchWrapper, Label, Title } from './Booking.style';
import Description from '../Description/Description';
import { TextField } from '@material-ui/core';
import useDataApi from 'library/hooks/useDataApi';
import isEmpty from 'lodash/isEmpty';
import Loader from 'components/Loader/Loader';
import axios from 'axios';

const BookingInfo = ( { match }) => {

  const [ userid, setUserid ] = useState('')
  const [ password, setPassword ] = useState('')
  const [ username, setUsername ] = useState('')
  const [ email, setEmail ] = useState('')
  const [ gender, setGender ] = useState('')
  const [ birthday, setBirthday ] = useState('')
  const [ phoneNumber, setPhoneNumber ] = useState('')
  const [ preferGenre, setPreferGenre ] = useState('')


  let url = '/data/hotel-single.json';
  
  const { data, loading } = useDataApi(url);
  if (isEmpty(data) || loading) return <Loader />;
  const {
    rating,
    ratingCount,
    price,
    title,
    location,
    content,
    amenities,
    author,
  } = data[0];


  return (
    <form> 
      <div>
        <Title>예매 정보</Title> <br/>
        <Description
              content={content}
              title={title}
              location={location}
              rating={rating}
              ratingCount={ratingCount}
            />
      </div>
      <br/>
    </form>
  );
};

export default BookingInfo;
