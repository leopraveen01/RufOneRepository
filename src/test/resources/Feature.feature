Feature: Blaze booking travel agency  going to find Flights

  Scenario Outline: : Select Departure and Destination of flights and click Find Flights
    Given Launch blaze demo url
    And Get screenshot for blaze demo home page
    When Choose "<DepartureCity>" and "<DestinationCity>"
    And Check enable of Find flight button and click
    Then Validate next page navicated or not

    Examples: 
      | DepartureCity | DestinationCity |
      | Philadelphia  | London          |