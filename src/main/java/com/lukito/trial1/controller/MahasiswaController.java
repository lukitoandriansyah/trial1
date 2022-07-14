package com.lukito.trial1.controller;

import com.lukito.trial1.Repository.MahasiswaRepository;
import com.lukito.trial1.model.Dto.DefaultResponse;
import com.lukito.trial1.model.Dto.LoginDto;
import com.lukito.trial1.model.Entity.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
/* Untuk mengakses url gunakan @RequestMapping*/
@RequestMapping("/mahasiswa")
public class MahasiswaController {

    @Autowired
    /*Perintah otomatis memanggil objek dari claass di
    spring tanpa buat object baru */
    private MahasiswaRepository mahasiswaRepository;

    /*Untuk mengakses method tersebut, harus masuk ke
    /mahasiswa/login */
    @PostMapping("/login")
    /*Penambahan @RequestBody dalam parameter sebagai
    query untuk mengirim sesuatu */
    public DefaultResponse login(@RequestBody LoginDto loginDto){
        DefaultResponse df = new DefaultResponse();
        Optional<Mahasiswa> optionalMahasiswa = mahasiswaRepository.findByUsernameAndPassword(loginDto.getUname(), loginDto.getPass());

        if(optionalMahasiswa.isPresent()){
            df.setStatus(Boolean.TRUE);
            df.setMessage("Selamat!!! Anda berhasil Login");
        }else{
            df.setStatus(Boolean.FALSE);
            df.setMessage("Maaf!!! Username atau Password Salah");
        }

        return df;




    }

    /*Test koneksi program ke database,
    terhubung atau tidak*/
    @GetMapping("/byid/{nim}")
    public DefaultResponse getByIdMahasiswa(@PathVariable String nim){
        DefaultResponse df = new DefaultResponse();
        Optional<Mahasiswa> namaMhs = mahasiswaRepository.findById(nim);
        if(namaMhs.isPresent()){
            df.setStatus(Boolean.TRUE);
            df.setMessage("Data Ditemukan");
        }else{
            df.setStatus(Boolean.FALSE);
            df.setMessage("Data Tidak Ada");
        }

        return df;
    }


}
