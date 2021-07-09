package com.cjl.swaggerexample;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.printer.YamlPrinter;
import com.google.common.base.Strings;

import java.io.File;
import java.io.FileNotFoundException;

public class JavaParserRunner {
    public static void main(String[] args) throws Exception{
        String javaFileUrl = "/Users/wangm/workspace/swagger-example/swagger-example/src/main/java/com/cjl/swaggerexample/controller/UserController.java";
        CompilationUnit cu = null;
        cu = StaticJavaParser.parse(javaFileUrl);
        YamlPrinter printer = new YamlPrinter(true);
        System.out.println(printer.output(cu));

    }
}
