import gas.OtherGas;

/**
 * 作者：张风捷特烈
 * 时间：2019/2/10/010:17:57
 * 邮箱：1981462002@qq.com
 * 说明：装配类
 */
public class Director {
    AirBuilder mAirBuilder;

    public Director(AirBuilder airBuilder) {
        mAirBuilder = airBuilder;
    }

    public Air construct() {
        mAirBuilder.buildCO2();
        mAirBuilder.buildN2();
        mAirBuilder.buildO2();
        mAirBuilder.buildOther(new OtherGas());
        return mAirBuilder.build();
    }
}
