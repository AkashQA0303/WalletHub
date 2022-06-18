Feature: Wallethub review scenario

Scenario: Post the review and verify the same

Given user navigates to "https://wallethub.com/profile/test-insurance-company-13732055i"
When user hover over "4" star
And click on "4" star
Then user landed on "https://wallethub.com/profile/test-insurance-company-13732055i"
When user selects "Health Insurance" option from Policy dropdown
And user writes a review "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum"
And click on Submit button
Then user switch to Login screen
And user enter username "akash750013@gmail.com"
And user enter password "Akash@1808"
And click on Login button
Then verify review is present