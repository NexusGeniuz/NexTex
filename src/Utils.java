import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Vector;

/**
 * Created by nadir on 13.04.2017.
 */
public class Utils {
    static boolean isEmpty(String string) {
        if (string.isEmpty())
            return true;
        else {
            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i) != ' ')
                    return false;
            }
            return true;
        }
    }

    static boolean containsChars(String container, String[] chars){
        for(String c : chars){
            if(container.contains(c))
                return true;
        }
        return false;
    }

    static boolean containsOnly(String[] container, String only) {
        if(container.length > 1)
            return false;
        else if(container[0].equalsIgnoreCase(only))
            return true;
        return false;
    }

    static boolean contains(String[] container, String only){
        for (int i = 0; i < container.length; i++) {
            if(container[i].equalsIgnoreCase(only))
                return true;
        }
        return false;
    }

    static String getRandomRGBColorString(){
        Random random = new Random();
        Color color = new Color(random.nextInt(205) + 50,random.nextInt(205) + 50,random.nextInt(205) + 50);
        color.brighter();
        return "rgb(" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + ")";
    }
}

class NoSelectionModel extends DefaultListSelectionModel {

    @Override
    public void setAnchorSelectionIndex(final int anchorIndex) {}

    @Override
    public void setLeadAnchorNotificationEnabled(final boolean flag) {}

    @Override
    public void setLeadSelectionIndex(final int leadIndex) {}

    @Override
    public void setSelectionInterval(final int index0, final int index1) { }
}
