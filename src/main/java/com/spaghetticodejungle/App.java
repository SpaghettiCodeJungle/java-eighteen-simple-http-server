package com.spaghetticodejungle;

import com.sun.net.httpserver.SimpleFileServer;
import com.sun.net.httpserver.SimpleFileServer.OutputLevel;
import java.net.InetSocketAddress;
import java.nio.file.Path;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // setup the parameters
        Integer port = 8080;
        String pathToServe = "/"; //Add filepath to your html directory.
        OutputLevel outputLevel = OutputLevel.VERBOSE;

        // create the server
        var server = SimpleFileServer.createFileServer(
            new InetSocketAddress(port),
            Path.of(pathToServe),
            outputLevel);

        // start the server
        server.start();
    }

}
