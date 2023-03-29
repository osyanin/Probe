package e2e.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.util.Properties;

public class SiteConnection {
    private static Logger logger = LoggerFactory.getLogger(SiteConnection.class);

    private String url;
    private String admin;
    private String password;
    private String manager;
    private String managerPassword;
    private String manager1;
    private String manager1Password;
    private String seoManager;
    private String seoManagerPassword;
    private String seoManager2;
    private String seoManager2Password;


    private static Properties loadProperties() {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("conf/" + System.getProperty("conf", "dev") + ".properties"));
        } catch(Exception e){
            logger.error(e.toString());
        }
        return p;
    }

    public static SiteConnection load() {
        Properties props = loadProperties();
        SiteConnection conn = new SiteConnection();

        conn.url = props.getProperty("url");
        conn.admin = props.getProperty("admin");
        conn.password = props.getProperty("password");
        conn.manager = props.getProperty("manager");
        conn.managerPassword = props.getProperty("managerPassword");
        conn.manager1 = props.getProperty("manager1");
        conn.manager1Password = props.getProperty("manager1Password");
        conn.seoManager = props.getProperty("seoManager");
        conn.seoManagerPassword = props.getProperty("seoManagerPassword");
        conn.seoManager2 = props.getProperty("seoManager2");
        conn.seoManager2Password = props.getProperty("seoManager2Password");

        return conn;
    }

    protected String getUrl() {
        return url;
    }

    protected String getAdmin() {
        return admin;
    }

    protected String getPassword() {
        return password;
    }

    protected String getManager() {
        return manager;
    }

    protected String getManagerPassword() {
        return managerPassword;
    }

    protected String getManager1() {
        return manager1;
    }

    protected String getManager1Password() {
        return manager1Password;
    }

    protected String getSeoManager() {return seoManager;}
    protected String getSeoManagerPassword() {return seoManagerPassword;}
    protected String getSeoManager2() {return seoManager2;}
    protected String getSeoManager2Password() {return seoManager2Password;}

}