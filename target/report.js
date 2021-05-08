$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Eclipse-New/BlazeDemo/src/test/resources/Feature.feature");
formatter.feature({
  "name": "Blaze booking travel agency  going to find Flights",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": ": Select Departure and Destination of flights and click Find Flights",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch blaze demo url",
  "keyword": "Given "
});
formatter.step({
  "name": "Get screenshot for blaze demo home page",
  "keyword": "And "
});
formatter.step({
  "name": "Choose \"\u003cDepartureCity\u003e\" and \"\u003cDestinationCity\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Check enable of Find flight button and click",
  "keyword": "And "
});
formatter.step({
  "name": "Validate next page navicated or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "DepartureCity",
        "DestinationCity"
      ]
    },
    {
      "cells": [
        "Philadelphia",
        "London"
      ]
    }
  ]
});
formatter.scenario({
  "name": ": Select Departure and Destination of flights and click Find Flights",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch blaze demo url",
  "keyword": "Given "
});
formatter.match({
  "location": "FindFlights.launch_blaze_demo_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get screenshot for blaze demo home page",
  "keyword": "And "
});
formatter.match({
  "location": "FindFlights.get_screenshot_for_blaze_demo_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose \"Philadelphia\" and \"London\"",
  "keyword": "When "
});
formatter.match({
  "location": "FindFlights.choose_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check enable of Find flight button and click",
  "keyword": "And "
});
formatter.match({
  "location": "FindFlights.check_enable_of_Find_flight_button_and_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate next page navicated or not",
  "keyword": "Then "
});
formatter.match({
  "location": "FindFlights.validate_next_page_navicated_or_not()"
});
formatter.result({
  "status": "passed"
});
});