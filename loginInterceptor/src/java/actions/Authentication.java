package actions;

import beans.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

/**
 *
 * @author skuarch
 */
public class Authentication extends ActionSupport {

    private Map session = null;    
    private User user;
    private String username = null;
    private String password = null;

    //==========================================================================
    public Authentication() {
        user = new User();
    }

    //==========================================================================
    @Override
    public String execute() throws Exception {

        try {

            if (username.equalsIgnoreCase("skuarch") && password.equalsIgnoreCase("123")) {

                session = ActionContext.getContext().getSession();                
                user.setName(username);
                user.setPassword(password);

                session.put("user", user);
                
                return Action.SUCCESS;

            } else {

                return "loginForm";

            }

        } catch (Exception e) {
            addActionError(e.toString());
            e.printStackTrace();            
            return Action.ERROR;
        }        

    } // end execute

    //==========================================================================  
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
    
} // end class