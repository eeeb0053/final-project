import React, { useContext, useState, useEffect } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import { Divider, Row, Col} from 'antd';
import Wrapper, { TextInfo, Label, Title, Input } from './Booking.style';
import { BOOKING_LIST_PAGE } from 'settings/constant'

const BookingDetail = ({match, props}) => {

  const [bookingDetail, setBookingDetail] = useState({})
  const [bookName, setBookName] = useState('')
  const [bookPnumber, setBookPnumber] = useState('')
  const [bookEmail, setBookEmail] = useState('')
  const [isEdit, setIsEdit] = useState(false)

  let URL = 'http://localhost:8080/bookings/one/'

  useEffect(e => {
    axios.get(URL+match.params.bookNum, )
    .then((resp) => {
      setBookingDetail(resp.data)
    })
    .catch((err) => {
      alert(`실패`)
      throw err;
    })
  }, [])

  const handleEditBooking = e => {
    e.preventDefault()
    alert("예약번호:"+match.params.bookNum+"이름: "+bookName+"이메일: "+bookEmail+"번호: "+bookPnumber)
    const del = window.confirm("예매자 정보를 수정하시겠습니까?")
    const URL_EDIT = `http://localhost:8080/bookings/edit/`
    if(del){
      axios.put(URL_EDIT+match.params.bookNum,{ 
        bookEmail, 
        bookName,
        bookPnumber
       })
      .then(resp => {
        alert(`수정되었습니다.`)
        window.location.reload()
      })
      .catch(err => {
        alert(`수정 실패`)
        throw err;
      })
    }
  }
 
  const handleDeleteBooking = e => {
      const del = window.confirm("예매를 취소하시겠습니까?")
      const URL_DELETE = `http://localhost:8080/bookings/delete`
      if(del){
        axios.delete(URL_DELETE, {
          data: {bookNum: match.params.bookNum}
        })
        .then(resp => {
          alert(`예매 취소 완료`)
          window.location.href = BOOKING_LIST_PAGE
        })
        .catch(err => {
          alert(`예매 취소가 실패하였습니다.`)
          throw err;
        })
      }
  }

  return (
      <Wrapper>
      <Divider />
        <Col xl={13}>
        <Title>예매 정보</Title><br/>
        <Label>No.</Label>
        <TextInfo> {bookingDetail.bookNum} </TextInfo>
        <Label>전시명</Label>
        <TextInfo> {bookingDetail.exhbnNum} </TextInfo>
        <Label>예약일</Label>
        <TextInfo> {bookingDetail.bookDate} </TextInfo>
        <Label>결제금액</Label>
        <TextInfo> {bookingDetail.totalPrice} </TextInfo>
        </Col>
        <Col xl={5}>
        <div>
        <Title>예매자 정보</Title><br/>
        <Label>예매자명</Label>
        <Input className="inputbox" name="bookName" placeholder = { bookingDetail.bookName }
          onChange = { e => { setBookName(`${e.target.value}`) }}
          /><br/>
        <Label>이메일</Label>
        <Input name="bookEmail" placeholder = { bookingDetail.bookEmail }
          /* value = { bookingDetail.bookEmail } */
          onChange = { e => { setBookEmail(`${e.target.value}`) }}
          required /><br/>
        <Label>전화번호</Label>
        <Input name="bookPnumber" placeholder = { bookingDetail.bookPnumber }
          /* value = { bookingDetail.bookPnumber } */
          onChange = { e => { setBookPnumber(`${e.target.value}`) }}
          required />
        </div>
        </Col>
        <div className="container">
        <Link to={BOOKING_LIST_PAGE}><button className="btn">목록</button></Link>
        <button className="btn" onClick = { handleEditBooking }>수정</button>
        <button className="cancle-btn" onClick = { handleDeleteBooking }>예매취소</button>
        </div>
      <Divider> C:ART  |  Seoul Museum of Art </Divider>
    </Wrapper>
    

  );
};


export default BookingDetail;
