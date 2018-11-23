import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

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
        Rectangle ceu = new Rectangle(800, 450, Color.ORANGERED);
        Rectangle mar = new Rectangle(800, 450, Color.DARKBLUE);
        Rectangle ceu2 = new Rectangle(800, 450, Color.YELLOW);
        Rectangle mar2 = new Rectangle(800, 450, Color.LIGHTBLUE);
        Circle sol = new Circle(90, Color.YELLOW);
        //Posicionamento
        ceu2.setTranslateY(-225);
        mar2.setTranslateY(225);
        ceu.setTranslateY(-225);
        mar.setTranslateY(225);
        sol.setTranslateY(0);      
        //Movimento
        TranslateTransition trtr = new TranslateTransition(Duration.millis(20000), sol);
            trtr.setByY(-330);
            trtr.setCycleCount(Timeline.INDEFINITE);
            trtr.setAutoReverse(true);
            trtr.play();
        //Fade
        FadeTransition ft = new FadeTransition(Duration.millis(20000), ceu);
            ft.setFromValue(1.0);
            ft.setToValue(0.5);
            ft.setCycleCount(Timeline.INDEFINITE);
            ft.setAutoReverse(true);
            ft.play();
        FadeTransition mt = new FadeTransition(Duration.millis(40000), mar);
            mt.setFromValue(2.0);
            mt.setToValue(0.5);
            mt.setCycleCount(Timeline.INDEFINITE);
            mt.setAutoReverse(true);
            mt.play();
        //Gradiente
        mar2.setStyle("-fx-fill: "
            + "linear-gradient(#7FFFD4, #00CED1),"
            + "linear-gradient(#008B8B, #2F4F4F),"
            + "linear-gradient(#00CED1 0%, #20B2AA 50%, #0000CD 100%),"
            + "linear-gradient(from 0% 0% to 55% 50%, "
            + "rgba(255,255,255,0.9), rgba(255,255,255,0));");

        //Historia
        StackPane historia = new StackPane();
        historia.getChildren().addAll( ceu2, mar2);
        historia.getChildren().addAll( ceu, sol, mar);
        //Cena
        Scene cena = new Scene(historia, 900,900);
        //Colocando a cena no palco
        palco.setScene(cena);
        palco.show();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
