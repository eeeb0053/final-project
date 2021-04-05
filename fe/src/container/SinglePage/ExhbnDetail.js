import React, { Fragment, useState, useEffect } from 'react';
import { useLocation } from 'library/hooks/useLocation';
import Sticky from 'react-stickynode';
import { Row, Col, Button } from 'antd';
import Container from 'components/UI/Container/Container';
import Loader from 'components/Loader/Loader';
import useWindowSize from 'library/hooks/useWindowSize';
import Description from './Description/Description';
import Review from './Review/Review';
import Notice from './Notice/Notice';
import Additional from './Additional/Additional';
import Reservation from './Reservation/Reservation';
import BottomReservation from './Reservation/BottomReservation';
import TopBar from './TopBar/TopBar';
import SinglePageWrapper, { ButtonBox } from './ExhbnDetail.style';
import isEmpty from 'lodash/isEmpty';
import Summary from './Summary/Summary';
import axios from 'axios'
import { useHistory } from 'react-router';
import { ADD_EXHBN_PAGE, UPDATE_EXHBN_PAGE } from 'settings/constant';
import { Link } from 'react-router-dom';

const SinglePage = ({ match }) => {
  const { href } = useLocation();
  const [ isModalShowing, setIsModalShowing ] = useState(false);
  const [ props ] = useState([]);
  const { width } = useWindowSize();
  let history = useHistory();
  const [ exhbnDetail, setExhbnDetail ] = useState([]);

  const URL = `http://localhost:8080/exhbns/one/`
  
  useEffect(() => {
    axios.get(URL+match.params.exhbnNum)
    .then(resp => {
      setExhbnDetail(resp.data)
    })
    .catch(err => {
      alert(`전시 상세페이지 실패`)
      throw err;
    })

  }, [])

  if (isEmpty(exhbnDetail)) return <Loader />;
  
  const deleteExhbn = e => {
    e.preventDefault()
    window.confirm("전시를 삭제하시겠습니까?")
    axios({
      url: 'http://localhost:8080/exhbns/delete',
      method: 'delete',
      headers: {
        'Content-Type'  : 'application/json',
        'Authorization' : 'JWT fefege..'
      },
      data: { 
        exhbnNum: match.params.exhbnNum 
      }
    })
    .then(resp => {
      alert(`삭제 완료`)
      history.push('/exhbnList')
    })
    .catch(err => {
      alert(`삭제 실패`)
      throw err;
    })
  }
  
  const { rating, ratingCount, author, post } = props;

  return (
    <SinglePageWrapper>
        <ButtonBox>
          <Link to={`${UPDATE_EXHBN_PAGE}/${exhbnDetail.exhbnNum}`}><button className="update-btn">수정</button></Link>
          <button className="delete-btn" onClick={e => deleteExhbn() }>삭제</button>
        </ButtonBox>
      <Container>
        <Row gutter={30}>
          <Col xl={16}>
            <Summary
              title={exhbnDetail.exhbnTitle} 
              number={exhbnDetail.exhbnNum}
              location={exhbnDetail.hallLocation}
              genre={exhbnDetail.exhbnGenre}
              artist={exhbnDetail.exhbnArtist}
              start={exhbnDetail.startDate}
              end={exhbnDetail.endDate}
              price={exhbnDetail.exhbnPrice}
              rating={rating}
              ratingCount={ratingCount}
              shareURL={href} 
              media={exhbnDetail.exhbnImage}
            />
          </Col>
          <Col xl={8}>
            {width > 1200 ? (
              <Sticky
                innerZ={9999}
                activeClass="isSticky"
                top={83}
                bottomBoundary="#reviewSection"
              >
                <Reservation number={exhbnDetail.exhbnNum} price={exhbnDetail.exhbnPrice}/>
              </Sticky>
            ) : (
              <BottomReservation
                title={exhbnDetail.exhbnTitle}
                price={exhbnDetail.exhbnPrice}
                rating={rating}
                ratingCount={ratingCount}
              />
            )}
          </Col>
        </Row>
      </Container>
      <Container>
      <TopBar title={exhbnDetail.exhbnTitle} shareURL={href} author={author} media={exhbnDetail.exhbnImage} />
      
        <Row gutter={30} id="reviewSection" style={{ marginTop: 30 }}>
          <Col xl={16}>
            <Description
              content={exhbnDetail.exhbnContent}
              title={exhbnDetail.exhbnTitle}
              location={exhbnDetail.hallLocation}
              rating={rating}
              ratingCount={ratingCount}
            />
            <Notice />
          </Col>
        </Row>
        <Row gutter={30}>
          <Col xl={16}>
            <Review
              
            />
          </Col>
          <Col xl={8} />
        </Row>
        <Row gutter={30}>
          <Col xl={16}>
            <Additional />
          </Col>
          <Col xl={8} />
        </Row>
      </Container>
    </SinglePageWrapper>
  );
};

export default SinglePage;