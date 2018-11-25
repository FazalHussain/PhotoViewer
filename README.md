# SquareImageView
[![](https://jitpack.io/v/Fazalcs13/SquareImageView.svg)](https://jitpack.io/#Fazalcs13/SquareImageView)

# Description
PhotoViewer is a simple wrapper library for Android Compount Controls. Square Image View is an Image View with an square dimension. Rectangle Image View is an image View with a rectangle dimension. SpiralPhotoView is a view group which is used to place multiple image view that is portrait or landscape in a single Spiral view.

![Square Image View](https://scontent.fkhi2-1.fna.fbcdn.net/v/t1.15752-9/46821428_317032732470367_5979977455501312000_n.png?_nc_cat=107&_nc_ht=scontent.fkhi2-1.fna&oh=5fc850f0148f5e2ea25bf88bcd6df961&oe=5C6DA560)
![Rectangle Image View](https://scontent.fkhi2-1.fna.fbcdn.net/v/t1.15752-9/46751221_2172401879753958_2845155777625194496_n.jpg?_nc_cat=100&_nc_ht=scontent.fkhi2-1.fna&oh=2155841ae26d40cd8fc5b608e5be0ebb&oe=5C6A1860)
![Spiral Photo Viewer](https://scontent.fkhi2-1.fna.fbcdn.net/v/t1.15752-9/46725849_336890353530606_8856802681289703424_n.png?_nc_cat=106&_nc_ht=scontent.fkhi2-1.fna&oh=5cfb2358e4758ea0519b6345a465991f&oe=5CAAFE9F)
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

# Spiral Photo Viewer

From xml:

```
<com.example.library.SpiralPhotoViewer xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    tools:context=".MainActivity">


    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@drawable/ulm" />


    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@drawable/himeji" />

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@drawable/petronas_twin_tower" />


    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@drawable/chiang_mai" />


</com.example.library.SpiralPhotoViewer>
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



