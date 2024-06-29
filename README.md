# Spring Boot API dengan MongoDB

## Deskripsi
Project ini merupakan sebuah API yang dibangun menggunakan framework Spring Boot dengan bahasa pemrograman Java. API ini menggunakan database MongoDB untuk menyimpan dan mengelola data hotel. API menyediakan dua endpoint utama, yaitu:

- `/api/hotels` untuk mendapatkan semua data hotel
- `/api/hotels/{hotelId}` untuk mendapatkan data hotel spesifik berdasarkan ID

## Prasyarat
Untuk menjalankan project ini, Anda membutuhkan:

- Java Development Kit (JDK) versi 8 atau yang lebih baru
- IDE (misalnya IntelliJ IDEA atau Eclipse)
- MongoDB yang sudah terinstal dan berjalan

## Instalasi
1. Klon repository ini ke komputer Anda.
2. Buka project menggunakan IDE pilihan Anda.
3. Konfigurasi file `application.properties` dengan detail koneksi database MongoDB Anda.
4. Jalankan project dengan perintah `mvn spring-boot:run` atau menggunakan fitur "Run" dari IDE Anda.

## Penggunaan
Setelah project berjalan, Anda dapat mengakses endpoint API menggunakan alat seperti Postman atau dengan membuat permintaan HTTP langsung dari kode Anda.

### Mendapatkan Semua Data Hotel
Untuk mendapatkan semua data hotel, buat permintaan GET ke endpoint `/api/hotels`. Sebagai contoh:

```
GET http://localhost:8080/api/hotels
```

Respons akan berupa array JSON yang berisi semua data hotel.

### Mendapatkan Data Hotel Spesifik
Untuk mendapatkan data hotel spesifik berdasarkan ID, buat permintaan GET ke endpoint `/api/hotels/{hotelId}`, dengan `{hotelId}` diganti dengan ID hotel yang diinginkan. Sebagai contoh:

```
GET http://localhost:8080/api/hotels/12345
```

Respons akan berupa objek JSON yang berisi data hotel dengan ID yang diberikan.

## Lisensi
Project ini dilisensikan di bawah MIT License. Lihat file LICENSE untuk detail lebih lanjut.