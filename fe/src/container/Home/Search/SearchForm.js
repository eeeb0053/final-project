import React, { useState, useRef } from 'react';
import { withRouter } from 'react-router-dom';
import isEmpty from 'lodash/isEmpty';
import { FaMapMarkerAlt, FaRegCalendar, FaUserFriends } from 'react-icons/fa';
import { Button } from 'antd';
import AutoComplete from 'components/Search/AutoComplete';
import { mapDataHelper } from 'components/Map/mapDataHelper';
import ViewWithPopup from 'components/UI/ViewWithPopup/ViewWithPopup';
import InputIncDec from 'components/UI/InputIncDec/InputIncDec';
import { setStateToUrl } from 'library/helpers/url_handler';
import { LISTING_SEARCH_POST_PAGE } from 'settings/constant';
import StandaloneSearchBox from 'react-google-maps/lib/components/places/StandaloneSearchBox';
import {
  FormWrapper,
  ComponentWrapper,
  RoomGuestWrapper,
  ItemWrapper,
} from './Search.style';
import { Input } from 'antd';
import { Link } from 'react-router-dom';
import axios from 'axios';

const SearchForm = ({ history }) => {
  const [ exhbnTitle, setExhbnTitle ] = useState('')
  const [searchValue, setSearchValue] = useState([]);
  const refs = useRef({});

  const updateValueFunc = (event) => {
    const { searchedData } = event;
    if (!isEmpty(searchedData)) {
      setSearchValue(searchedData);
    }
  };

  const goToSearchPage = () => {
    history.push({
      pathname: LISTING_SEARCH_POST_PAGE
    });
  };

  return (
    <FormWrapper>
      <ComponentWrapper>
        <FaMapMarkerAlt className="map-marker" />
        <div className="map_autocomplete">
            <Input
              type="text"
              defaultValue=""
              placeholder="검색하기"
              size="large"
              onChange={e => {setExhbnTitle(`${ e.target.value }`)}}
            />
        </div>
      </ComponentWrapper>
      <Link to = {LISTING_SEARCH_POST_PAGE}>
      <Button
        type="primary"
        htmlType="submit"
        size="large"
        onClick={() => localStorage.setItem('exhbnTitle', exhbnTitle)}
      >
        전시 검색
      </Button></Link>
    </FormWrapper>
  );
};

export default withRouter(SearchForm);
