# Test-Learning

Test-Learning is an Android/Kotlin practice project focused on unit testing fundamentals. It contains small, testable classes for arithmetic, registration validation, string assertions, and repository/service interactions with mocks.

## What This Project Covers

- Basic JUnit tests.
- Google Truth fluent assertions.
- Mockito and Mockito-Kotlin mocks.
- Testing simple business logic.
- Testing validation rules.
- Testing repository behavior against a mocked service.
- Android project setup with ViewBinding enabled.

## Tech Stack

- Kotlin
- Android XML/View system
- AppCompat
- ViewBinding
- JUnit 4
- Google Truth
- Mockito Core
- Mockito-Kotlin
- Espresso / AndroidX test dependencies

## Project Structure

```text
app/src/main/java/ir/alirahimi/testapp
├── Calculator.kt                 # Simple arithmetic methods
├── RegistrationUtil.kt           # Registration validation rules
├── MainActivity.kt               # Minimal Android activity
└── data
    ├── local/User.kt             # User data model
    ├── service/UserService.kt    # In-memory user source
    └── repository/UserRepository.kt

app/src/test/java/ir/alirahimi/testapp
├── CalculatorTest.kt
├── RegistrationUtilTest.kt
├── StringTest.kt
├── UserRepositoryTest.kt
├── MainActivityTest.kt
└── ExampleUnitTest.kt
```

## Tested Logic

### Calculator

The calculator supports:

- Addition
- Subtraction
- Multiplication
- Integer division
- Division-by-zero protection in production code

### Registration Validation

`RegistrationUtil` returns invalid when:

- Username is empty.
- Password is empty.
- Username already exists.
- Password confirmation does not match.
- Password contains fewer than two digits.

### Repository Tests

`UserRepositoryTest` uses Mockito to mock `UserService` and verify that repository methods call the expected service methods for:

- Get user by ID
- Get user by name
- Get user by email
- Get all users
- Invalid user lookup

## Running Tests

```bash
./gradlew test
```

For Android instrumentation tests:

```bash
./gradlew connectedAndroidTest
```

## Getting Started

1. Clone the repository.
2. Open it in Android Studio.
3. Sync Gradle.
4. Run the unit tests from Android Studio or with Gradle.

## Notes

This repository is intentionally small and focused on testing practice, not on building a full user-facing Android app.
