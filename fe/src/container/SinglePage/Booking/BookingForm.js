import React, { useContext, useState } from 'react';
import { Link } from 'react-router-dom';
import { useForm, Controller } from 'react-hook-form';
import { MdLockOpen } from 'react-icons/md';
import { Divider, Modal } from 'antd';
import FormControl from 'components/UI/FormControl/FormControl';
import { AuthContext } from 'context/AuthProvider';
import { FieldWrapper, SwitchWrapper, Label,  Title, TitleInfo, 
         Button, Text, Input, Checkbox, A } from './Booking.style';
import { TextField } from '@material-ui/core';
import { BOOKING_LIST_PAGE } from 'settings/constant'
import TextInfo from 'components/UI/Text/Text';
import Consent from '../Notice/Consent';
import axios from 'axios';

const BookingForm = ( props ) => {
  const { price, bookDate, tickets } = props;
  const [ bookName, setBookName ] = useState('')
  const [ bookEmail, setBookEmail ] = useState('')
  const [ bookPnumber, setBookPnumber ] = useState('')
  const [ isModalVisible, setIsModalVisible ] = useState(false);

  const URL = 'http://localhost:8080/bookings/add'

  const booking = e => {
    axios.post(URL, {
      bookName, bookEmail, bookPnumber, exhbnNum: props.exhbnNum
    })
    .then(resp => {
      alert(`예매되었습니다.`)
    })
    .catch(err => {
      alert(`예약 실패`)
      throw err;
    })
  }

  const showModal = () => {
    setIsModalVisible(true);
  };

  const handleOk = () => {
    setIsModalVisible(false);
  };

  const handleCancel = () => {
    setIsModalVisible(false);
  };

  return (
    <form> 
      <div>
        <Title>예매자 정보</Title><br/>
        <TextInfo content={'예매자의 정보를 입력해주세요.'}/><br/>
        <Label>이름</Label><br/>
        <Input name="bookName" placeholder = "  이름을 입력하세요." required
          onChange = { e => { setBookName(`${e.target.value}`) }}/>
      </div>
      <div>
        <Label>이메일</Label><br/>
        <Input name="bookEmail" placeholder = "  이메일을 입력하세요." required
          onChange = { e => { setBookEmail(`${e.target.value}`) }}/>
      </div>
      <div>
        <Label>전화번호</Label><br/>
        <Input name="bookPnumber" placeholder = "  전화번호를 입력하세요." required
          onChange = { e => { setBookPnumber(`${e.target.value}`) }}/>
      </div><br/>
        <Label>예매정보</Label>
        <TitleInfo> {bookDate} 2021-03-15 (월), 총 1매 - 대인 1매</TitleInfo>
        <Divider/>
        <Text>합계</Text>
        <TitleInfo>{price === '무료' ? '0원' :
               (price*tickets).toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',')+'원'}</TitleInfo>
        <br/>
        <Checkbox type="checkbox" id="check" className="checkbox"/>
        <label htmlFor="check"> 예약 서비스 이용을 위한
        <A onClick={ e => showModal() }> 개인정보 수집 및 제3자 제공, 취소/환불 규정</A>
        <Modal title="개인정보 수집 및 제공 동의" 
               visible={isModalVisible} onOk={handleOk} onCancel={handleCancel}>
        <Consent/>
        </Modal>
        을 확인하였으며 이에 동의합니다.</label>
        <br/><br/>
      <Link to={BOOKING_LIST_PAGE}>
      <Button type="button" onClick={ e => booking() }>
          예매하기
      </Button></Link>
    </form>
  );
};

export default BookingForm;
