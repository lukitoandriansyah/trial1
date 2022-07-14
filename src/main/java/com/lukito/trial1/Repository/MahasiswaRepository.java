package com.lukito.trial1.Repository;
/*Package Repository ini digunakan untuk menghimpun query yang aka digunakan*/
/*SEbagai jalur Query*/

import com.lukito.trial1.model.Entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MahasiswaRepository extends JpaRepository <Mahasiswa, String>{
    Optional<Mahasiswa> findByUsernameAndPassword(String uname, String pass);
}
