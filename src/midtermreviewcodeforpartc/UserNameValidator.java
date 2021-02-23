/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author moomalharoon
 */
public class UserNameValidator {
    
    public boolean nameValidator(String userName){
    
        if (userName == null || userName.equals(""))
            return false;
    
        return true;
    }
    
}
