# LastFm Music Peek

An explorer app for music album artwork and finding music online


<img width="428" alt="app02" src="https://user-images.githubusercontent.com/4844875/51880288-971ac700-236e-11e9-9b50-1c8aa5689987.PNG">


Uses: 
- **MVP design pattern**,
- **local Unit tests**,
- **Mockito** for unit test isolation,
- **BDD** (using BddMockito)
- **Espresso** for UI tests, 
- **flavor dimensions** to separate production environment from testing environment (for example providing fake implementations of the Api ie not the same as  Mocks).
- **Support for multiple screen DPI**s using resource qualifiers
- Picasso (image loading etc.)
- **Retrofit** for simple RESTful client implementation
- **Dagger** components / modules to provide dependencies (product flavor based)

<img width="210" alt="production_differentiated_res- support for different screen sizes" src="https://user-images.githubusercontent.com/4844875/51880332-d0ebcd80-236e-11e9-86e9-9def9884fdf1.PNG">

- Architecture Pattern: **Model View Presenter (MVP)**
- The app is organized *Feature-per-Package* 
- There is a set of local Unit tests written with **JUnit**
- **BDD Mockito** was used to generate mocks and better isolate these unit tests
- **Espresso** was used to test the UI
- **Animations (by animating view properties)  --> video below**


[![YouTube demo](https://img.youtube.com/vi/8-dx6n6e3_0/hqdefault.jpg)](https://www.youtube.com/embed/8-dx6n6e3_0)



# Api configuration
- use of xml to hold api related config -> api_config.xml 
- currently holds root path for LastFm api
- can be used for any api related parameters

# Api keys
IMPORTANT: prevent commit of secret keys

- you will need to create a secrets.xml resource file for the prod Build Variant (which is gitignore'd)
- WARNING: THIS DOES NOT PROTECT KEYS AGAINST APK DECOMPILE
- app/src/prod/res/values/secrets.xml

# Tests

**Testing with dependency isolation**
The app makes the best use of gradle buildconfigs and flavour variants as necessary for test isolation.
Three major factors help reduce interference from external dependencies:

- Dependency injection (using a dagger component and modules (specific to Build Variants)
- Usage of mocked dependencies on unit tests
- Make use of build variants so tests can be conducted with Fake Implementations of the Api


**Espresso tests - Automated End-to-End tests**
- Creation of 'androidTestMock' to separate testing of the UI from the api (uses FakeApiImpl)
- ViewActions and ViewMatchers are used in order to confirm the intended view hierarchy exists
- ViewAssertions are used to assert view content is the intended both after valid and error responses

# Building / running the app and tests

The simplest way to run the app is:

1. Import the app into android studio
2. Select the 'Build Variant' you wish to run
3. Run the default run configuration for the :app module

![02](https://user-images.githubusercontent.com/4844875/51235414-55018680-1967-11e9-9253-994247d53e43.PNG)

Alternatively you may manually run the relevant gradle task to build that variant (either through android studio or by using the gradle wrapper (gradlew) 

example to run all the test src sets
```gradlew test```

example to run the testMockDebug test srcSet 
```gradlew testMockDebug```


# Screenshots

<img width="428" alt="app01" src="https://user-images.githubusercontent.com/4844875/51880280-8ec28c00-236e-11e9-8ace-8d54b7d8ded4.PNG">


<img width="428" alt="app02" src="https://user-images.githubusercontent.com/4844875/51880830-a7cc3c80-2370-11e9-8d6a-30721eaa9a02.PNG">


<img width="428" alt="app03" src="https://user-images.githubusercontent.com/4844875/51880847-b4509500-2370-11e9-96aa-bb21b8b467be.PNG">


Extra:
Same activity, different icons for the development environment and production for developer convenience

![capture02](https://user-images.githubusercontent.com/4844875/51880811-98e58a00-2370-11e9-8d49-e18c50f4aacb.PNG)


Backend & Api by LastFM 

<div>Icons made by <a href="https://www.flaticon.com/authors/kiranshastry" title="Kiranshastry">Kiranshastry</a> from <a href="https://www.flaticon.com/" 			    title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" 			    title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div>
