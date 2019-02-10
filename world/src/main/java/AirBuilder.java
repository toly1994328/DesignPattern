import gas.OtherGas;

/**
 * 作者：张风捷特烈
 * 时间：2019/2/10/010:18:25
 * 邮箱：1981462002@qq.com
 * 说明：创造者的抽象类
 */
public abstract class AirBuilder {

    protected Air air = new Air();

    public abstract void buildO2();

    public abstract void buildCO2();

    public abstract void buildN2();

    public abstract void buildOther(OtherGas otherGas);

    public Air build() {
        return air;
    }
}
