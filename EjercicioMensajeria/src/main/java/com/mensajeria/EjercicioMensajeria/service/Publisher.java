package com.mensajeria.EjercicioMensajeria.service;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Publisher {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        String valor = "404.0";
        String cotizacion = "10.5";

        String message = "Valor:" + valor + ", cotización:" + cotizacion;

//        channel.basicPublish("Usuario-Topic","comprar", null, message.getBytes());
        channel.basicPublish("TopicPunto-1","comprar", null, message.getBytes());

        System.out.println("Mensaje enviado: " + message);
        channel.close();
        connection.close();
    }
}
