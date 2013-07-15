package interceptors;

import beans.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 *
 * @author skuarch
 */
public class LoginInterceptor implements Interceptor {

    private String currentAction = null;
    private String publicActions = null;
    private ArrayList<String> validActions = null;
    private Map session = null;
    private User user = null;

    //==========================================================================
    public LoginInterceptor() {
    }

    //==========================================================================
    @Override
    public String intercept(ActionInvocation ai) throws Exception {

        currentAction = (String) ActionContext.getContext().get(ActionContext.ACTION_NAME);

        if (currentAction.equalsIgnoreCase("Authentication")) {
            return ai.invoke();
        }

        session = ActionContext.getContext().getSession();

        // Is there a "user" object stored in the user's HttpSession?
        Object user = session.get("user");
        if (user == null) {
            // The user has not logged in yet.           
            return "loginForm";
        } else {
            return ai.invoke();
        }

        //return "loginForm";

    }

    //==========================================================================
    @Override
    public void destroy() {        
    }

    //==========================================================================
    @Override
    public void init() {
    }

    
} // end class
