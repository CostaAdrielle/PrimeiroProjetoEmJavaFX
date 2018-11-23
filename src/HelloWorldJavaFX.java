import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloWorldJavaFX extends Application{
    public static void main(String[] args){
        launch();
    }
    String musica = getClass().getResource("PillowTalk.mp3").toString();
    
    @Override
    public void start(Stage palco){
        //Trilha Sonora
        AudioClip clip = new AudioClip(musica);
        clip.play();
        //Personagem
        Rectangle ceu = new Rectangle(900, 450, Color.ORANGERED);
        Rectangle mar = new Rectangle(900, 450, Color.DARKBLUE);
        Circle sol = new Circle(90, Color.YELLOW);
        //Posicionamento
        ceu.setTranslateY(-200);
        mar.setTranslateY(200);
        sol.setTranslateY(0);      
        //Historia
        StackPane historia = new StackPane();
        historia.getChildren().addAll(ceu, sol, mar);
        //Cena
        Scene cena = new Scene(historia, 900,900);
        //Colocando a cena no palco
        palco.setScene(cena);
        palco.show();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
