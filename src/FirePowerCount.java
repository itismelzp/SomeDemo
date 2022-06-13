
public class FirePowerCount {

    public static void main(String[] args) {

        int zero = 0;

        int one1 = 1;
        int one2 = 99;
        int two1 = 100;
        int two2 = 499;
        int three1 = 500;
        int three2 = 999;
        int four1 = 1000;
        int four2 = 4999;
        int five1 = 5000;
        int five2 = 9999;
        int six1 = 10000;
        int six2 = 49999;
        int seven1 = 50000;
        int seven2 = 990000;

        int[] levels = new int[]{
                zero,
                one1, one2,
                two1, two2,
                three1, three2,
                four1, four2,
                five1, five2,
                six1, six2,
                seven1, seven2
        };

        for (int level : levels) {
            System.out.println(getFirePowerStr(level).toString());
        }

    }

    private static FirePowerLevel getFirePowerStr(int firePower) {
        if (firePower <= 0) {
            return new FirePowerLevel(FirePowerLevel.FIRE_POWER_LEVEL_NONE, "");
        } else if (firePower < 100) {
            return new FirePowerLevel(FirePowerLevel.FIRE_POWER_LEVEL_ONE, String.valueOf(firePower));
        } else if (firePower < 500) {
            return new FirePowerLevel(FirePowerLevel.FIRE_POWER_LEVEL_TWO, String.valueOf(firePower));
        } else if (firePower < 1000) {
            return new FirePowerLevel(FirePowerLevel.FIRE_POWER_LEVEL_THREE, String.valueOf(firePower));
        } else if (firePower < 5000) {
            return new FirePowerLevel(FirePowerLevel.FIRE_POWER_LEVEL_FOUR, String.valueOf(firePower));
        } else if (firePower < 10000) {
            return new FirePowerLevel(FirePowerLevel.FIRE_POWER_LEVEL_FIVE, String.valueOf(firePower));
        } else if (firePower < 50000) {
            return new FirePowerLevel(FirePowerLevel.FIRE_POWER_LEVEL_SIX, firePower / 10000 + "." + (firePower % 10000) / 1000 + "w");
        } else {
            return new FirePowerLevel(FirePowerLevel.FIRE_POWER_LEVEL_SEVEN, firePower / 10000 + "w+");
        }
    }

    static class FirePowerLevel {
        int level;
        String firePower;

        public static final int FIRE_POWER_LEVEL_NONE = 0;
        public static final int FIRE_POWER_LEVEL_ONE = 1;
        public static final int FIRE_POWER_LEVEL_TWO = 2;
        public static final int FIRE_POWER_LEVEL_THREE = 3;
        public static final int FIRE_POWER_LEVEL_FOUR = 4;
        public static final int FIRE_POWER_LEVEL_FIVE = 5;
        public static final int FIRE_POWER_LEVEL_SIX = 6;
        public static final int FIRE_POWER_LEVEL_SEVEN = 7;

        public FirePowerLevel(int level, String firePower) {
            this.level = level;
            this.firePower = firePower;
        }

        @Override
        public String toString() {
            return "level: " + level + "," + "firePower: " + firePower;
        }
    }
}
