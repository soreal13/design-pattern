package com.example.designpattern.Structural.Facade;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection(){
        // 실제 커넥션 리턴해야 하지만 예제이므로 null 리턴
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection conn) {
        // get data from table and generate pdf report

    }

    public void generateMySqlHTMLReport(String tableName, Connection conn) {
        // get data from table and generate pdf report
    }
}
