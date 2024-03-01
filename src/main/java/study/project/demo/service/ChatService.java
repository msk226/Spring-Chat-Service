package study.project.demo.service;

import java.util.List;
import org.springframework.web.socket.WebSocketSession;
import study.project.demo.dto.ChatRoom;

public interface ChatService {

    public List<ChatRoom> findAllRoom();
    public ChatRoom findRoomById(String roomId);
    public ChatRoom createChatRoom(String name);
    public <T> void sendMessage(WebSocketSession session, T message);


}
