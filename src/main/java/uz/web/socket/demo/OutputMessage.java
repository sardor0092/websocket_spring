package websocket.full.connection;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import uz.web.socket.demo.Message;

import java.text.SimpleDateFormat;
import java.util.Date;

@MessageMapping("/chat")
@SendTo("/topic/messages")
public class OutputMessage {


    public OutputMessage(String from, String text, String time) {
    }

    public OutputMessage send(Message message) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getFrom(), message.getText(), time);
    }







}