package com.company;

import javax.swing.*;
import java.awt.*;

public class SortControl extends JPanel {
    private final SortingPanel sortingPanel = new SortingPanel();

    public SortControl() {

        setLayout(new BorderLayout());
        add(sortingPanel, BorderLayout.CENTER);
        JButton nextStepBtn = new JButton("NextStep");
        add(nextStepBtn, BorderLayout.SOUTH);

        nextStepBtn.addActionListener(arg0 -> sortingPanel.nextStepInSorting());
    }

}
