
# Rainbow🌈🌦 Toast Library

## Hey there👋, I have designed this beautiful Rainbow🌈🌦 Toast Library for Java & Kotlin

![Rainbow Dashboard](https://user-images.githubusercontent.com/30797411/173832748-4ab928f9-54e2-4f0a-9bd2-a77c14ea5b82.svg)

![Rainbow Dashboard (1)](https://user-images.githubusercontent.com/30797411/173832830-917e52d0-bb8b-422a-8bcd-18abc330337a.svg)

### Demo

https://user-images.githubusercontent.com/30797411/173833000-20eef63b-44ad-4f8f-8c81-80b0a55d40f1.mp4

### Project Dependency for Rainbow🌈🌦 Toast Library

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Module Dependency for Rainbow🌈🌦 Toast Library

```
dependencies {
	        
          implementation 'com.github.smdi:RainbowToast:0.1.1'
}

```

### Implementation for Rainbow🌈🌦 Toast Library

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

### Five✋ types

```
RainbowToast.SUCCESS
RainbowToast.ERROR
RainbowToast.WARNING
RainbowToast.INFO
RainbowToast.CUSTOM
```

### Two✌ modes

```
RainbowToast.LITE
RainbowToast.DARK
```

### Two✌ dedicated durations

```
RainbowToast.LENGTH_SHORT       //2 seconds
RainbowToast.LENGTH_LONG        //4 seconds
```

### Implementation for Full Rainbow🌈🌦 Toast Library

```
FullRainbowToast.showToast(mainActivity,                                                        //activity
                          "Blessed",                                                             //title
                          "Great, You've escaped from witch and won chocolates & candies",        //message
                          FullRainbowToast.LENGTH_LONG,                                            //duration
                          R.font.abeezee_regular,                                                   //font for title
                          R.font.abeezee_regular);                                                   //font for message
```

```diff
- Note: Types & Modes are not supported for FullRainbowToast
```

### Two✌ dedicated durations

```
FullRainbowToast.LENGTH_SHORT       //2 seconds
FullRainbowToast.LENGTH_LONG        //4 seconds
```


