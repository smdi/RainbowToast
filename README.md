
# Toast Library

## Hey there👋, I have designed this beautiful Toast Library for Java & Kotlin to satisfy all the toast designs requirements of businesses

### Contents

### 1) [Rainbow Toast Library🌈🌦](#rainbow-toast-library) - 0.x.x
### 2) [Halloween Toast Library🎃🦇](#halloween-toast-library) - 1.x.x

### Rainbow Toast Library

![Rainbow Dashboard](https://user-images.githubusercontent.com/30797411/173832748-4ab928f9-54e2-4f0a-9bd2-a77c14ea5b82.svg)

![Rainbow Dashboard (1)](https://user-images.githubusercontent.com/30797411/173832830-917e52d0-bb8b-422a-8bcd-18abc330337a.svg)

### Demo

https://user-images.githubusercontent.com/30797411/173833000-20eef63b-44ad-4f8f-8c81-80b0a55d40f1.mp4

### Project Dependency for Rainbow Toast Library - 0.x.x

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Module Dependency for Rainbow Toast Library - 0.x.x

```
dependencies {
	        
          implementation 'com.github.smdi:ToastLibrary:0.1.1'
}

```

### Implementation for Rainbow Toast Library - 0.x.x

```
RainbowToast.showToast(mainActivity,                //activity
                        "Hint",                      //title
                        "Grab the Magic Wand",        //message
                        RainbowToast.LENGTH_LONG,      //duration
                        RainbowToast.CUSTOM,            //type
                        RainbowToast.LITE,               //mode
                        R.font.abeezee_regular,           //font for title
                        R.font.abeezee_regular);           //font for message
```

### Implementation for Full Rainbow Toast Library - 0.x.x

```
FullRainbowToast.showToast(mainActivity,                                                                //activity
                          "Blessed",                                                                     //title
                          "Great, You've escaped from witch and won chocolates & candies",                //message
                          FullRainbowToast.LENGTH_LONG,                                                    //duration
                          R.font.abeezee_regular,                                                           //font for title
                          R.font.abeezee_regular);                                                           //font for message
```

### Halloween Toast Library

![Halloween Dashboard](https://user-images.githubusercontent.com/30797411/173759066-88f9f0ca-2de2-4cad-baa5-699b6ad1e0be.svg)

![Halloween Dashboard](https://user-images.githubusercontent.com/30797411/173585931-c1bc56a5-6927-4b6b-8bce-4fa00200dfcb.svg)

### Demo

https://user-images.githubusercontent.com/30797411/173805516-eaa8e092-352c-4d38-8125-427f8f2aa5d8.mp4

### Project Dependency for Halloween Toast Library - 1.x.x

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Module Dependency for Halloween Toast Library - 1.x.x

```
dependencies {

	        implementation 'com.github.smdi:ToastLibrary:1.1.1'
}

```

### Implementation for Halloween Toast Library - 1.x.x

```
HalloweenToast.showToast(mainActivity,                   //activity
                        "Sunrise",                        //title
                        "You've survived the demons",      //message
                        HalloweenToast.LENGTH_LONG,         //duration
                        HalloweenToast.SUCCESS,              //type
                        HalloweenToast.LITE,                  //mode
                        R.font.eater_regular,                  //font for title 
                        R.font.fontdinerswanky_regular);        //font for message
```
