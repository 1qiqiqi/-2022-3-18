import java.util.ArrayList;
import java.util.Collections;

public class _Arrays {
    public static void main(String[] args) {
        //元素的索引是从0开始的
        //添加元素
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        //更新
        sites.set(1,"manita");
        //获取
        System.out.println(sites.get(1));
        //获取
        String s = sites.get(2);
        System.out.println(s);
        //删除元素
        sites.remove(1);
        System.out.println(sites.size());
        //for-each迭代数组
        for (String a:sites){
            System.out.print(a+" ");
        }
        //for循环数组
        for (int i=0;i<sites.size();i++){
            System.out.print(sites.get(i)+" ");
        }
        //排序
        System.out.println("排序前");
        System.out.println(sites);
        Collections.sort(sites);
        System.out.println("排序后");
        System.out.println(sites);
    }
}
