package com.tek.demo;



import javax.jms.*;
import org.hornetq.jms.server.embedded.EmbeddedJMS;
 
public class EmbeddedHornetQJMSExample
{
   public static void main(final String[] args)
   {
      try
      {
         // This EmbeddedJMS class acts as a JMSServer for example: JBoss HornetQ Server
         EmbeddedJMS jmsServer = new EmbeddedJMS();
         jmsServer.start();
         System.out.println("JD: Embedded JMS Server started.");
         ConnectionFactory connectionFactory = 
                    (ConnectionFactory)jmsServer.lookup("JDConnectionFactory");
         Queue queue = (Queue)jmsServer.lookup("/queue/JDQueue");
         Connection connection = null;
         try
         {
            connection = connectionFactory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
             
            //1. Producer Code Start
            MessageProducer producer = session.createProducer(queue);
            TextMessage message = session.createTextMessage("Hello, I'm from JournalDev(JD).");
            System.out.println("Sending message: " + message.getText());
            producer.send(message);
             
            //2. Consumer Code Start
            MessageConsumer messageConsumer = session.createConsumer(queue);
            connection.start();
            TextMessage messageReceived = (TextMessage)messageConsumer.receive(1000);
            System.out.println("Received message: " + messageReceived.getText());
         }
         finally
         {
            if (connection != null)
            {
               connection.close();
            }
 
            jmsServer.stop();
            System.out.println("JD: Embedded JMS Server stopped.");
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}