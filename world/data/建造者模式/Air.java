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

    public Air(Builder builder) {
        this.o2 = builder.o2;
        this.co2 = builder.co2;
        this.n2 = builder.n2;
        this.mOtherGas = builder.mOtherGas;
    }

    public String show() {
        return "空气成分：\n" +
                o2.nameCN + ":" + o2.part + "%\n" +
                co2.nameCN + ":" + co2.part + "%\n" +
                n2.nameCN + ":" + n2.part + "%\n" +
                mOtherGas.nameCN + ":" + mOtherGas.part + "%\n";
    }

    public static final class Builder {
        private O2 o2;
        private N2 n2;
        private CO2 co2;
        private OtherGas mOtherGas;

        public Builder o2() {
            O2 o2 = new O2();
            o2.nameCN = "氧气";
            o2.part = 21;
            this.o2 = o2;
            return this;
        }

        public Builder n2() {
            N2 n2 = new N2();
            n2.nameCN = "氮气";
            n2.part = 78;
            this.n2 = n2;
            return this;
        }

        public Builder co2() {
            CO2 co2 = new CO2();
            co2.nameCN = "二氧化碳";
            co2.part = 0.031;
            this.co2 = co2;
            return this;
        }

        public Builder other(OtherGas otherGas) {
            otherGas.part = 100 - o2.part - n2.part - co2.part;
            otherGas.nameCN ="其他气体";
            this.mOtherGas = otherGas;
            return this;
        }

        public Air build() {
            return new Air(this);
        }
    }
}
