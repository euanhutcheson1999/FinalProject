Feature: Playlist

  Scenario: search existing song
    Given the song is already in the playlist
    When i search the song title
    Then the song is displayed

    Scenario: Search non-existing song
      Given the song is not in the playlist
      When  the song title is searched
      Then song is not displayed

    Scenario: Add song
      Given i have a song
      When i add the song details
      Then the song is added