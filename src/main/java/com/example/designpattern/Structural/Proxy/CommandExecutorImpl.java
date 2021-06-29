package com.example.designpattern.Structural.Proxy;

public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws Exception {
        // some heavy implematation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd +"' command executed.");
    }
}
