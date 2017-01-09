/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertowords;

/**
 *
 * @author hariom
 */
import numbertowords.EnglishNumberToWords;

public class Controller {

    public <E> String convert(E input) {
        if (input instanceof Integer) {
            return EnglishNumberToWords.convert(((Integer) input));
        } else if (input instanceof Double) {
            Double temp = Math.floor(((Double) input));
            return EnglishNumberToWords.convert(temp.intValue());
        } else if (input instanceof Float) {
            return EnglishNumberToWords.convert(Math.round(((Float) input)));
        } else {
            return "unsupported type";
        }
      
    }
    
}
