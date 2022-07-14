package com.lukito.trial1.Repository;
/*Package Repository ini digunakan untuk menghimpun query yang aka digunakan*/
/*SEbagai jalur Query*/

import com.lukito.trial1.model.Entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MahasiswaRepository extends JpaRepository <Mahasiswa, String>{
    //Optional<Mahasiswa> findByUsernameAndPassword(String uname, String pass);
    Optional<Mahasiswa> findByUsername(String uname);
    Optional<Mahasiswa> findByPassword(String pass);

    /*pADANAN atau beberapa penulisan
     KODE TERSEBUT ADALAH SEBAGAI BERIKUT:*/

    /*Optional<Mahasiswa> findByNama(String m);*/

    /*Native query = False berarti mengambil
    entity yang ada di program*/
    /*@Query(value = "select m from Mahasiswa m where m.nama = ?1 ", nativeQuery = false)
    Optional<Mahasiswa> queryNativeNama(String nama);*/

    /*@Query(value = "select m from Mahasiswa m where m.nama = :nama ", nativeQuery = false)
    Optional<Mahasiswa> queryNativeNama2(@Param("nama") String nama);*/

    /*@Query(value = "select * from t_trial1 where nama = ?1 ", nativeQuery = true)
    Optional<Mahasiswa> queryNativeTrue(String nama);*/
}
