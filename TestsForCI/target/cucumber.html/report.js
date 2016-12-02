$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search Feature",
  "description": "",
  "id": "search-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2789330157,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify if Google Search show results",
  "description": "",
  "id": "search-feature;verify-if-google-search-show-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open search engine url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I fill search input with search value",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I can see search results",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.iOpenGoogle()"
});
formatter.result({
  "duration": 3818362916,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iFillSearchInput()"
});
formatter.result({
  "duration": 149836559,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iCanSeeSearchResults()"
});
formatter.result({
  "duration": 23342965,
  "status": "passed"
});
formatter.after({
  "duration": 1101685727,
  "status": "passed"
});
});