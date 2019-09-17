# Android Project Template

This is a base setup for an Android project written in Kotlin using the
[CLEAN](https://proandroiddev.com/kotlin-clean-architecture-1ad42fcd97fa)
architecture pattern. You may notice that the `data` module is an
Android Library while the `domain` module is a simpler Java Library. As
mentioned in the linked article on CLEAN architecture, this due to the
fact that the `data` module will need access to some Android resources
such as `SharedPreferences` and `Context` while the `domain` module
consists primarily of simple interface classes that act as a contract
between the data and UI layers and does not require anything Android
specific.
*NOTE:* This is pending an edit as the domain module does in fact need to be an Android Library due to the fact that I often use architecture components (such as LiveData) in the repository files.

This template utilizes the new
[Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html)
plugin for Gradle scripts. Migrating from the traditional Groovy DSL can
be a bit confusing at first; however, there continues to be a growth in
adoption of the Kotlin DSL alternative and, in turn, increasing
documentation and guides to walk you through the setup. After reading
through a number of articles and guides on the subject, I settled on
[this](https://antonioleiva.com/kotlin-dsl-gradle/) as it is
exceptionally clean and most closely replicates how I structured my
scripts with Groovy.

A number of commonly used libraries are included in the `Config.kt` file
under the `buildSrc` module. This template uses AndroidX libraries
wherever possible and implementations of applicable libraries have been
added in the individual module `.gradle` files. You can obviously
add/remove them as necessary as they were added primarily as an example,
but the structure is their to easily scale and maintain dependencies.

The `.gitignore` file was pulled from a
[GitHub repo](https://github.com/github/gitignore/blob/master/Android.gitignore)
and contains commonly ignored files for Android projects. I ignored the
entire `.idea/` directory for the purposes of this template, but you may
want to keep some of those files versioned depending on your or your
team's preferences.

I hope you find this a useful starting point for your next Android app!
Enjoy!

![Happy Android Developing!](https://expocodetech.com/wp-content/uploads/2015/08/android-logo-200x200-200x200.jpg)
