package com.nkia.test_launcher.pages;

import org.apache.tapestry5.annotations.Import;

@Import(stack="ExtJSStack" )
public class Index {

    public String[] getPageNames()
    {
        return new String[]{"Network"};
    }
}
