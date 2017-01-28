package org.jonesnk.com.db;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

public class AppDataSource extends DriverManagerDataSource implements BeanNameAware {


    public void setBeanName(String s) {

        //this method is empty

    }

    /*public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }*/

}
