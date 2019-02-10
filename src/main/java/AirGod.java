import gas.OtherGas;

/**
 * 作者：张风捷特烈
 * 时间：2019/2/10/010:16:39
 * 邮箱：1981462002@qq.com
 * 说明：
 */
public class AirGod {
    public static void main(String[] args) {
//        Air air = new Air.Builder()
//                .o2()
//                .co2()
//                .n2()
//                .other(new OtherGas())
//                .build();
//        String show = air.show();
//        System.out.println(show);
        Air air = new Director(new CommonAirBuilder()).construct();
//        Air air = new Director(new DiveAirBuilder()).construct();
        System.out.println(air.show());
    }
}
