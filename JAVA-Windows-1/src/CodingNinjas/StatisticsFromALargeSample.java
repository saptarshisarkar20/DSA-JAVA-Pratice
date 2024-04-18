package CodingNinjas;

import java.util.ArrayList;

public class StatisticsFromALargeSample {
    public static ArrayList<Double> sampleStats(ArrayList<Integer> nums) {

        int maxCnt = 0;
        int modeCnt = 0;
        int cnt = 0;

        Double minEle = Double.MAX_VALUE;
        Double maxEle = Double.MIN_VALUE;
        Double meanEle = 0d;
        Double medianEle = 0d;
        Double modeEle = 0d;

        ArrayList<Integer> count = new ArrayList<>();
        for (int ti = 0; ti < nums.size(); ti++) {
            if (nums.get(ti) > 0) {
                for (int i = 0; i < nums.get(ti); i++) {
                    count.add(ti);
                }
                if (maxCnt < nums.get(ti)) {
                    maxCnt = nums.get(ti);
                    modeCnt = ti;
                }
                minEle = Math.min(minEle, Double.valueOf(ti));
                maxEle = Math.max(maxEle, Double.valueOf(ti));
                meanEle = meanEle + (ti * nums.get(ti));
                cnt += nums.get(ti);

            }
        }

        meanEle = (meanEle / cnt);
        int sz = count.size();
        if (sz % 2 == 0) {
            int temp1 = sz / 2;
            int temp2 = (sz / 2) - 1;
            medianEle = (count.get(temp1) + count.get(temp2)) / 2d;
        } else {
            int temp1 = sz / 2;
            medianEle = Double.valueOf(count.get(temp1));
        }
        modeEle = Double.valueOf(modeCnt);

        ArrayList<Double> res = new ArrayList<>();
        res.add(minEle);
        res.add(maxEle);
        res.add(meanEle);
        res.add(medianEle);
        res.add(modeEle);
        return res;
    }


}