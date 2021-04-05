import styled from 'styled-components';
import { themeGet } from '@styled-system/theme-get';
import { style } from 'styled-system';

const VerticalWrapper = styled.div`
  padding: 100px 50px 50px 0px;
  display: flex;
  flex-wrap: wrap;
  width: 25%;
  
  ul, li {
    list-style: none;
    padding: 0px;
    margin: 0px;
  }
  a {
    text-decoration: none;
    color: inherit;
    font-weight: bold;
  }

  .vertab {
    text-align: center;
    position: fixed;

  }
  .vertab>ul {
    display: inline-block;
  }
  .vertab>ul>li {
    background-color: #f0f0f0;
    margin-bottom: 10px;
  }
  .vertab>ul>li>a {
    display: block;
    padding: 15px 35px;
  }
  .vertab>ul>li:hover>a {
    color: white;
    background-color: black;
  }
 
`;

export const TabWrapper = styled.div`

`;

export default VerticalWrapper;