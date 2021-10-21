<<<<<<< HEAD
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
=======
Feature: contents

  Scenario: view contents
    Given the song is already in the playlist
    When when i search the song title
    Then the song is displayed
>>>>>>> 5e280d52da6e9cc454acc3ad50c1efe18086eeef
