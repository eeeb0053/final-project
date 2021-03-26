import React, { useState } from 'react';
import { Button } from 'antd';
import HtmlLabel from 'components/UI/HtmlLabel/HtmlLabel';
import DatePickerRange from 'components/UI/DatePicker/ReactDates';
import ViewWithPopup from 'components/UI/ViewWithPopup/ViewWithPopup';
import InputIncDec from 'components/UI/InputIncDec/InputIncDec';
import ReservationFormWrapper, {
  FormActionArea,
  FieldWrapper,
  RoomGuestWrapper,
  ItemWrapper,
} from './Reservation.style.js';
import { Link } from 'react-router-dom'
import { BOOKING_PAGE } from 'settings/constant'

const RenderReservationForm = ( props ) => {
  const [formState, setFormState] = useState({
    startDate: null,
    endDate: null,
    adult: 0,
    children: 0,
  });

  const handleIncrement = (type) => {
    setFormState({
      ...formState,
      [type]: formState[type] + 1,
    });
  };
  const handleDecrement = (type) => {
    if (formState[type] <= 0) {
      return false;
    }
    setFormState({
      ...formState,
      [type]: formState[type] - 1,
    });
  };
  const handleIncDecOnChnage = (e, type) => {
    let currentValue = e.target.value;
    setFormState({
      ...formState,
      [type]: currentValue,
    });
  };
  const updateSearchDataFunc = (value) => {
    setFormState({
      ...formState,
      startDate: value.setStartDate,
      endDate: value.setEndDate,
    });
  };
  const handleSubmit = (e) => {
    e.preventDefault();
  };

  return (
    <ReservationFormWrapper className="form-container" onSubmit={handleSubmit}>
      <FieldWrapper>
        <HtmlLabel htmlFor="dates" content="날짜" />
        <DatePickerRange
          startDateId="checkin-Id"
          endDateId="checkout-id"
          startDatePlaceholderText="Check In"
          endDatePlaceholderText="Check Out"
          updateSearchData={(value) => updateSearchDataFunc(value)}
          numberOfMonths={1}
          small
        />
      </FieldWrapper>
      <FieldWrapper>
        <HtmlLabel htmlFor="guests" content="예매" />
        <ViewWithPopup
          key={200}
          noView={true}
          className={formState.adult || formState.children ? 'activated' : ''}
          view={
            <Button type="default">
              <span>대인 {formState.adult > 0 && `: ${formState.adult}`}</span>
              <span>-</span>
              <span>소인{formState.children > 0 && `: ${formState.children}`}</span>
            </Button>
          }
          popup={
            <RoomGuestWrapper>
              <ItemWrapper>
                <strong>대인</strong>
                <InputIncDec
                  id="adult"
                  increment={() => handleIncrement('adult')}
                  decrement={() => handleDecrement('adult')}
                  onChange={(e) => handleIncDecOnChnage(e, 'adult')}
                  value={formState.adult}
                />
              </ItemWrapper>

              <ItemWrapper>
                <strong>소인</strong>
                <InputIncDec
                  id="children"
                  increment={() => handleIncrement('children')}
                  decrement={() => handleDecrement('children')}
                  onChange={(e) => handleIncDecOnChnage(e, 'children')}
                  value={formState.children}
                />
              </ItemWrapper>
            </RoomGuestWrapper>
          }
        />
      </FieldWrapper>
      <FormActionArea>
        <Link to={`${BOOKING_PAGE}/${props.number}`}>
        <Button htmlType="submit" type="primary">
          예매하기
        </Button>
        </Link>

      </FormActionArea>
    </ReservationFormWrapper>
  );
};

export default RenderReservationForm;
