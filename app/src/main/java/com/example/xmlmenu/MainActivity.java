package com.example.xmlmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)//开发选项菜单重写的方法
    {
        MenuInflater inflater = new MenuInflater(this);//菜单动态加载类
        inflater.inflate(R.menu.menu,menu);//调用inflate方法解析菜单文件
        super.onCreateOptionsMenu(menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem mi){
        TextView txt;
        txt = (TextView)findViewById(R.id.txt);
        switch (mi.getItemId()){
            case R.id.font_10:
                txt.setTextSize(20);
                break;
            case R.id.font_16:
                txt.setTextSize(32);
                break;
            case R.id.font_20:
                txt.setTextSize(40);
                break;
            case R.id.font_red:
                txt.setTextColor(Color.RED);
                break;
            case R.id.font_black:
                txt.setTextColor(Color.BLACK);
                break;
            case R.id.plain_item:
                Toast toast =Toast.makeText(MainActivity.this,"这是普通菜单项",Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
        return true;
    }
}
