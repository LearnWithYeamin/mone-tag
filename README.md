<p align="center">
  <a href="https://github.com/i-rin-eam/meta-ads">
    <img src="https://raw.githubusercontent.com/i-rin-eam/mone-tag/main/images/mone-tag-img.jpg" alt="Logo" width="100" height="100">
  </a> 
<h1 align='center'>Implement MoneTag Ads</h1>
<h3 align='center'>
    <a href="https://www.youtube.com/watch?v=Sgkp46GS6rk">Watch Video</a> for Implementing the MoneTag Ads Library 
    or Visit Official <a href="https://docs.inappi.co/">Documentation</a> for more details.
</h3>
</p>

## Step 1: Add the dependency in `build.gradle (Module :app)`.
```gradle
implementation 'co.notix:android-sdk:0.1.+'
```
> [!NOTE]
> See MoneTag <a href="https://central.sonatype.com/">Latest Version</a>
<img src="https://raw.githubusercontent.com/i-rin-eam/mone-tag/main/images/build-gradle.png">

## Step 2: In `AndroidManifest.xml` <br>

`Add below Permissions.`
```xml
<!-- Permissions required by the application -->
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" /> 
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" /> 
<uses-permission android:name="com.google.android.gms.permission.AD_ID" />
```

`Enable Hardware Acceleration:` *In your `AndroidManifest.xml` file, add the following attribute to the `<application>` tag to enable hardware acceleration for your entire application.*
```xml
android:hardwareAccelerated="true"
```
<img src="https://raw.githubusercontent.com/i-rin-eam/meta-ads/main/app/src/main/res/drawable/android-manifest-xml.jpeg" alt="android-manifest-xml.jpeg">

## Step 3: Create a Java Class (ex. `App.java`) for Initialize Ads.
```java
import android.app.Application;

import co.notix.interstitial.InterstitialLoader;
import co.notix.interstitial.NotixInterstitial;

public class App extends Application {

    // Declare variable
    static InterstitialLoader interstitialLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        // Load Interstitial Ads
        /* ... */
        interstitialLoader = NotixInterstitial.Companion.createLoader(7322252);
        interstitialLoader.startLoading();
    }
}
```
<img src="https://raw.githubusercontent.com/i-rin-eam/mone-tag/main/images/app-java.png" alt="ad-manager-java.png">

## Step 4: Add App.java class in `AndroidManifest.xml` <br>
```xml
android:name=".App"
```
<img src="https://raw.githubusercontent.com/i-rin-eam/mone-tag/main/images/android-manifest.png">

## Step 5: Show Interstitial Ads <br>
```java
// Write this code inside the click event.
App.interstitialLoader.doOnNextAvailable(result -> {
    if (result != null) {
        NotixInterstitial.Companion.show(result);
    }
    return Unit.INSTANCE;
});

//ads কেটে দেওয়ার পর কী ঘটবে সেই কোড এখানে লিখুন...
```
<img src="https://raw.githubusercontent.com/i-rin-eam/mone-tag/main/images/int-ads.png" alt="inter-ads1.png">

## License

Distributed under the Apache License 2.0. See <a href="https://github.com/i-rin-eam/mone-tag/blob/main/LICENSE">LICENSE</a> for more information.

## Authors

**MD YEAMIN** - *Android Software Developer* - <a href="https://github.com/i-rin-eam">MD YEAMIN</a> - *Learn with Ease*

<h1 align="center">Thank You ❤️</h1>
