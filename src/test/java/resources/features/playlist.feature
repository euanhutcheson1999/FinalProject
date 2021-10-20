Feature: Create Playlist and Add Song

  Scenario: I want to create a new Playlist
    Given I have a song to add to a playlist
    And I have a playlist
    When I enter the song into the playlist
    Then Song should be added to playlist
    And playlist is displayed