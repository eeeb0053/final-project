import React from 'react';
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

const Booking = () => {
  
  return (
    <Wrapper>
      <Divider />
        <Row gutter={50} style={{ marginTop: 30 }}>
          <Col xl={15}>
            <BookingInfo/>
          </Col>
          <Col xl={9}>
            <BookingForm/>
          </Col>
        </Row>
        <Divider> C:ART  |  Seoul Museum of Art </Divider>
    </Wrapper>
  );
};

export default Booking;
