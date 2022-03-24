package _区间合并;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _合并区间 {
    public static void merge(List<int[]> list){
        Collections.sort(list, Comparator.comparingInt(o -> o[0]));
        List<int[]> res = new ArrayList<>();
        int st = list.get(0)[0], ed = list.get(0)[1];
        for (int i=1;i<list.size();i++){
            if (ed<list.get(i)[0]){
                res.add(new int[]{st,ed});
                st = list.get(i)[0];
                ed = list.get(i)[1];
            }else {
                ed = Math.max(ed,list.get(i)[1]);
            }
        }
        res.add(new int[]{st,ed});
        System.out.println(res.size());
    }
}
