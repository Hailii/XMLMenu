# 实验三
## UI组件
### 使用XML定义菜单
#### 主页面
![无法显示](/images/1.png)
#### 菜单
![无法显示](/images/2.png)
#### 调整字体大小
![无法显示](/images/3.png)
#### 小
![无法显示](/images/4.png)
#### 中
![无法显示](/images/5.png)
#### 大
![无法显示](/images/6.png)
#### 普通菜单项
![无法显示](/images/7.png)
#### 调整字体颜色
![无法显示](/images/8.png)
#### 红色
![无法显示](/images/9.png)
#### 黑色
![无法显示](/images/10.png)
#### 关键代码
```
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
```
