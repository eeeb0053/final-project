import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import { Row, Col, Modal, Divider } from 'antd';
import BookingForm from './BookingForm';
import BookingInfo from './BookingInfo';
import Wrapper from './Booking.style';
const Booking = ( { match, props } ) => {

  return (
    <Wrapper>
      <Divider />
        <Row gutter={48}>
          <Col span={15}>
            <BookingInfo exhbnNum = {match.params.exhbnNum}/>
          </Col>
          <Col span={8}>
            <BookingForm 
              // price={props.price} 
              // bookdate={props.bookdate}
              // tickets={props.tickets}
              />
          </Col>
        </Row>
        <Divider> C:ART  |  Seoul Museum of Art </Divider>
    </Wrapper>
  );
};

export default Booking;
