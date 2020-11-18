package Observer;

public abstract class Observer {
    Data data;

    public abstract void update();
}

class PieChart extends Observer {
    public PieChart(Data data) {
        this.data = data;
        this.data.attach(this);
    }

    @Override
    public void update() {
        System.out.println("pie chart updated");
    }
}
class LineGraph extends Observer {
    public LineGraph(Data data) {
        this.data = data;
        this.data.attach(this);
    }

    @Override
    public void update() {
        System.out.println("line graph updated");
    }
}
