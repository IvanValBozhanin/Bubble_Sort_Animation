package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SortControl extends JPanel {
    private final SortingPanel sortingPanel = new SortingPanel();

    private JButton nextStepBtn = new JButton("NextStep");

    public SortControl() {

        setLayout(new BorderLayout());
        add(sortingPanel, BorderLayout.CENTER);
        add(nextStepBtn, BorderLayout.SOUTH);

        nextStepBtn.addActionListener(arg0 -> sortingPanel.nextStepInSorting());

    }

}
