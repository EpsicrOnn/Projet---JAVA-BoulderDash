package view;

import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade</h1>
 *
 * @author Vincent VALLET
 * @about This class will provides a facade of the View component.
 */
public class ViewFacade implements IView {

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }
    
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
