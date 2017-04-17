[![](https://jitpack.io/v/jgabrielfreitas/DataControllerDemo.svg)](https://jitpack.io/#jgabrielfreitas/DataControllerDemo) [![](https://img.shields.io/badge/Language%20-Java-4682b4.svg)](https://jitpack.io/#jgabrielfreitas/DataControllerDemo) 
![LicenseTextView](https://raw.githubusercontent.com/jgabrielfreitas/LicenseTextView/master/img/licensetextview.png)


#LicenseTextView
Easy License View for Android

###How to
**Step 1.** Add the JitPack repository to your build file
```gradle
allprojects {
		repositories {
			...
			maven { url  "http://dl.bintray.com/jgabrielfreitas/maven" }
		}
	}
```

**Step 2.** Add the dependency
```gradle
dependencies {
		compile 'com.jgabrielfreitas:licensetextview:1.1.2'
	}
```
**That's it!**

###Usage

> Do it in your root layout

```xml
<com.jgabrielfreitas.androidmdown.widget.LicenseTextView
        android:id="@+id/licenseTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:text="@string/license"
        app:backgroundLicenseColor="#F7F7F7"
        app:licenseColor="#333333" />
```

> To have your text look like this :

![LicenseTextView](https://raw.githubusercontent.com/jgabrielfreitas/LicenseTextView/master/img/license_print.jpg)



### License
```
Copyright 2016 JGabrielFreitas

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
