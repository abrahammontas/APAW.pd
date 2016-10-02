package es.upm.miw.pd.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class JButtonInvoker extends JButton implements ActionListener {
    private static final long serialVersionUID = 1L;

    private Order orden;

    public JButtonInvoker(Order orden) {
        super(orden.name());
        this.orden = orden;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.orden.execute();
    }

}
