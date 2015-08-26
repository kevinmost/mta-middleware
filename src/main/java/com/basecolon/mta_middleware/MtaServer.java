package com.basecolon.mta_middleware;

import spark.Spark;

public class MtaServer {
    private static final String API_KEY_BUS_TIME = System.getenv("API_KEY_BUS_TIME");

    public static void main(String[] args) {
        setSparkListenPort();
        Spark.get("/foo", (request, response) -> {
            return "hello world";
        });
    }

    private static void setSparkListenPort() {
        final int portNumber = Integer.parseInt(System.getenv("PORT"));
        Spark.port(portNumber);
    }
}
