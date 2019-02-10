import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 作者：张风捷特烈
 * 时间：2019/2/10/010:8:21
 * 邮箱：1981462002@qq.com
 * 说明：有你相伴--静态内部类
 * 然我们不是同类，但感谢有你相伴
 */
public class World implements Serializable {
    //[1]私有化构造
    private World() {
        initWorld();//初始化世界
        System.out.println("世界已创建");
    }

    private void initWorld() {

    }

    //[3]返回内部静态实例
    public static World getInstance() {
        return WorldHolder.sWorld;
    }

    //[2]创建内部类创建实例
    private static class WorldHolder {
        private static final World sWorld = new World();
    }

    //解决反序列化创建实例的问题，从io流读取对象的时候会调用这个方法，readResolve创建的对象会直接替换io流读取的对象
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }


}