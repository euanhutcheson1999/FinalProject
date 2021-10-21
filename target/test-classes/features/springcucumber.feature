Feature: contents

  Scenario: view contents
    Given the song is already in the playlist
    When when i search the song title
    Then the song is displayed