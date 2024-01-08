package New_RPG.Tools;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Audio {

    private static Clip clip;
    private static Clip audioEmExecucao;
    private static String audioAtual;


        public static void playAudio(String filePath) {
        try {

            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            audioEmExecucao = AudioSystem.getClip();
            audioEmExecucao.open(audioStream);
            audioEmExecucao.start();
        } catch (Exception e) {
            System.out.println("Erro ao reproduzir o áudio: " + e.getMessage());
        }
    }

    public static void stopAudio(String filePath) {

        if (audioEmExecucao != null && audioEmExecucao.isRunning()) {
                audioEmExecucao.stop();
                audioEmExecucao.close();

        }
    }





}
