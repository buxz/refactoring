package reorganizeFunction_5;


import java.util.Arrays;
import java.util.List;

/**
 * Created by SQ_BXZ on 2018-12-03.
 * 替换算法
 *
 */
public class SubstituteAlgorithm extends Account {

    String foundPerson(String[] people){
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")){
                return "Don";
            }
            if (people[i].equals("John")){
                return "John";
            }
            if (people[i].equals("Kent")){
                return "Kent";
            }
        }
        return "";
    }
    String foundPerson_after(String[] people){
        List candidates = Arrays.asList(new String[]{"Don","John","Kent"});
        for (String person : people) {
            if (candidates.contains(person))
                return person;
        }
        return " ";
    }



}
