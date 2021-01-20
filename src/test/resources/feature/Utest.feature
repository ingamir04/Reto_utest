# Language: en
@stories
Feature: Registration the Utest website

  @Scenario1
  Scenario: Amir create a user on the Utest platform
    Given Enter a website the utes
    When Register on the websites
    |srtname|srtlast  |stremail        |strmonth|strday|stryear|strcity|srtpostal|strpassword|strconfirpassword|
    |Amir   |Alexander|ing123@gmail.com|December|4|1993|Quibdo|27000|keN_3X.Agz9*c.&|keN_3X.Agz9*c.&|
    Then The confirm registrations
    |strpregunta  |
    |The last step|