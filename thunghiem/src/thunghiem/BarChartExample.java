/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thunghiem;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class BarChartExample extends JFrame {

    public BarChartExample(String title) {
        super(title);

        // Tạo một DefaultCategoryDataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Thêm dữ liệu vào dataset
        dataset.addValue(1000, "Sales", "January");
        dataset.addValue(1500, "Sales", "February");
        dataset.addValue(2000, "Sales", "March");
        dataset.addValue(2500, "Sa", "April");
        dataset.addValue(3000, "Sa", "May");
        dataset.addValue(3500, "Sales", "June");

        // Tạo biểu đồ cột
        JFreeChart barChart = ChartFactory.createBarChart(
                "Monthly Sales",
                "Month",
                "Revenue ($)",
                dataset
        );

        // Hiển thị biểu đồ trên Panel
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            BarChartExample example = new BarChartExample("Bar Chart Example");
            example.setSize(800, 600);
            example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            example.setLocationRelativeTo(null);
            example.setVisible(true);
        });
    }
}




