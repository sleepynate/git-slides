import junit.framework.TestCase;

// What an immutable version would look like:
// 

public class SeasonListAdapter {
  // ...
  
  public SeasonListAdapter onEpisodesLoaded(EpisodeData data) {
    Season[] seasons = removeEmptySeasons(data);
    
    Season season = getCurrentSeason(); // array index ok
    displaySeason(season, data);
    return new SeasonListAdapter(seasons);
  }
  private Season getCurrentSeason() {
    return mSeasons[mCurrentSeason];
  }
  
  private Season[] removeEmptySeasons(EpisodeData data) {
    return     /* ... */;
  }
}
