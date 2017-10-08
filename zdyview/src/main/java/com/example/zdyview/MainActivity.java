package com.example.zdyview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.QRCodeWriter;

import java.util.HashMap;
import java.util.Map;

import static com.example.zdyview.R.id.iv;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1;
    private Button btn2;
    private ImageView ima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        ima = (ImageView) findViewById(iv);

    }

    @Override
    public void onClick(View view) {
        Bitmap bit = null;
        switch (view.getId()){
            case R.id.button1:
                //生成二维码
                bit = generateBitmap("http://blog.csdn.net/yanzhenjie1003/article/details/52503533",400,400);
                ima.setImageBitmap(bit);
                break;
            case R.id.button2:
                //生成自定义的二维码
                //首先，生成二维码
                bit = generateBitmap("http://blog.csdn.net/yanzhenjie1003/article/details/52503533",400,400);
                //添加logo图标
                //得到logo
                Bitmap bitmap_logo = BitmapFactory.decodeResource(getResources(), R.drawable.a);
                //把logo图标添加到二维码上面
                
                break;
        }
    }
    private Bitmap generateBitmap(String content , int width , int height){
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        Map<EncodeHintType,String> hints =  new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET,"utf-8");
        return null;
    }
}
