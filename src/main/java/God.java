import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.Calendar;

/**
 * 作者：张风捷特烈
 * 时间：2019/2/10/010:8:31
 * 邮箱：1981462002@qq.com
 * 说明：
 */
public class God {
    public static void main(String[] args) {
        World world1 = World.getInstance();
        World world2 = World.getInstance();


        //通过反射创建
        Class<World> worldClass = World.class;
        try {
            Constructor<World> constructor = worldClass.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            World world3 = constructor.newInstance();
            System.out.println(world3 == world2);//false
            System.out.println(world1 == world2);//true
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("world.obj"));
            oos.writeObject(world1);
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("world.obj"));
            World world4 = (World) ois.readObject();
            ois.close();
            System.out.println(world1 == world4);//true
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
