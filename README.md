# Android-N-Java8-Sample
It's time to try java 8 features on Android with [official](https://developer.android.com/intl/es/preview/j8-jack.html) support!

This project includes two sample hello world apps to play with java8 features out of the box.

So the only steps you need to follow are:

1. [Install Java8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) on your machine. Check if you already have it at */Library/Java/JavaVirtualMachines* for OS X.
2. [Download](http://tools.android.com/download/studio/canary/latest) Android Studio Preview 2.1 (introduces the new **jack** compiler and toolchain)
3. Point to Java 8 in Project structure (`⌘`+`;`)
![as-prefs](/images/project.jpg)
4. Download this project and run it.

## Inside this project
This project includes two apps:
- **lambda-app**: Let's you try **lambdas**
  compatible with any device/emulator API 10+

![lambda](/images/lambda.png)
  
- **more-java8-app**: Let's you try the [rest](https://developer.android.com/intl/es/preview/j8-jack.html) of the Java 8 features supported only by Android N
  
  Only compatible with devices/emulators API 24+ (N)

![more](/images/more.png)

## Create N emulator

Just in case you can't find the new Android N emulator:

1. Open AVD Manager.
2. Press the Create new virtual device button
3. Select any definition you like and press next
4. Here comes the trick. Notice the x86 tab selected.
By default the Recommended tab is selected and probably you won't find the N emulator there.

![trick](/images/n-emulator.png)

