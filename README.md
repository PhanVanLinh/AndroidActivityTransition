# AndroidActivityTransition

#### To switch activity without animation you can use
1)
```
<item name="android:windowAnimationStyle">@null</item>
```
in style.xml

2)
```
overridePendingTransition(0, 0)
```
use when start and finish activity

3)
```
addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
```
use this flag when start activity

**Note**: After using above way, when testing on emulator, sometime we see it flicker when switch (but when testing in few device (eg: Kyocera 7.0, Samsung Note 5 5.0) it not flicker

**Reference**
https://stackoverflow.com/questions/6972295/switching-activities-without-animation

### For override fade in/ fade out method

https://stackoverflow.com/questions/18475826/how-to-perform-a-fade-animation-on-activity-transition