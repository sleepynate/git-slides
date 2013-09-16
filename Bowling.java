import junit.framework.TestCase;

// Immutability also helps to reason
// about program behaviour.

public class SeasonListAdapter {
  // ...
  
  public void onEpisodesLoaded(EpisodeData data) {
    removeEmptySeasons(data);
    
    Season season = getCurrentSeason(); // array out of bounds!
    displaySeason(season, data);
  }
  
  private Season getCurrentSeason() {
    return mSeasons[mCurrentSeason];
  }
  
  private   void   removeEmptySeasons(EpisodeData data) {
    mSeasons = /* ... */;
  }
}
