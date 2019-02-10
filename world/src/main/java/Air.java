import gas.CO2;
import gas.N2;
import gas.O2;
import gas.OtherGas;

/**
 * 作者：张风捷特烈
 * 时间：2019/2/10/010:16:04
 * 邮箱：1981462002@qq.com
 * 说明：空气
 */
public class Air {
   private O2 o2;
   private N2 n2;
   private CO2 co2;
   private OtherGas mOtherGas;

    public O2 getO2() {
        return o2;
    }

    public void setO2(O2 o2) {
        this.o2 = o2;
    }

    public N2 getN2() {
        return n2;
    }

    public void setN2(N2 n2) {
        this.n2 = n2;
    }

    public CO2 getCo2() {
        return co2;
    }

    public void setCo2(CO2 co2) {
        this.co2 = co2;
    }

    public OtherGas getOtherGas() {
        return mOtherGas;
    }

    public void setOtherGas(OtherGas otherGas) {
        mOtherGas = otherGas;
    }

    public String show() {
        return "空气成分：\n" +
                o2.nameCN + ":" + o2.part + "%\n" +
                co2.nameCN + ":" + co2.part + "%\n" +
                n2.nameCN + ":" + n2.part + "%\n" +
                mOtherGas.nameCN + ":" + mOtherGas.part + "%\n";
    }

}
