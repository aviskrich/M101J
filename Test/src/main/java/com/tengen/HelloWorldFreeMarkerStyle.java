package com.tengen;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Андрей
 * Date: 14.05.13
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldFreeMarkerStyle {
    public static void main(String[] args) throws IOException, TemplateException {
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(HelloWorldFreeMarkerStyle.class, "/");

        Template helloTemplate = configuration.getTemplate("hello.ftl");
        StringWriter writer = new StringWriter();
        Map<String, Object> helloMap = new HashMap<String, Object>();
        helloMap.put("name", "Freemarker");

        helloTemplate.process(helloMap, writer);

        System.out.println(writer);
    }
}
