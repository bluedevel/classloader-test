package test.bla.server;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author Robin Engel on 24.08.17.
 */
public class Server {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {

        URLClassLoader urlLoader = new URLClassLoader(
                new URL[]{new URL("file:///home/rengel/IdeaProjects/test/testplugin/target/testplugin-1.0.0-SNAPSHOT.jar")},
                Server.class.getClassLoader());

        Class<?> clazz = urlLoader.loadClass("bla.awesome.TestPlugin");
    }

}
