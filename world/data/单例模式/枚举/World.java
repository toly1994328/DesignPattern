/**
 * 作者：张风捷特烈
 * 时间：2019/2/10/010:8:21
 * 邮箱：1981462002@qq.com
 * 说明：至简--枚举
 * 王的孤独你们无法体会
 */
public enum World {
    INSTANCE;
    World() {
        initWorld();//初始化世界
        System.out.println("世界已创建");
    }

    private void initWorld() {

    }
}