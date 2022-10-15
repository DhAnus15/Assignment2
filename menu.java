package Assignment2;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;  
import javafx.stage.Stage;  

public class menu extends Application {  
    public static void main(String[] args) {  
    launch(args);  
        }  
    
    public void start(Stage primaryStage) throws Exception {  
        
        BorderPane root = new BorderPane();  
        Scene scene = new Scene(root,300,300);  
        MenuBar menubar = new MenuBar();  
        
        Menu FileMenu = new Menu("_File"); 
        
        MenuItem fnew = new MenuItem("New");  
        MenuItem fopen = new MenuItem("Open");  
        MenuItem fsave = new MenuItem("Save");
        
        FileMenu.setMnemonicParsing(true);
        
        Menu EditMenu = new Menu("_Edit"); 
        
        MenuItem ecut = new MenuItem("Cut");  
        MenuItem ecopy = new MenuItem("Copy");  
        MenuItem epaste = new MenuItem("Paste");  
        
        EditMenu.setMnemonicParsing(true);
        
        Menu HelpMenu = new Menu("_Help");
        MenuItem helpmenu1 = new MenuItem("Help Centre");  
        MenuItem helpmenu2 = new MenuItem("About Us");  
       
        HelpMenu.setMnemonicParsing(true);
        
        fnew.setAccelerator(KeyCombination.keyCombination("shortcut+n"));
		fopen.setAccelerator(KeyCombination.keyCombination("shortcut+o"));
		fsave.setAccelerator(KeyCombination.keyCombination("shortcut+s"));
		ecut.setAccelerator(KeyCombination.keyCombination("shortcut+x"));
		ecopy.setAccelerator(KeyCombination.keyCombination("shortcut+c"));
		epaste.setAccelerator(KeyCombination.keyCombination("shortcut+v"));
        
        
        root.setTop(menubar);  
        
        EditMenu.getItems().addAll(ecut,ecopy,epaste);  
        
        FileMenu.getItems().addAll(fnew,fopen,fsave); 
        
        HelpMenu.getItems().addAll(helpmenu1, helpmenu2 );
        
        menubar.getMenus().addAll(FileMenu,EditMenu,HelpMenu);  
        
       
        primaryStage.setScene(scene);  
        primaryStage.show();  
          
    }     
}  