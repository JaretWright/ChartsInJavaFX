import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class ChartsController implements Initializable {

    @FXML
    private BarChart<?, ?> barChart;

    @FXML
    private CategoryAxis monthAxis;

    @FXML
    private NumberAxis maxTempAxis;

    private XYChart.Series maxTemperatureSeries, minTemperatureSeries;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        maxTemperatureSeries = new XYChart.Series();
        maxTemperatureSeries.setName("Max Temperatures");
        minTemperatureSeries = new XYChart.Series();
        minTemperatureSeries.setName("Min Temperatures");

        maxTemperatureSeries.getData().add(new XYChart.Data("January",0));
        maxTemperatureSeries.getData().add(new XYChart.Data("February",5));
        maxTemperatureSeries.getData().add(new XYChart.Data("March",7));
        maxTemperatureSeries.getData().add(new XYChart.Data("April", 10));

        minTemperatureSeries.getData().add(new XYChart.Data("January",-20));
        minTemperatureSeries.getData().add(new XYChart.Data("February",-15));
        minTemperatureSeries.getData().add(new XYChart.Data("March",-10));
        minTemperatureSeries.getData().add(new XYChart.Data("April",-2));
        monthAxis.setLabel("Months");
        maxTempAxis.setLabel("Temperature (C)");
        barChart.getData().addAll(maxTemperatureSeries);
        barChart.getData().addAll(minTemperatureSeries);
    }
}
