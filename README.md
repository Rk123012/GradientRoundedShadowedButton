# GradientRoundedShadowedButton
**version 1.0.1**

This android library is library for custom button with gradient color, rounded and shadow

## Getting Started
Firstly add the below lines in build.gradle

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
 Then add the following dependency in the app.gradle
 ```
 dependencies {
	        implementation 'com.github.Rk123012:GradientRoundedShadowedButton:v1.0.1'
	}
 ```
 ## Usage
 ```
 <com.rkjony.gradientroundedconrnerbutton.CustomButton
        android:id="@+id/custom_btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="8dp"
        android:layout_marginTop="8dp"
        app:button_end_color="#00ff00"
        app:button_gradient_orientation="LEFT_RIGHT"
        app:button_is_shadowed="false"
        app:button_press_end_color="#EEE5DE"
        app:button_press_start_color="#EEA9B8"
        app:button_radius="8dp"
        app:button_shadow_angle="90"
        app:button_shadow_color="#f00"
        app:button_shadow_distance="5dp"
        app:button_shadow_radius="8dp"
        app:button_start_color="#ff0000"
        app:button_text="Click me"
        app:button_text_color="#fff"
        app:button_text_padding="8dp"
        app:button_text_size="12sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```
## programmatically(java)
~~~
   CustomButton customButton = findViewById(R.id.custom_btn);

        TextView textView = customButton.getButton();
        Typeface font = Typeface.defaultFromStyle(Typeface.ITALIC);
        textView.setTypeface(font);
        customButton.setButtonRadius(20);
        customButton.setShadowRadius(10);
        customButton.setShadowColor(Color.RED);
        customButton.setButtonStartColor(Color.parseColor("#000000"));
        customButton.setButtonEndColor(Color.parseColor("#0000FF"));
        customButton.setButtonPressStartColor(Color.BLACK);
        customButton.setButtonPressEndColor(Color.BLACK);
        customButton.setButtonGradientOrientation(CustomButton.LEFT_RIGHT);
        customButton.getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_LONG).show();
            }
        });
~~~


## Contributors
Rezaul Karim Jony, Mobile Application Developer,
email: rezaulkarim.imraan@gmail.com
