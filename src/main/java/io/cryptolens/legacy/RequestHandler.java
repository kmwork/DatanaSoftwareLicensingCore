package io.cryptolens.legacy;

import java.util.Map;

@Deprecated
public interface RequestHandler {
  public String makePostRequest(String url, Map<String, String> params) throws Exception;
}
