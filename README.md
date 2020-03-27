# demo2Activity

Process
1. 首先新建CrimeActivity并选用FrameLayout组件为CrimeFragment视图安排了显示位置，CrimeFragment类中有存储成员变量，并设有监听器，会相应用户操作时，更新模型层数据。
2. 新建Crime类作javaBean。
3. fragment的生命周期方法是由托管Activity调用而不是操作系统。
4. 覆盖Fragment.onCreate方法，新建一个crime。但fragment的视图是在fragment.onCreate方法中生成的。调用LayoutInflater.inflate(R,viewGroup,boolean)返回View。
5. 在CrimeFragment中实例化各种组件。
6. FragmentManager类负责管理fragment并将它们的视图添加到activity的视图层级结构中。
7. 首先获取FragmentManager本身，Fragment fm = getSupportFragmentManager()。再获取一个fragment交给它管理。
8. 实例化一个fragment，然后在事务返回栈中——新建一个fragment事物，执行一个fragment添加操作，然后提交该事务。
```
fm.beginTransaction().add(R,fragment).commit();
```
9.
