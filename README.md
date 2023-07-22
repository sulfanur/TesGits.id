# TesGits.id
Penjelasan Soal3.py
# Balanced Brackets Function
## Deskripsi Fungsi
Fungsi is_balanced_brackets digunakan untuk memeriksa apakah sebuah string yang mengandung tanda kurung memiliki tanda kurung yang seimbang atau tidak. Tanda kurung yang seimbang berarti setiap tanda buka (seperti (, [, atau {) memiliki pasangan tanda tutup yang cocok (seperti ), ], atau }). Fungsi ini mengembalikan "YES" jika string seimbang dan "NO" jika tidak.

## Input
Fungsi ini menerima satu parameter:

s: String yang berisi tanda kurung yang akan diperiksa.
## Output
Fungsi ini mengembalikan satu nilai:

"YES" jika tanda kurung dalam string seimbang.
"NO" jika tanda kurung dalam string tidak seimbang.
## Cara Penggunaan
Panggil fungsi is_balanced_brackets(s) dengan menyediakan string s yang berisi tanda kurung yang ingin diperiksa. Fungsi akan mengembalikan hasilnya berupa "YES" atau "NO" sesuai dengan keseimbangan tanda kurung dalam string.

## Kompleksitas
Kompleksitas waktu dari kodingan ini adalah O(n), di mana n adalah jumlah karakter dalam string input. Karena kita melintasi seluruh karakter sekali dan setiap operasi pada stack berjalan dalam waktu konstan, kompleksitasnya adalah linear terhadap panjang input.
Kompleksitas ruang adalah O(n) karena kita menggunakan stack yang akan memiliki puncaknya dengan jumlah karakter yang sama dengan jumlah tanda buka yang belum memiliki pasangan tanda tutup pada string input.
