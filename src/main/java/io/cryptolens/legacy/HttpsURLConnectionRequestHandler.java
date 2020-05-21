package io.cryptolens.legacy;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

@Deprecated
public class HttpsURLConnectionRequestHandler implements RequestHandler {
  public String makePostRequest(String url, Map<String, String> params) throws Exception {
    URL url_ = new URL(url);
    HttpsURLConnection connection = (HttpsURLConnection) url_.openConnection();
    connection.setRequestMethod("POST");

    connection.setDoOutput(true);
    BufferedOutputStream request = new BufferedOutputStream(connection.getOutputStream());
    byte[] body = paramString(params).getBytes();
    request.write(body);
    request.close();

    int status = connection.getResponseCode();

    char[] buffer = new char[2048];
    Reader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    StringBuilder sb = new StringBuilder();
    while (true) {
      int n = in.read(buffer);
      if (n == -1) {
        break;
      }
      sb.append(buffer, 0, n);
    }
    in.close();

    return sb.toString();
  }

  private static String paramString(Map<String, String> params) throws Exception {
    StringBuilder sb = new StringBuilder();

    boolean first = true;
    for (Map.Entry<String, String> entry : params.entrySet()) {
      if (first) {
        first = false;
      } else {
        sb.append("&");
      }

      sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"))
              .append("=")
              .append(URLEncoder.encode(entry.getValue(), "UTF-8"));
    }

    return sb.toString();
  }
}
