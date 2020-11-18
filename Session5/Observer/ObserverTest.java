package Observer;


public class ObserverTest {
    public static void main(String[] args) {
        Data data=new Data();
        LineGraph lineGraph=new LineGraph(data);
        PieChart pieChart=new PieChart(data);
        for (int i = 0; i <20 ; i++) {
            data.setNumber(i);
            System.out.println("data is "+i);
            System.out.println("//////////////////////////////");
        }
    }
}
