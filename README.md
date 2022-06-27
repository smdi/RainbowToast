
# Rainbow🌈🌦 Toast Library

## Hey there👋, I have designed this beautiful Rainbow🌈🌦 Toast Library for Java & Kotlin

![Rainbow Dashboard](https://user-images.githubusercontent.com/30797411/173832748-4ab928f9-54e2-4f0a-9bd2-a77c14ea5b82.svg)

![Rainbow Dashboard (1)](https://user-images.githubusercontent.com/30797411/173832830-917e52d0-bb8b-422a-8bcd-18abc330337a.svg)

### Demo📽

###### [Rainbow toast demo youtube link](https://youtu.be/Q8uRkhdkrQs)

https://user-images.githubusercontent.com/30797411/173833000-20eef63b-44ad-4f8f-8c81-80b0a55d40f1.mp4

### Project Dependency

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Module Dependency

```
dependencies {
	        
          implementation 'com.github.smdi:RainbowToast:0.1.1'
}

```

### Implementation for Rainbow🌈🌦 Toast

```
RainbowToast.showToast(mainActivity,                //activity
                        "Hint",                      //title
                        "Grab the Magic Wand",        //message
                        RainbowToast.LENGTH_LONG,      //duration
                        RainbowToast.CUSTOM,            //type
                        RainbowToast.LITE,               //mode
                        R.font.abeezee_regular,           //font for title
                        RainbowToast.DEFAULT_FONT);        //font for message
```

### Default font
```diff
- If you want you use system default font, pass RainbowToast.DEFAULT_FONT as parameter

RainbowToast.DEFAULT_FONT
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

### Two✌ dedicated durations⏰

```
RainbowToast.LENGTH_SHORT       //2 seconds
RainbowToast.LENGTH_LONG        //4 seconds
```

### Implementation for Full Rainbow🌈🌦 Toast

```
FullRainbowToast.showToast(mainActivity,                                                     //activity
                          "Blessed",                                                          //title
                          "Great, You've escaped from witch and won chocolates & candies",     //message
                          FullRainbowToast.LENGTH_LONG,                                         //duration
                          R.font.abeezee_regular,                                                //font for title
                          FullRainbowToast.DEFAULT_FONT);                                         //font for message
```

### Default font

```diff
- If you want you use system default font, pass FullRainbowToast.DEFAULT_FONT as parameter

FullRainbowToast.DEFAULT_FONT
```

```diff
- Note: Types & Modes are not supported for FullRainbowToast
```

### Two✌ dedicated durations⏰

```
FullRainbowToast.LENGTH_SHORT       //2 seconds
FullRainbowToast.LENGTH_LONG        //4 seconds
```

### [License](http://www.apache.org/licenses/LICENSE-2.0)

```
Copyright 2022 Mohammad Imran Shaik

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
