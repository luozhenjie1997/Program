package org.fjzzy.ex01;

import java.awt.*;

public class TsetGUILayout {

	public static void main(String[] args) {
		new Layout("123");
	}
	
}

@SuppressWarnings("serial")
class Layout extends Frame {

	public Layout(String title){
		GridBagLayout layout=new GridBagLayout();
		GridBagConstraints c=new GridBagConstraints();
		this.setLayout(layout);
		c.fill=GridBagConstraints.BOTH;
		c.weightx=1;
		c.weighty=1;
		this.addComponent("btn1", layout, c);
		this.addComponent("btn2", layout, c);
		this.addComponent("btn3", layout, c);
		c.gridwidth=GridBagConstraints.REMAINDER;
		this.addComponent("btn4", layout, c);
		c.weightx=0;
		c.weighty=0;
		addComponent("btn5", layout, c);
		c.gridwidth=1;
		this.addComponent("btn6", layout, c);
		c.gridwidth=GridBagConstraints.REMAINDER;
		this.addComponent("btn7", layout, c);
		c.gridheight=2;
		c.gridwidth=1;
		c.weightx=2;
		c.weighty=2;
		this.addComponent("btn8", layout, c);
		c.gridwidth=GridBagConstraints.REMAINDER;
		c.gridheight=1;
		this.addComponent("btn9", layout, c);
		this.addComponent("btn10", layout, c);
		this.pack();
		this.setSize(300, 400);
		this.setLocation(200, 300);
		this.setVisible(true);
		this.addWindowListener(new MyWindowListenerClose());
	}
	
	public void addComponent(String name,GridBagLayout layout,GridBagConstraints c) {
		Button btn=new Button(name);
		layout.setConstraints(btn, c);
		this.add(btn);
	}
}