package section23.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) {
        try{
            URL url = new URL("http://example.org");

            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line ="";
            while(line!=null){
                line = inputStream.readLine();
                System.out.println(line);
            }
            inputStream.close();

//            URI uri=url.toURI();
////            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//            URI baseURI = new URI("http://username:password@mynewserver.com:5000");
//            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
//            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
//            URI uri3 = new URI("/stores/locations?zip=12345");
//
//            URI resolvedURI1=baseURI.resolve(uri1);
//            URI resolvedURI2=baseURI.resolve(uri2);
//            URI resolvedURI3=baseURI.resolve(uri3);
////            URI uri = new URI("hello");
//
//            URL url1 = resolvedURI1.toURL();
//            System.out.println(url1);
//            URL url2 = resolvedURI2.toURL();
//            System.out.println(url2);
//            URL url3 = resolvedURI3.toURL();
//            System.out.println(url3);
//
//            URI relativizedURI = baseURI.relativize(resolvedURI2);
//            System.out.println("Relativized URI : " + relativizedURI);

//            System.out.println("Scheme = "+uri.getScheme());
//            System.out.println("Scheme-specific part = "+uri.getSchemeSpecificPart());
//            System.out.println("Authority = "+uri.getAuthority());
//            System.out.println("User info = "+uri.getUserInfo());
//            System.out.println("Host = "+uri.getHost());
//            System.out.println("Port = "+uri.getPort());
//            System.out.println("Path = "+uri.getPath());
//            System.out.println("Query = "+uri.getQuery());
//            System.out.println("Fragment = "+uri.getFragment());

        } catch (MalformedURLException e) {
            System.out.println("URL  malformed : "+e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException : "+e.getMessage());
        }
    }

}
