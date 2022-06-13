package com.demo.designmodel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        // 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
        IUserDao target = new UserDao();
        System.out.println(target.getClass());

        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save();
    }


}

class ProxyFactory {
    private Object target;

    ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("start session");
                        Object returnValue = method.invoke(target, args);
                        System.out.println("end session");
                        return returnValue;
                    }
                });
    }
}
