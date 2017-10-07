package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Editor {

    private String val;

    public void render(String val){

        this.val = val;
    }

    public List parse(){

        String[] words = this.val.split("\\s");

        List<List> output = new ArrayList<>();

        for(String w:words) {
            if(Utils.isNumeric(w)) output.add(Arrays.asList(1, w));
            else output.add(Arrays.asList(0, w));
        }

        return output;
    }
}
