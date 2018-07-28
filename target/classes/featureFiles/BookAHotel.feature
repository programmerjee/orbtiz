Feature: User can book a hotel using orbitz

Background:
Given user has open IE browser
And user has navigated to orbitz.com

Scenario Outline:
Given user has selected departure "<departureCity>"
And user has selected arrival "<arrivalCity>"

Examples:
|departureCity  |arrivalCity|
|ORD|CCU|
|CMH|ORD|
