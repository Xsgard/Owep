package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.Client;
import com.kclm.owep.entity.ClientNote;
import com.kclm.owep.mapper.ClientNoteMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;


@SpringBootTest
class ClientNoteMapperTest {

    @Autowired
    private ClientNoteMapper clientNoteMapper;

    @Test
    void selectAll() {
        //通过客户id 查询该客户的所有跟进记录
        List<ClientNote> clientNotes = clientNoteMapper.selectAllById(1);
        Client client = clientNotes.get(0).getClient();
        System.out.println(client);
        clientNotes.forEach(System.out::println);
    }

    @Test
    void save() {
        ClientNote clientNote = new ClientNote();
        Client client = new Client();
        client.setId(1);
        clientNote.setClient(client);
        clientNote.setClientState(1);
        clientNote.setClientNote("该客户已经找到工作");
        clientNote.setLastAccessTime(LocalDateTime.now());
        clientNoteMapper.save(clientNote);

    }

    @Test
    void update() {
        ClientNote clientNote = new ClientNote();
        clientNote.setId(1);
        Client client = new Client();
        client.setId(1);
        clientNote.setClient(client);
        clientNote.setClientState(1);
        clientNote.setClientNote("意向客户");
        clientNote.setLastAccessTime(LocalDateTime.now());
        clientNoteMapper.update(clientNote);
    }

    @Test
    void deleteById() {
        clientNoteMapper.deleteById(2);
    }

}