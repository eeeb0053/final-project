import 'react-dates/initialize';
import { DateRangePicker } from 'react-dates';
import 'react-dates/lib/css/_datepicker.css';
import React, { useState, useEffect } from 'react';
import PropTypes from 'prop-types';
import { ReactDatesStyleWrapper } from './ReactDates.style';
/*
 * For Localization enable this code [example : French language as "fr"]
 */
// import moment from 'moment';
// import 'moment/locale/fr';

const DateRangePickerBox = (props) => {
  const [ focusedInput, setFocusedInput ] = useState('');
  const [ startDate, setStartDate ] = useState(0);
  const [ endDate, setEndDate ] = useState(0);
  // DateRangePickerBox props list
  const {
    classNamed,
    startDateId,
    endDateId,
    startDatePlaceholderText,
    endDatePlaceholderText,
    disabled,
    showClearDates,
    isRTL,
    orientation,
    anchorDirection,
    withPortal,
    withFullScreenPortal,
    small,
    block,
    numberOfMonths,
    regular,
    noBorder
  } = props;

  const separator =  props.item && props.item.separator
        ? props.item.separator : '/';

  const dateFormat = props.item && props.item.format
        ? props.item.format : 'llll';

  setStartDate(props.startDate ? props.startDate : null)
  setEndDate(props.endDate ? props.endDate : null)

  const onDateChangeFunc = () => {
    if (startDate !== null && endDate !== null) {
      props.updateSearchData({
        setStartDate: startDate,
        setEndDate: endDate,
      });
    }
  };

  const onFocusChangeFunc = () => {
    setFocusedInput(focusedInput);
  };

  const addAllClasses = ['date_picker'];
    // className prop checking **************
    if (classNamed) {
      addAllClasses.push(classNamed);
    }
  
  const defaultCalenderProps = {
    startDateId: startDateId ? startDateId : 'start_unique_id',
    endDateId: endDateId ? endDateId : 'end_date_unique_id',
    startDate,
    endDate,
    focusedInput,
    onFocusChange: onFocusChangeFunc(),
    onDatesChange: onDateChangeFunc(),
    startDatePlaceholderText,
    endDatePlaceholderText,
    disabled,
    isRTL,
    showClearDates: showClearDates ? showClearDates : false,
    orientation,
    anchorDirection,
    withPortal,
    withFullScreenPortal,
    small,
    numberOfMonths: numberOfMonths ? numberOfMonths : 2,
    block,
    regular,
    noBorder,
  };

  return (
    <ReactDatesStyleWrapper className={addAllClasses.join(' ')}>
      <DateRangePicker {...defaultCalenderProps} />
    </ReactDatesStyleWrapper>
  );
}

DateRangePickerBox.propTypes = {
  /** startDateId of the date-picker field */
  startDateId: PropTypes.string.isRequired,
  /** endDateId of the date-picker field */
  endDateId: PropTypes.string.isRequired, //
  /** startDatePlaceholderText of the date-picker field */
  startDatePlaceholderText: PropTypes.string,
  /** endDatePlaceholderText of the date-picker field */
  endDatePlaceholderText: PropTypes.string,
  /** disabled of the date-picker field */
  disabled: PropTypes.oneOfType([
    PropTypes.bool,
    PropTypes.oneOf(['START_DATE', 'END_DATE']),
  ]),

  /** showClearDates of the date-picker field */
  showClearDates: PropTypes.bool,
  /** isRTL of the date-picker field */
  isRTL: PropTypes.bool,
  /** orientation of the date-picker field */
  orientation: PropTypes.oneOf(['horizontal', 'vertical']),
  /** anchorDirection of the date-picker field */
  anchorDirection: PropTypes.oneOf(['left', 'right']),
  /** withPortal of the date-picker field */
  withPortal: PropTypes.bool,
  /** withFullScreenPortal of the date-picker field */
  withFullScreenPortal: PropTypes.bool,
  /** small of the date-picker field */
  small: PropTypes.bool,
  /** numberOfMonths of the date-picker field */
  numberOfMonths: PropTypes.number,
  /** block of the date-picker field */
  block: PropTypes.bool,
  /** regular of the date-picker field */
  regular: PropTypes.bool,
  /** noBorder of the date-picker field */
  noBorder: PropTypes.bool,
  /** updateSearchData of the date-picker field to send component data to parent component */
  updateSearchData: PropTypes.func,
};

export default DateRangePickerBox;
