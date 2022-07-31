package controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.CustomerTM;

import java.util.Optional;

public class TableFormController {
    public TableView<CustomerTM> tblCustomers;
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public Button btnSaveCustomer;
    public Button btnNewCustomer;
    public Button btnDeleteCustomer;

    public void initialize(){

        btnDeleteCustomer.setDisable(true);

//        tblCustomers.setDisable(true);
//        btnDeleteCustomer.setDisable(true);

        tblCustomers.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<CustomerTM>() {
            @Override
            public void changed(ObservableValue<? extends CustomerTM> observableValue,
                                CustomerTM previous,
                                CustomerTM current) {

                if (current == null) {
                    btnDeleteCustomer.setDisable(true);
                    btnSaveCustomer.setText("Save Customer");
                    txtId.clear();
                    txtName.clear();
                    txtAddress.clear();
                    txtId.setEditable(true);
                    return; // id eka null unama ena exception eka nisa
                }



                txtId.setText(current.getId());
//                txtId.setDisable(true);
                txtId.setEditable(false);
                txtName.setText(current.getName());
                txtAddress.setText(current.getAddress());
                btnDeleteCustomer.setDisable(false);
                btnSaveCustomer.setText("Update Customer");

            }
        });

        /* Let's map column names */
        tblCustomers.getColumns().get(0).
                setCellValueFactory(new PropertyValueFactory<>("id"));
        tblCustomers.getColumns().get(1).
                setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCustomers.getColumns().get(2).
                setCellValueFactory(new PropertyValueFactory<>("address"));


        ObservableList<CustomerTM> olCustomers = tblCustomers.getItems();
//        olRows.add(10);
//        olRows.add(20);
//        olRows.add(30);
//        olRows.add("Hiran");
//        olRows.add("IJSE");

        olCustomers.add(new CustomerTM("C001", "Kasun", "Panadura"));
        olCustomers.add(new CustomerTM("C002", "Prabath", "Colombo"));
        olCustomers.add(new CustomerTM("C003", "Dasun", "Kaluthara"));


        btnSaveCustomer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

//               ObservableList<CustomerTM> olCustomers = tblCustomers.getItems(); // udin tiyena eka use karnnath puluwan (Line 30)


                String id = txtId.getText();
                String name = txtName.getText();
                String address = txtAddress.getText();

                if(id.isBlank()){
                    new Alert(Alert.AlertType.ERROR,"Customer ID cannot be empty").showAndWait();
                    txtId.requestFocus();
                    return;
                } else if (name.isBlank()) {
                    new Alert(Alert.AlertType.ERROR,"Customer Name cannot be empty").showAndWait();
                    txtName.requestFocus();
                    return;
                } else if (address.isBlank()) {
                    new Alert(Alert.AlertType.ERROR,"Customer Address cannot be empty").showAndWait();
                    txtAddress.requestFocus();
                    return;
                }

                for (CustomerTM customer : olCustomers) {
                    if(customer.getId().equals(txtId.getText())){
                        new Alert(Alert.AlertType.ERROR, "Duplicate customer IDs are not allowed").showAndWait();
                        txtId.requestFocus();
                        return;
                    }
                }


//                CustomerTM newCustomer = new CustomerTM(id, name, address); //  CustomerTM -> Reference variable
//                olCustomers.add(newCustomer);
                // OR
//                olCustomers.add(new CustomerTM(id, name, address));
                // OR
                olCustomers.add(new CustomerTM(
                        txtId.getText(),
                        txtName.getText(),
                        txtAddress.getText()));

                txtId.clear();
                txtName.clear();
                txtAddress.clear();
                txtId.requestFocus();
            }
        });

        btnNewCustomer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tblCustomers.getSelectionModel().clearSelection();
//                txtId.clear();
//                txtName.clear();
//                txtAddress.clear();
                txtId.requestFocus();
            }
        });

        btnDeleteCustomer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                ObservableList<CustomerTM> olCustomers = tblCustomers.getItems();

                CustomerTM selectedCustomer = tblCustomers.getSelectionModel().getSelectedItem();

                Optional<ButtonType> selectedOption =
                        new Alert(Alert.AlertType.CONFIRMATION, "Are you sure to delete this customer?"
                        ,ButtonType.YES, ButtonType.NO).showAndWait();

                if(selectedOption.get() == ButtonType.YES){
                    olCustomers.remove(selectedCustomer);
                    tblCustomers.getSelectionModel().clearSelection();
                }



//                CustomerTM selectedCustomer = tblCustomers.getSelectionModel().getSelectedItem();
//                int selectedIndex = tblCustomers.getSelectionModel().getSelectedIndex();
//                System.out.println(selectedCustomer);
//                System.out.println(selectedIndex);

                //tblCustomers.getSelectionModel().select(2);

                //tblCustomers.getSelectionModel().clearSelection(); // Selection eka ain karanna puluwan

            }
        });

    }

}
