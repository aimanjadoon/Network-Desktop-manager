/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class Port_scanning extends Frame implements ActionListener, Runnable
{
	Label status, version;
	GridBagConstraints gbc;
	TextField hostName, startPort, endPort;
	TextArea log;
	Button start, clear;
	Thread t;
	boolean running = false;

	public static void main(String [] args)
	{
		new Port_scanning();
	}

	public Port_scanning()
	{
		super("Port Scanner 1.0");
		setBackground(new Color(192, 192, 192));
		setLocation(400, 200);
                setPreferredSize(new Dimension(600, 500));
                
                setVisible(true);
		
		gbc = new GridBagConstraints();
		setLayout(new GridBagLayout());

		status = new Label("Port scanner - ready");
		version = new Label("Port scanner version 1.0", Label.CENTER);
		version.setForeground(new Color(45, 5, 228));
		hostName = new TextField("", 9);
		startPort = new TextField("", 9);
		endPort = new TextField("", 9);
		log = new TextArea(5, 30);
		log.setEditable(false);
		start = new Button("Start scan");
		start.addActionListener(this);
		clear = new Button("Clear log");
		clear.addActionListener(this);

		gbc.fill = GridBagConstraints.BOTH;

		add(new Label("Host name/ IP address:", Label.RIGHT), 0, 1);
		add(hostName, 1, 1);
		add(new Label("Start port number:", Label.RIGHT), 0, 2);
		add(startPort, 1, 2);
		add(new Label("End port number:", Label.RIGHT), 0, 3);
		add(endPort, 1, 3);

		add(start, 0, 5);
		add(clear, 1, 5);

		gbc.gridwidth  = 2;
		add(status, 0, 6);
		add(log, 0, 4);
		add(version, 0, 0);
		gbc.gridwidth  = 1;

		pack();
		addWindowListener(new MyWindowAdapter());

		setVisible(true);
		setResizable(false);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == clear)
			log.setText("");
		if(e.getSource() == start)
		{
			t = new Thread(this);
			if(!running)
			{
				t.start();
			}
			else
			{
				running = false;
				start.setLabel("Start scan");
				status.setText("Scan interrupted");
			}
		}
	}
	void add(Component c, int x, int y)
	{
		gbc.gridx = x;
		gbc.gridy = y;
		super.add(c, gbc);
	}
	void startScan()
	{
		Socket s;
		int i, start, end;
		String host;
		if(hostName.getText().trim().length() == 0)
		{
			status.setText("Host name field is empty");
			return;
		}
		if(startPort.getText().trim().length() == 0)
		{
			status.setText("Starting port number field is empty");
			return;
		}
		if(endPort.getText().trim().length() == 0)
		{
			status.setText("Ending port number field is empty");
			return;
		}
		try
		{
			host = new String(hostName.getText().trim());
			start = Integer.parseInt(startPort.getText().trim());
			end = Integer.parseInt(endPort.getText().trim());
			log.setText("");
			this.start.setLabel("Stop scan");
			for(i = start; i <= end; i++)
			{
				if(!running)
					return;
				status.setText("Scanning port " + i);
				try
				{
					s = new Socket(host, i);
					log.append("Port " + i + " is active.\n");
				}
				catch(IOException e)
				{
					continue;
				}
			}
			status.setText("Scan complete");
		}
		catch(NumberFormatException e)
		{
			status.setText("Invalid port number");
			return;
		}
	}
	public void run()
	{
		running = true;
		startScan();
		running = false;
		start.setLabel("Start scan");
	}
}

class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
