## SMConf Mobile App
Due to some reasons, the Silicon Mountain Conference has not been help since 2017 and there is a plan to host it
in 2021. 

### Description
Silicon Mountain Conference(SMConf) is the largest gathering of tech innovators from around Cameroon. The name is coined after Mount Cameroon.It is
an annual gathering(or supposed to be) when the community meets to show some of the innovations and as well discuss key issues affecting the community.
This project is meant to be a mobile application for the conference. At completion, it will be a Kotlin Multiplatform Mobile(KMM) project, that is the Android
client built with Jetpack Compose and the iOS client built with SwiftUI and both will have shared business logic.

### Development Environment
The ideal IDE for this project is Android Studio Arctic Fox as we will be doing Android UIs in Jetpack Compose. For those who
will be doing iOS as well, you will need to set up XCode as well in order to compile. The build system that will be used is gradle.


### Resources
- [Download Android Studio](https://developer.android.com/studio)
  
- [Download XCode](https://developer.apple.com/xcode/)

- [Jetpack Compose Pathway](https://developer.android.com/courses/pathways/compose)

- [Swift UI](https://developer.apple.com/xcode/swiftui/)

- [Kotlin Multiplatform Mobile getting started](https://kotlinlang.org/docs/mobile/getting-started.html)



### Architecture
The app will be developed using MVVM design patterns. The Android version will be built purely(or greatly) using
Jetpack Compose for the UI and View Models and the Android Navigation component will be used for navigation. Hilt will be used for
dependency injection.

There will be shared business logic on the shared module. The ios version will be built using Swift and SwiftUI for the UI.

### Contributing to the project.

Contributions are welcome from anyone interested in contributing but following guidelines to be setup will be good.



