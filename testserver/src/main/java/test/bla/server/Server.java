package test.bla.server;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Robin Engel on 24.08.17.
 */
public class Server {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {

        System.out.println(args[0]);
        System.out.println(Arrays.toString(new File(args[0]).getParentFile().list()));

        URLClassLoader urlLoader = new URLClassLoader(
                new URL[]{new URL("file://" + args[0])},
                Server.class.getClassLoader());

        Class<?> clazz = urlLoader.loadClass("bla.awesome.TestPlugin");
    }

}
