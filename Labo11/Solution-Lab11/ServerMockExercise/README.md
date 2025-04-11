# Server Mock Exercise

This project serves as playground for configuring the Mockity framework, to replace a SUT dependency by a Mock.

## Context

In more detail, the SUT (`TagCounter`) has a function to count how many html tags are contained in a raw HTML string.

* We want to test this function with a unit test.
* We do not want our test to require an internet connection.
* The trick is to replace the `ServerFileDownloader` dependency of our SUT class by a Mock, using Mockito.
