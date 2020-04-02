package com.goldius.simple.docker;

import com.goldius.simple.docker.netty.Server;
import com.goldius.simple.docker.netty.securechat.SecureChatClient;
import com.goldius.simple.docker.netty.securechat.SecureChatServer;

public class App {

    public static void main(String... args) {
        try {
            if (args != null && args.length > 0 && "server".equals(args[0])) {
                SecureChatServer.main(args);
            } else {
                SecureChatClient.main(args);
            }
//            Server.startServer(8080);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
