package com.yqq.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.yqq.designpatterns.create.Prototype.PrototypeSample;
import com.yqq.designpatterns.create.builder.Builder;
import com.yqq.designpatterns.create.builder.Builder2;
import com.yqq.designpatterns.create.builder.ConcretBuilder;
import com.yqq.designpatterns.create.builder.ConcretBuilder2;
import com.yqq.designpatterns.create.builder.Direcror;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void doTest(View view){

        /**********************************DCL单例测试**************************************/

//        Log.e("单例测试",  Singleton.getInstance()+"");
//
//        try{
//
//
//            Log.e("--------",this.getCacheDir().toString());
//            File file=new File(this.getCacheDir(),"object.out");
//            FileOutputStream fos = new FileOutputStream(file);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(Singleton.getInstance());
//            oos.close();
//            fos.close();
//
//            // 2. 把硬盘文件上的对象读出来
//            File file2=new File(this.getCacheDir(),"object.out");
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file2));
//            // 如果对象定义了readResolve()方法，readObject()会调用readResolve()方法。从而解决反序列化的漏洞
//            Singleton o = (Singleton) ois.readObject();
//            // 反序列化出来的对象，和原对象，不是同一个对象。如果对象定义了readResolve()方法，可以解决此问题。
//
//            Log.e("单例测试反序列化", o+"");
//            ois.close();
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//
//        }
//

        /**********************************静态内部类单例测试**************************************/


//        Log.e("单例测试",  Singleton4Static.getInstance()+"");
//
//        try{
//
//
//            Log.e("--------",this.getCacheDir().toString());
//            File file=new File(this.getCacheDir(),"object.out");
//            FileOutputStream fos = new FileOutputStream(file);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(Singleton4Static.getInstance());
//            oos.close();
//            fos.close();
//
//            // 2. 把硬盘文件上的对象读出来
//            File file2=new File(this.getCacheDir(),"object.out");
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file2));
//            // 如果对象定义了readResolve()方法，readObject()会调用readResolve()方法。从而解决反序列化的漏洞
//            Singleton4Static o = (Singleton4Static) ois.readObject();
//            // 反序列化出来的对象，和原对象，不是同一个对象。如果对象定义了readResolve()方法，可以解决此问题。
//
//            Log.e("单例测试反序列化", o+"");
//            ois.close();
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//
//        }


        /*******************************简单工厂测试********************************/

//        SimpleFactory.createCar("vw").product();
//        SimpleFactory.createCar("audi").product();


        /*******************************工厂方法测试********************************/
//        CarFactory carFactory=new SHCarFactory();
//        carFactory.createCar(VWCar2.class).product();



        /*******************************建造者模式测试1********************************/
//        Builder carBuilder=new ConcretBuilder();
//        Direcror direcror=new Direcror(carBuilder);
//       com.yqq.designpatterns.create.builder.Car car= direcror.createCar();
//
//        Log.e("建造者模式测试1",  car.toString());
//
//        Builder2 carBuilder2=new ConcretBuilder2();
//        com.yqq.designpatterns.create.builder.Car car2=   carBuilder2.buildWheel("轮胎").buildCarBody("车身").buildEngine("发动机").create();
//        Log.e("建造者模式测试2链式diaoy",  car2.toString());


        /*******************************原型模式测试********************************/

        ArrayList<String> mList=new ArrayList<String>();
        mList.add("引用数据1");
        mList.add("引用数据2");
        mList.add("引用数据3");
        PrototypeSample _PrototypeSample=new PrototypeSample("测试标题",mList);
        _PrototypeSample.show();
        try {
            PrototypeSample _PrototypeSample2=  _PrototypeSample.clone();
            Log.e("原型模式","===============修改前======================");
            _PrototypeSample2.show();


            _PrototypeSample2.setmTitle("你以为这样就效率高？");

            mList.add("引用数据1222222");
            mList.add("引用数据2222222222222222");
            mList.add("引用数据322222222222");
            //_PrototypeSample2.setmList(mList);

            Log.e("原型模式","===============修改后======================");
            _PrototypeSample2.show();
            Log.e("原型模式","===============修改后=原始对象显示=====================");
            _PrototypeSample.show();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }




    }
}
