package externalproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Note {

    String text;

    public Note(@Value("${text1}") String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
