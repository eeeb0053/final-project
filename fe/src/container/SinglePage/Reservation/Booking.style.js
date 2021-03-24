import styled from 'styled-components';
import { themeGet } from '@styled-system/theme-get';

const Wrapper = styled.div`
  display: flex;
  align: center;
  flex-wrap: wrap;
  width: 85%;
  padding: 150px;

  .container {
    height: 100%;
    width: 85%;
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .btn {
    border: 1px solid #616266;
    border-radius: 5px; 
    background-color: rgba(0,0,0,0);
    color: #616266;
    padding: 5px;
    margin-left: 2px;
  }

  .cancle-btn {
    border: 1px solid #616266;
    border-radius: 5px; 
    background-color: rgba(0,0,0,0);
    color: #616266;
    padding: 5px;
    margin-left: 2px;
  }
  
  .btn:hover {
    border: 1px solid #549400;
    color: #549400;
    cursor: pointer;
  }

  .cancle-btn:hover {
    border: 1px solid #b00000;
    color: #b00000;
    cursor: pointer;
  }
`;

export const FieldWrapper = styled.div`
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-top: 40px;
  margin-bottom: 40px;
  > a {
    color: ${themeGet('primary.0', '#616266')};
    font-size: 15px;
    font-weight: 700;
    line-height: 1;
    &:hover,
    &:focus {
      outline: none;
      color: #616266d1;
      text-decoration: none;
    }
  }
`;

export const SwitchWrapper = styled.div`
  display: flex;
  align-items: center;

  .field-container {
    .ant-form-item {
      margin-bottom: 0;
      margin-right: 10px;
    }
  }

  .ant-switch {
    min-width: 36px;
    height: 21px;
    &.ant-switch-checked {
      background-color: ${themeGet('primary.0', '#616266')};
    }
    &::after {
      width: 17px;
      height: 17px;
    }
    &:focus {
      box-shadow: none;
    }
    .ant-click-animating-node {
      display: none;
    }
  }
`;

export const Label = styled.span`
  font-size: 15px;
  line-height: 1;
  font-weight: 700;
  color: ${themeGet('text.0', '#2C2C2C')};
  padding: 0 1px;
`;

export const Title = styled.h2`
  color: ${themeGet('text.4', '#777777')};
  font-size: 22px;
  line-height: 54px;
  font-weight: 700;
  margin-bottom: 0;
  margin-top: 0px;
  @media (max-width: 1600px) {
    font-size: 22px;
    line-height: 48px;
  }
  @media (max-width: 1440px) {
    font-size: 22px;
    line-height: 42px;
  }
  @media (max-width: 1200px) {
    font-size: 22px;
    line-height: 32px;
  }
`;

export const Title2 = styled.h2`
  color: ${themeGet('text.4', '#777777')};
  font-size: 22px;
  line-height: 54px;
  font-weight: 700;
  margin-bottom: 0;
  margin-top: 0px;
  margin-right: 800px;
`;

export const TitleInfo = styled.p`
  color: ${themeGet('text.2', '#777777')};
  font-size: 16px;
  line-height: 30px;
  margin-bottom: 5px;
  margin-top: 5px;
  @media (max-width: 1600px) {
    font-size: 16px;
  }
  @media (max-width: 1440px) {
    font-size: 16px;
  }
  @media (max-width: 1440px) {
    font-size: 16px;
  }
`;

export const TextInfo = styled.p`
  color: ${themeGet('text.2', '#171717')};
  font-size: 14px;
  line-height: 30px;
  margin-bottom: 15px;
  margin-top: 2px;
  @media (max-width: 1600px) {
    font-size: 15px;
  }
  @media (max-width: 1440px) {
    font-size: 15px;
  }
  @media (max-width: 1440px) {
    font-size: 15px;
  }
`;

export const Text = styled.p`
  text-align: left;
  font-size: 17px;
  font-weight: 700;
  color: ${themeGet('text.2', '#777777')};
  line-height: 1;
  a {
    color: ${themeGet('primary.0', '#616266')};
    &:hover,
    &:focus {
      outline: none;
      color: #616266d1;
      text-decoration: none;
    }
  }
`;


export const BannerWrapper = styled.div`
  width: 57%;
  height: 100%;
  position: fixed;
  top: 0;
  right: 0;
  @media (max-width: 1200px) {
    width: 50%;
  }
  @media (max-width: 991px) {
    display: none;
  }
  img {
    position: absolute;
    top: 0;
    right: 0;
    width: 100%;
    height: 100%;
    object-fit: cover;
  }
`;

export const DescriptionWrapper = styled.div`
  padding: 0 0 29px;

  button {
    font-size: 15px;
    font-weight: 700;
    border: 0;
    padding: 0;
    height: auto;
    line-height: 1;
    box-shadow: none;
    text-shadow: none;
    color: ${themeGet('primary.0', '#616266')};

    &:hover,
    &:focus {
      color: ${themeGet('primary.1', '#399C9F')};
    }

    &::after {
      content: none;
    }
  }
`;

export const Input = styled.input`
  width: 100%;
  margin-bottom: 15px;
  margin-top: 5px;
  border: 1px solid #616266;
  border-radius: 3px; 
  outline: 0px;

  &:hover {
    border: 1px solid green;
  }
`
export default Wrapper;