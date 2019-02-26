package multipleselectionlist;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.*;
import javax.swing.*;

public class ListCLass extends JFrame {

       private JList leftlist;
       private JList rightlist;
       private static String[] foods ={"pizza","karahi","beafsteak","biryani","qorma","sashlik","naan","mocca"};
       
       private JButton button;
       public ListCLass()
       {
           setTitle("Food Menu");
           setLayout(new FlowLayout());
           
           leftlist = new JList(foods);
           leftlist.setVisibleRowCount(5);
           leftlist.setFixedCellHeight(25);
           leftlist.setFixedCellWidth(100);
           leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //enables to select multiple items from alist
           add(new JScrollPane(leftlist));   //adds a scrollbar to your list
           
           button = new JButton("move");
           button.addActionListener(
           new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                   rightlist.setListData(leftlist.getSelectedValues());  //cretae rightlist on data selected on eft hand side
               }
           });
           add(button);
           
           rightlist = new JList();
           //as it has nothing on it currently , it won't appear by default, so for it
           rightlist.setVisibleRowCount(5);
           rightlist.setFixedCellHeight(25);
           rightlist.setFixedCellWidth(100);
           
           rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
           add(new JScrollPane(rightlist));  //JList added to screen with scroll panes
       }
}








