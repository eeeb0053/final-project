import React, { useState, useEffect } from 'react';
import { IoIosArrowBack } from 'react-icons/io';
import { useStateMachine } from 'little-state-machine';
import { useForm } from 'react-hook-form';
import { Button } from 'antd';
import DragAndDropUploader from 'components/UI/ImageUploader/DragAndDropUploader';
import FormControl from 'components/UI/FormControl/FormControl';
import AddListingAction from './AddListingAction';
import { FormHeader, Title, FormContent, FormAction } from './AddListing.style';
import axios from 'axios'

const HotelPhotos = ({ setStep }) => {
  const { register, errors, setValue, handleSubmit } = useForm({
    
 /*    defaultValues: {
      hotelPhotos: [
        {
          uid: '1',
          name: 'hotel-1.png',
          status: 'done',
          url:
            'https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png',
        },
        {
          uid: '2',
          name: 'hotel-2.png',
          status: 'done',
          url:
            'https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png',
        },
        {
          uid: '3',
          name: 'hotel-3.png',
          status: 'done',
          url:
            'https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png',
        },
      ],
    }, */
  });
  const [ exhbnImage, setExhbnImage ] = useState('')
  const { action, state } = useStateMachine(AddListingAction);

  const URL = 'http://localhost:8080/exhbns/save'

  const add = e => {
    e.preventDefault()
    axios.post(URL,{
      exhbnImage,
    })
    .then(resp => {
      alert(`포스터 등록 완료`)
    })
    .catch(err => {
      alert(`포스터 등록 실패`)
      throw err;
    })
}

  useEffect(() => {
    register({ name: {exhbnImage} }, { required: true });
  }, [register]);

  const onSubmit = (data) => {
    action(data);
    setStep(3);
  };

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <FormContent>
        <FormHeader>
          <Title>전시회 등록</Title>
        </FormHeader>
        <FormControl
          error={errors.exhbnImage && <span>이 입력란을 작성해주세요!</span>}
        >
          <DragAndDropUploader
            name="포스터"
            id="exhbnImage"
            accept="image/*"
            onUploadChange={(data) => setExhbnImage('exhbnImage', data)}
          />
        </FormControl>
      </FormContent>
      <FormAction>
        <div className="inner-wrapper">
          <Button
            className="back-btn"
            htmlType="button"
            onClick={() => setStep(1)}
          >
            <IoIosArrowBack /> 뒤로가기
          </Button>
          <Button type="primary" htmlType="submit" onClick={e => add() } >
            등록하기
          </Button>
        </div>
      </FormAction>
    </form>
  );
};

export default HotelPhotos;
