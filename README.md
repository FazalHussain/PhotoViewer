# SquareImageView
[![](https://jitpack.io/v/Fazalcs13/SquareImageView.svg)](https://jitpack.io/#Fazalcs13/SquareImageView)

# Description
SquareImageView is a simple wrapper library for Android AppCompat ImageView.

![Square Image View](https://scontent.fkhi2-1.fna.fbcdn.net/v/t1.15752-9/46821428_317032732470367_5979977455501312000_n.png?_nc_cat=107&_nc_ht=scontent.fkhi2-1.fna&oh=5fc850f0148f5e2ea25bf88bcd6df961&oe=5C6DA560)
![Rectangle Image View](blob:https://web.whatsapp.com/df477d5a-098b-4fe4-9582-aa2133046170)
# How to use Square AppCompat ImageView?

From xml:

```
<com.example.library.SquareImageView
        android:layout_centerInParent="true"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@drawable/thinkoutsidethebox_newthumb" />
```

# Rectangle Image View

From xml:

```
<com.example.library.RectangleImageView
        android:layout_centerInParent="true"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@drawable/thinkoutsidethebox_newthumb" />
```

# Gradle dependency

Add it in your **root build.gradle**

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

In your **project level's build.gradle:**

```
dependencies {
    ...
    implementation 'com.github.Fazalcs13:SquareImageView:1.0'
}
```



