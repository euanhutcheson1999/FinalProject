Feature: Create Song

  Scenario: I want to create a new song
    Given I have a song to add
    When I enter the song details
    Then "Thong Song" should be created