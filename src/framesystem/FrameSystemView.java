package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;
import lib.MM1_lib;
import lib.MMS_lib;

public class FrameSystemView extends Frame implements ActionListener,WindowListener {
    
    private TextField text1 = new TextField("", 10);
    private TextField text2 = new TextField("", 10);
    private TextField text3 = new TextField("", 10);
    private Button button1 = new Button("�����Z");
    //M/M/1�p
    private TextField m1 = new TextField("", 5);
    private TextField m2 = new TextField("", 5);
    private TextField m3 = new TextField("", 5);
    private Button bm = new Button("M/M/1");
    //M/M/S�p
    private TextField n1 = new TextField("", 5);
    private TextField n2 = new TextField("", 5);
    private TextField n3 = new TextField("", 5);
    private TextField n4 = new TextField("", 5);
    private TextField n5 = new TextField("", 5);
    private TextField n6 = new TextField("", 5);
    private TextField n7 = new TextField("", 5);
    private Button bn = new Button("M/M/S");
	
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
		addWindowListener(this);
		setTitle("FrameSystem");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		add(new Label("����"));
		add(text3);
		add(new Label("��"));
		add(m1);
		add(new Label("��"));
		add(m2);
		add(bm);
		add(new Label("���όn���l��"));
		add(m3);
		//
		add(new Label("��"));
		add(n1);
		add(new Label("��"));
		add(n2);
		add(new Label("������"));
		add(n3);
		add(bn);
		add(new Label("���ϑ҂��l��Lq"));
		add(n4);
		add(new Label("���όn���l��L"));
		add(n5);
		add(new Label("���ϑ҂�����Wq"));
		add(n6);
		add(new Label("���όn������W"));
		add(n7);
		button1.addActionListener(this);
		bm.addActionListener(this);
		bn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1){
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		Calculation_lib clib = new Calculation_lib(val1,val2);
		text3.setText(String.valueOf(clib.getPlus()));
		}
		else if(e.getSource() == bm){
			double lambda = Double.parseDouble(m1.getText());
			double mu = Double.parseDouble(m2.getText());
			MM1_lib mlib = new MM1_lib(lambda,mu);
			m3.setText(String.valueOf(mlib.getLength()));
		}
		else if(e.getSource() == bn){
			double lambda = Double.parseDouble(n1.getText());
			double mu = Double.parseDouble(n2.getText());
			int s = Integer.parseInt(n3.getText());
			MMS_lib mms = new MMS_lib(lambda,mu,s);
			n4.setText(String.valueOf(mms.getLq()));
			n5.setText(String.valueOf(mms.getL()));
			n6.setText(String.valueOf(mms.getWq()));
			n7.setText(String.valueOf(mms.getW()));
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

}
