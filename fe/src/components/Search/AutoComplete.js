import React, { useState, useRef } from 'react';
import { compose, withProps } from 'recompose';
import { withScriptjs } from 'react-google-maps';
import StandaloneSearchBox from 'react-google-maps/lib/components/places/StandaloneSearchBox';
import { Input } from 'antd';
import axios from 'axios';

const SearchInput = compose(
  withProps({
    googleMapURL: process.env.REACT_APP_GOOGLE_MAP_API_KEY,
    loadingElement: <div style={{ height: '100%' }} />,
    containerElement: <div style={{ height: `400px` }} />,
  }),
  withScriptjs
)((props) => {
  const { getInputValue } = props;
  const [ exhbnTitle, setExhbnTitle ] = useState('')
  const [locationInput, setLocationInput] = useState({
    searchedLocation: '',
    searchedPlaceAPIData: [],
  });
  const handleOnChange = (event) => {
    if (event.which === '13') {
      event.preventDefault();
      event.stopPropagation();
    }
    setLocationInput({
      searchedLocation: event.target.value,
    });
  };
  const refs = useRef({});
  const onPlacesChanged = () => {
    const places = refs.current.getPlaces();
    setLocationInput({
      searchedLocation: places && places[0] && places[0].formatted_address,
      searchedPlaceAPIData: places ? places : [],
    });
    getInputValue({
      searchedLocation: places && places[0] && places[0].formatted_address,
      searchedPlaceAPIData: places ? places : [],
    });
  };

  return (
    <div className="map_autocomplete">
      <StandaloneSearchBox ref={refs} onPlacesChanged={onPlacesChanged}>
        <Input
          type="text"
          defaultValue=""
          placeholder="검색하기"
          size="large"
          onChange={e => {setExhbnTitle(`${ e.target.value }`)}}
        />
      </StandaloneSearchBox>
    </div>
  );
});

const AutoComplete = (props) => {
  const { updateValue } = props;
  return <SearchInput getInputValue={updateValue} />;
};

export default AutoComplete;
