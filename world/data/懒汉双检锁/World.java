/**
 * 作者：张风捷特烈
 * 时间：2019/2/10/010:8:21
 * 邮箱：1981462002@qq.com
 * 说明：有你相伴--懒汉双检锁
 * >然我们不是同类，但感谢有你相伴
 */
public class World {
    private static volatile World sWorld;
    //[1]私有化构造
    private World() {
        initWorld();//初始化世界
        System.out.println("世界已创建");
    }

    private void initWorld() {

    }
    //[2]返回内部静态实例
    public static World getInstance() {
        if (sWorld == null) {//判断非空后--执行
            synchronized (World.class) {//加锁,保证多线程下的单例
                if (sWorld == null) {//非空，创建实例
                    sWorld = new World();
                }
            }
        }
        return sWorld;
    }
}
