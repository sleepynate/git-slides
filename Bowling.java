import junit.framework.TestCase;

// Immutability also helps to reason
// about program behaviour.

public class SeasonListAdapter {
  // ...
  
  public void onEpisodesLoaded(EpisodeData data) {
    removeEmptySeasons(data);
    
    Season season = getCurrentSeason();
    displaySeason(season, data);
  }
  
  // ...
}
