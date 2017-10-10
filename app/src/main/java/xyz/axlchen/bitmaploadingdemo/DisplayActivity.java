package xyz.axlchen.bitmaploadingdemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        ImageView img = (ImageView) findViewById(R.id.img);
        TextView txt = (TextView) findViewById(R.id.txt);

        Intent intent = getIntent();
        String type = intent.getStringExtra("type");
        Bitmap bitmap = null;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (type.equals("sd")) {
//            bitmap = BitmapFactory.decodeResource(getResources(),)
        } else if (type.equals("mdpi")) {
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.model_mdpi, options);
        } else if (type.equals("hdpi")) {
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.model_hdpi, options);
        } else if (type.equals("xhdpi")) {
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.model_xhdpi, options);
        } else if (type.equals("xxhdpi")) {
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.model_xxhdpi, options);
        } else if (type.equals("xxxhdpi")) {
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.model_xxxhdpi, options);
        }
        img.setImageBitmap(bitmap);
        txt.setText(bitmap.getByteCount() + "byte");
    }
}
