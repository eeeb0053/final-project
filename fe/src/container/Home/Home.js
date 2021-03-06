import React, { useContext } from 'react';
import { RecommendExhbn, PopularExhbn } from './Grid';
import SearchArea from './Search/Search';
import LocationGrid from './Location/Location';
import { LayoutContext } from 'context/LayoutProvider';
import { Waypoint } from 'react-waypoint';
import { makeStyles } from '@material-ui/styles'

const useStyles = makeStyles(() => ({}))

const Home = () => {
  const [, dispatch] = useContext(LayoutContext);
  return (
    <>
      <SearchArea />
      <Waypoint
        onEnter={() => dispatch({ type: 'HIDE_TOP_SEARCHBAR' })}
        onLeave={() => dispatch({ type: 'SHOW_TOP_SEARCHBAR' })}
      />
      <LocationGrid />
      <RecommendExhbn />
      <PopularExhbn />
    </>
  );
};

export default Home;
