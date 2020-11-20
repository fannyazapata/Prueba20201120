@stories
Feature: opensourcecms plataform
	As a user, I want to use opensourcecms plataform
	
	@scenario1
   Scenario: Create a new Post
    Given than Fanny is on opensourcecms
   | user		| password		|
   | opensourcecms	| opensourcecms	|
    When she creates a new Post called
   | postTitle	|
   | W4		| 
    Then she could visualized the created Post
   | postTitle	|
   | W4		| 
	@scenario2
   Scenario: Create a new Page
    Given than Fanny is on opensourcecms
   | user		| password		|
   | opensourcecms	| opensourcecms	|
    When she creates a new Page called
   | pageTitle	|
   | AA			| 
    Then she could visualized the created Page
   | pageTitle	|
   | AA			| 
	@scenario3
   Scenario: Edit a Post
    Given than Fanny is on opensourcecms
   | user		| password		|
   | opensourcecms	| opensourcecms	|
    When she Edit a Post
    Then she update the post with note
   | notePost	|
   | xxxxxxxxx			|
	@scenario4
   Scenario: Edit a Page
    Given than Fanny is on opensourcecms
   | user		| password		|
   | opensourcecms	| opensourcecms	|
    When she Edit a Page
    Then she update the page with note
   | notePages	|
   | yyyyyy		| 