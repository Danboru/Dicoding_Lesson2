# Dicoding_Lesson2

### Pengenalan Intent

##Intent

Intent adalah mekanisme untuk melakukan Action pada komponen dalam satu aplikasi yang sama maupun aplikasi lain. Pemanfaatannya sebagai berikut :
*  Untuk berpindah halaman dari satu Activity ke Activity lain dengan atau tanpa data
*  Untuk menjalankan background Service misal dibutuhkan sebuah proses service untuk mengambil lokasi pengguna, download file atau sikronisasi ke server
*  Untuk menyampaikan sebuah objek dari komponen Broadcast misal jika ingin mengetahui jika device Android sudah selesai booting setelah diaktifkan
 

##Explicit dan Implicit Intent

* Explicit Intent
Untuk mengaktifkan komponen-komponen dalam satu aplikasi yang sama misal : Berpindah Activity atau mengaktifkan service untuk mendownload file secara background
* Implicit Intent
Untuk mengaktikan komponen dari aplikasi lain. Misal : mengaktifkan dial phone pada aplikasi Telp, mengaktifkan driving direction pada Google Maps atau mengirimkan pesan via Gmail, sms atau aplikasi lainnya.
 

##Ilustrasi

Ilustrasi bagaimana Intent mengaktifkan Activity pada aplikasi lain.

Activity A membuat Intent untuk melakukan sebuah Action dengan data object yang ada.
Sistem Android akan mencari aplikasi yang cocok Berdasarkan Intent filter
Activity pada aplikasi yang cocok akan ditampilkan.

![](https://github.com/Danboru/Dicoding_Lesson2/blob/master/images/image1.png?raw=true)

* Penggunaan Intent

  *  Intent intent = new Intent(MainActivity.this, Sub2Activity.class);
  *  startActivity(intent);
  
  
* Penggunaan putExtra Dan getExtra

  *  putExtra(key, value);
  *  subDuaActivity.putExtra(Sub2Activity.keyExtras, inputanUser);
  
  *  getExtra(key);
  *  getIntent().getStringExtra(keyExtras);

###Demo Apps

![](https://github.com/Danboru/Dicoding_Lesson2/blob/master/images/Lesson2.gif?raw=true)
