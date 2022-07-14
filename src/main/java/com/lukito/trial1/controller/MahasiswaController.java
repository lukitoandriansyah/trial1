package com.lukito.trial1.controller;

import com.lukito.trial1.model.DefaultResponse;
import com.lukito.trial1.model.LoginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/* Untuk mengakses url gunakan @RequestMapping*/
@RequestMapping("/mahasiswa")
public class MahasiswaController {

    /*Untuk mengakses method tersebut, harus masuk ke
    /mahasiswa/login */
    @PostMapping("/login")
    /*Penambahan @RequestBody dalam parameter sebagai
    query untuk mengirim sesuatu */
    public DefaultResponse login(@RequestBody DefaultResponse defaultResponse){
        DefaultResponse df = new DefaultResponse();
        df.setStatus(Boolean.TRUE);
        df.setMessage("Selamat Login Berhasil");
        return df;
    }
}
