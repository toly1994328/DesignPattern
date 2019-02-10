import gas.CO2;
import gas.N2;
import gas.O2;
import gas.OtherGas;

/**
 * 作者：张风捷特烈
 * 时间：2019/2/10/010:18:28
 * 邮箱：1981462002@qq.com
 * 说明：普通空气建造者
 */
public class CommonAirBuilder extends AirBuilder {
    @Override
    public void buildO2() {
        O2 o2 = new O2();
        o2.nameCN = "氧气";
        o2.part = 21;
        air.setO2(o2);

    }

    @Override
    public void buildCO2() {
        CO2 co2 = new CO2();
        co2.nameCN = "二氧化碳";
        co2.part = 0.031;
        air.setCo2(co2);
    }

    @Override
    public void buildN2() {
        N2 n2 = new N2();
        n2.nameCN = "氮气";
        n2.part = 78;
        air.setN2(n2);
    }

    @Override
    public void buildOther(OtherGas otherGas) {
        otherGas.part = 100 - air.getO2().part - air.getN2().part - air.getCo2().part;
        otherGas.nameCN ="其他气体";
        air.setOtherGas(otherGas);
    }
}
