package app;

import javax.swing.JDialog;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import thread.ThreadTask;

public class HumidityLineChart extends JDialog {

	public HumidityLineChart(String applicationTitle, String chartTitle) {
		//super(applicationTitle);
		JFreeChart lineChart = ChartFactory.createLineChart(chartTitle, "times", "humidity", createDataset(),
				PlotOrientation.VERTICAL, true, true, false);
		
		ChartPanel chartPanel = new ChartPanel(lineChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(1000, 367));
		setContentPane(chartPanel);
	}

	private DefaultCategoryDataset createDataset() {
		String humidity = "humidity";

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for(int i=0;i<ThreadTask.list.size();i++) {
			dataset.addValue(ThreadTask.list.get(i).getHumidity(), humidity, ThreadTask.list.get(i).getRegtime().substring(11));
		}

		return dataset;
	}


}
