/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Skylo
 */
public class ModeloComboBox implements ComboBoxModel<String> {

    private ArrayList<String> modelo = new ArrayList<>();
    private String seleccionado;

    @Override
    public void setSelectedItem(Object anItem) {
        if (modelo.contains(anItem)) {
            seleccionado = (String) anItem;
        }
    }

    @Override
    public Object getSelectedItem() {
        return seleccionado;
    }

    @Override
    public int getSize() {
        return modelo.size();
    }

    @Override
    public String getElementAt(int index) {
        return modelo.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }

    public void setModelo(ArrayList<String> modelo) {
        this.modelo = modelo;
    }

    public ArrayList<String> getModelo() {
        return this.modelo;
    }

}
