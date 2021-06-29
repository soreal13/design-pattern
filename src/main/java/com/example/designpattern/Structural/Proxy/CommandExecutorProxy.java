package com.example.designpattern.Structural.Proxy;

public class CommandExecutorProxy implements CommandExecutor {
    public boolean isAdmin;
    public CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if("sojinKim".equals(user) && "correct_pwd".equals(pwd)) {
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
