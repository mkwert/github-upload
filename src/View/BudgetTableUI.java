package View;
/**
 * @author melissa
 */
import Controller.BudgetCntl;
import java.util.ArrayList;
import Model.Budget;
import Model.BudgetItem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class BudgetTableUI extends JFrame
{
    public JPanel tablePanel, mainPanel, buttonPanel;
    public JTable budgetTable;
    public JButton doneButton, newButton, detailsButton, deleteButton;
    public JScrollPane tableScroller;
    Border border, titledBorder;
    Font borderFont;
    BudgetCntl budgetCntl;
    
    public BudgetTableUI(BudgetCntl budgetcntl)
    {
        super();
        this.budgetCntl = budgetCntl;
        initComponents();
        setTitle("Budget List");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        getContentPane().add(tablePanel, BorderLayout.CENTER);
        
    }

    
    public void initComponents()
    {
        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1, 4));
        budgetTable = new JTable(budgetCntl.getBudgetTable());
        budgetTable.getColumnModel().getColumn(0).setPreferredWidth(25);
        budgetTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        doneButton = new JButton("Done");
        detailsButton = new JButton("Show Details");
        detailsButton.addActionListener(new DetailButtonListener());
        newButton = new JButton("New");
        newButton.addActionListener(new AddButtonListener());
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonListener());
        buttonPanel.add(newButton);
        buttonPanel.add(detailsButton);
        buttonPanel.add(doneButton);
        buttonPanel.add(deleteButton);
        budgetTable.setFillsViewportHeight(true);
        tableScroller = new JScrollPane(budgetTable);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(350, 300));
        tablePanel.add(tableScroller);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    class DetailButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            int selectedTableRow = budgetTable.getSelectedRow();
            int selectedModelRow = budgetTable.convertRowIndexToModel(selectedTableRow);
            BudgetTableUI.this.budgetCntl.getBudgetDetailUI(selectedModelRow);
        }
    }
    
    public class DeleteButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            budgetCntl.budget.remove(budgetTable.getSelectedRow());
            budgetCntl.budgetTable.fireTableDataChanged();
            System.out.println("row deleted");

        }
    }

    public class AddButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            BudgetUI budgetUI = new BudgetUI();
            budgetUI.setVisible(true);
            setVisible(false);

            budgetCntl.budgetTable.fireTableDataChanged();

        }
    }

}

