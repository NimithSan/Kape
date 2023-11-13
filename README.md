# Kape
<p align="center">
  <a href="#">
    <img src="/assets/kape_logo.svg" alt="Kotlin-Bootstrap logo" width="200" height="165">
  </a>
</p>

<p>
  ⚡Kape is components ui for jetpack compose to help you develop your android app with jetpack compose faster😃 
</p>

## Install
### Installation for build.gradle.kts
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
  implementation("com.github.NimithSan:kape:$kape_version")
}
```

### Installation for build.gradle
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
  implementation "com.github.NimithSan:kape:$kape_version"
}
```


## Loading

```kotlin
KapeLoading(
  style = LoadingStyle.LOADING_SIGNAL,
   modifier = Modifier.size(120.dp)
)
```
 

