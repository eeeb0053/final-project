import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import { Row, Col, Modal, Divider } from 'antd';
import BookingForm from './BookingForm';
import BookingInfo from './BookingInfo';
import Wrapper, {
  Title,
  TitleInfo,
  Text,
  FormWrapper,
  BannerWrapper,
} from './Booking.style';
import axios from 'axios'
import TextInfo from 'components/UI/Text/Text';
const Booking = ( { match } ) => {
  
  const [ bookingDetail, setBookingDetail ] = useState([])

  const URL = `http://localhost:8080/exhbns/one/` 

  useEffect(() => {
    axios.get(URL+match.params.exhbnNum)
    .then(reps => {
      setBookingDetail(reps.data)
    })
    .catch(err => {
      alert(`실패`)
      throw err;
    })
  }, [])


  return (
    <Wrapper>
      <Divider />
        <Row gutter={48}>
          <Col span={15}>
            <BookingInfo exhbnNum = {match.params.exhbnNum}/>
          </Col>
          <Col span={8}>
            <BookingForm/>
          </Col>
        </Row>
        <Divider> C:ART  |  Seoul Museum of Art </Divider>
    </Wrapper>
  );
};

export default Booking;
