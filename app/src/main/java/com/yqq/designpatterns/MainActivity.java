package com.yqq.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yqq.designpatterns.behaviour.Adapter.ClassAdaptee;
import com.yqq.designpatterns.behaviour.Adapter.ObjectAdapter;
import com.yqq.designpatterns.behaviour.bridging.Abstraction;
import com.yqq.designpatterns.behaviour.bridging.AbstractionImpl;
import com.yqq.designpatterns.behaviour.bridging.IImplementor;
import com.yqq.designpatterns.behaviour.bridging.ImplementorImpl;


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

//        ArrayList<String> mList=new ArrayList<String>();
//        mList.add("引用数据1");
//        mList.add("引用数据2");
//        mList.add("引用数据3");
//        PrototypeSample _PrototypeSample=new PrototypeSample("测试标题",mList);
//        _PrototypeSample.show();
//        try {
//            PrototypeSample _PrototypeSample2=  _PrototypeSample.clone();
//            Log.e("原型模式","===============修改前======================");
//            _PrototypeSample2.show();
//
//
//            _PrototypeSample2.setmTitle("你以为这样就效率高？");
//
//            mList.add("引用数据1222222");
//            mList.add("引用数据2222222222222222");
//            mList.add("引用数据322222222222");
//            //_PrototypeSample2.setmList(mList);
//
//            Log.e("原型模式","===============修改后======================");
//            _PrototypeSample2.show();
//            Log.e("原型模式","===============修改后=原始对象显示=====================");
//            _PrototypeSample.show();
//
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }

        /*******************************代理模式测试********************************/
        //静态代理
//        Subject subject=new RealSubject();
//        Proxy proxy=new Proxy(subject);
//        proxy.doMyLoveThings("设计模式让自己的代码更有艺术感");



        //创建动态代理
//        Subject subject=new RealSubject();
//        DynamicProxy _DynamicProxy=new DynamicProxy(subject);
//        //创建具体主题的类加载器
//        ClassLoader classLoader=subject.getClass().getClassLoader();
//        //对这个接口Subject调用全部转移到_DynamicProxy
//        Subject _sub= (Subject) java.lang.reflect.Proxy.newProxyInstance(classLoader,new Class[]{Subject.class},_DynamicProxy);
//        _sub.doMyLoveThings("动态代理执行测试");

        /*******************************装饰器模式测试********************************/

//        OriginClass _OriginClass=new OriginClassImpl();
//        Decorator _Decorator=new DecoratorImpl(_OriginClass);
//        _Decorator.baseFunc("=========装饰器模式==================");


        /*******************************外观模式测试********************************/
//        Facade _Facade=new Facade();
//        _Facade.prepare("程序");
//        _Facade.execute("任务");
//        _Facade.onDestroy("资源");

        /*******************************享元模式测试********************************/

//        Log.e("享元模式测试", FlyweightFactory.getFlyweight("test")+"");


        /*******************************策略模式测试********************************/
//        StragetyContext context=null;
//        context=new StragetyContext(new StragetyImpl());
//        context.algorithm("===========策略1===========");
//
//
//        context=new StragetyContext(new StragetyImpl2());
//        context.algorithm("===========策略2===========");



        /*******************************模板方法模式测试********************************/
//        StudentClass _StudentClass=new StudentClass();
//        _StudentClass.OneDay4Live();
//
//        WorkerClass _WorkerClass=new WorkerClass();
//        _WorkerClass.OneDay4Live();




        /*******************************观察者模式测试********************************/

//        //创建观察者
//        IObserver _Observer=new ObserverImpl("李华");
//        IObserver _Observer2=new ObserverImpl("小明");
//        IObserver _Observer3=new ObserverImpl("超人");
//        IObserver _Observer4=new ObserverImpl("悟空");
//        IObserver _Observer5=new ObserverImpl("张三丰");
//
//        //创建主题
//        com.yqq.designpatterns.behaviour.observer.Subject subject=new SubscriptSubject();
//        subject.addObserver(_Observer);
//        subject.addObserver(_Observer2);
//        subject.addObserver(_Observer3);
//        subject.addObserver(_Observer4);
//        subject.addObserver(_Observer5);
//
//        subject.notify("=====测试观察者模式开始=====");
//        subject.removeObserver(_Observer4);
//        subject.notify("=====测试观察者模式开始=====");

        /*******************************适配器模式测试********************************/

//        ClassAdapter _ClassAdapter=new ClassAdapter();
//        _ClassAdapter.dowork2("类适配器测试");

//        ObjectAdapter _ObjectAdapter=new ObjectAdapter(new ClassAdaptee());
//        _ObjectAdapter.dowork2("对象适配器测试");

        /*******************************桥接模式测试********************************/

        IImplementor implementor=new ImplementorImpl();

        Abstraction _Abstraction=new AbstractionImpl(implementor);

        _Abstraction.doWork("桥接模式测试");



    }
}
