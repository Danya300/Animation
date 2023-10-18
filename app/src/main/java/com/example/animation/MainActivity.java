package com.example.animation;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем ссылки на изображение солнца, траву и машину
        ImageView sunImageView = findViewById(R.id.sun);
        ImageView grassImageView = findViewById(R.id.grass);
        ImageView carImageView = findViewById(R.id.car);

        // Анимация для восхода солнца
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sunrise);
        sunImageView.startAnimation(sunRiseAnimation);

        // Анимация для движения машины по траве
        Animation carMoveAnimation = AnimationUtils.loadAnimation(this, R.anim.car_move);
        carImageView.startAnimation(carMoveAnimation);
    }
}
