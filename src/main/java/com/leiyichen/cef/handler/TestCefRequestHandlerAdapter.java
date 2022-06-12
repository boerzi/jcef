package com.leiyichen.cef.handler;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.handler.CefRequestHandlerAdapter;
import org.cef.network.CefPostData;
import org.cef.network.CefRequest;

public class TestCefResourceRequestHandlerAdapter extends CefRequestHandlerAdapter {

  @Override
  public boolean onBeforeBrowse(CefBrowser browser, CefFrame frame, CefRequest request,
      boolean user_gesture, boolean is_redirect) {
    CefPostData postData = request.getPostData();
    System.out.println(request.getMethod());
    Optional.ofNullable(postData).ifPresent(c -> {

    });
    return super.onBeforeBrowse(browser, frame, request, user_gesture, is_redirect);
  }
}