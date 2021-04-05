import React, { useState, Fragment, useEffect } from 'react';
import axios from 'axios';
import Sticky from 'react-stickynode';
import Toolbar from 'components/UI/Toolbar/Toolbar';
import { Checkbox } from 'antd';
import CategotySearch from 'components/Search/CategorySearch/CategotySearch';
import { PostPlaceholder } from 'components/UI/ContentLoader/ContentLoader';
import SectionGrid from 'components/SectionGrid/SectionGrid';
import ListingMap from './ListingMap';
import FilterDrawer from 'components/Search/MobileSearchView';
import useWindowSize from 'library/hooks/useWindowSize';
import useDataApi from 'library/hooks/useDataApi';
import { EXHBN_DETAIL_PAGE } from 'settings/constant';
import ListingWrapper, { PostsWrapper, ShowMapCheckbox } from './Listing.style';

const SearchListing = ({ location, history }) => {
  const [exhbn, setExhbn] = useState([])

  const { width } = useWindowSize();
  const { data, loading, loadMoreData, total, limit } = useDataApi(`http://localhost:8080/exhbns`);
  let columnWidth = [1 / 1, 1 / 2, 1 / 3, 1 / 4, 1 / 5];

  useEffect(() => {
    // alert(localStorage.getItem('exhbnTitle'))
    axios.get("http://localhost:8080/exhbns/search/"+localStorage.getItem('exhbnTitle'), 
    ).then(resp => {
      // alert(`성공`)
      setExhbn(resp.data)
    }).catch(err => {
      alert(`err`)
      throw err
    })
  }, [])

  return (
    <>
    <ListingWrapper>
      <Sticky top={82} innerZ={999} activeClass="isHeaderSticky">
        <Toolbar
          left={
            width > 991 ? (
              <CategotySearch history={history} location={location} />
            ) : (
              <FilterDrawer history={history} location={location} />
            )
          }
        />
      </Sticky>

      <Fragment>
        <PostsWrapper className={width > 767 }>
          <SectionGrid
            link={EXHBN_DETAIL_PAGE}
            columnWidth={columnWidth}
            data={exhbn}
            totalItem={total.length}
            loading={loading}
            limit={limit}
            handleLoadMore={loadMoreData}
            placeholder={<PostPlaceholder />}
          />
        </PostsWrapper>
      </Fragment>
    </ListingWrapper>
    </>
  );
}
export default SearchListing;