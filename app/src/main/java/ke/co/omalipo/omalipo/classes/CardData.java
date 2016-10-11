package ke.co.omalipo.omalipo.classes;

/**
 * Created by peter on 11/10/2016.
 */

public class CardData {
    public  String[] points;
    public  String[] prices;
    public  String[] offPrice;

    public CardData (){}

    public String[] get (int index){
        return new String[] {points[index], prices[index], offPrice[index]};
    }

    public int length (){
        return points.length;
    }
}
