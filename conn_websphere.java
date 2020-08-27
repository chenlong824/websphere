import com.ibm.ws.runtime.jar;
import ibmorb.jar;

public static void main(String args[]){
    Hashtable<String, String> env = new Hashtable<String, String>();
    env.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
    env.put(Context.PROVIDER_URL, "iiop://localhost:<@!*port*!@>");
    Context cxt = new InitialContext(env);
    DataSource o = (DataSource) cxt.lookup("JNDIURI");
    conn = o.getConnection("<@!*user*!@>", "<@!*password*!@>");
}