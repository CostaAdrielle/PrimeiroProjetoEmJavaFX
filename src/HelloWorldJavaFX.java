import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorldJavaFX extends Application{
    public static void main(String[] args){
        launch();
    }
    @Override
    public void start(Stage palco){
        //Personagem
        Label texto = new Label("Olá mudo!");
        //Historia
        StackPane historia = new StackPane();
        historia.getChildren().add(texto);
        //Cena
        Scene cena = new Scene(historia, 300,300);
        //Colocando a cena no palco
        palco.setScene(cena);
        palco.show();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
