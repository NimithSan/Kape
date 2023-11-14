# Kape
<p align="center">
  <a href="#">
    <img src="/assets/kape_logo.svg" alt="Kotlin-Bootstrap logo" width="200" height="165">
  </a>
</p>

<p>
  ⚡Kape is components ui for jetpack compose to help you develop your android app with jetpack compose faster😃 
</p>

## Installation for build.gradle.kts
update your repositories in settings.gradle.kts:
```gradle
repositories {
  google()
  mavenCentral()
  maven(url = "https://jitpack.io") //add this line
}
```
update your dependency in build.gradle
```gradle
dependencies {
  implementation("com.github.NimithSan:Kape:0.0.1")
}
```

## Installation for build.gradle
update your repositories in settings.gradle:
```gradle
repositories {
  google()
  mavenCentral()
  maven { url 'https://jitpack.io' } //add this line
}
```
update your dependency in build.gradle
```gradle
dependencies {
  implementation "com.github.NimithSan:Kape:0.0.1"
}
```


## Loading
we have all this style
```kotlin
  LoadingStyle.LOADING_SIGNAL,
  LoadingStyle.LOADING_NAZA,
  LoadingStyle.LOADING_CYBER,
  LoadingStyle.LOADING_CIRCLE,

```
```kotlin
KapeLoading(
  style = LoadingStyle.LOADING_SIGNAL,
   modifier = Modifier.size(120.dp)
)
```
 

