package kadai_java;

public class Review01 {

public static void main(String[] args) {
    int zei_nuki = 100 ;
    int zei = 10 ;
    int zei_gaku = tax(zei_nuki , zei);
    int zei_komi = zei_nuki + zei_gaku ;
    System.out.println(zei_nuki + "円の商品の税込価格は" + zei_komi + "円" + "(消費税は" + zei_gaku + "円)です。" );

    }
public static int tax(int zei_nuki , int zei) {
    int zei_gaku = (zei_nuki * zei ) / 100 ;
    return zei_gaku ;

    }
}
