/**
 * 作者：张风捷特烈
 * 时间：2019/2/10/010:8:21
 * 邮箱：1981462002@qq.com
 * 说明：终极孤独
 * 即便无人问津，我也永远存在
 */
public class World {
    private static World sWorld = new World();
    //[1]私有化构造
    private World() {
        initWorld();//初始化世界
        System.out.println("世界已创建");
    }
    private void initWorld() {

    }
    //[2]返回内部静态实例
    public static World getInstance() {
        return sWorld;
    }
}
