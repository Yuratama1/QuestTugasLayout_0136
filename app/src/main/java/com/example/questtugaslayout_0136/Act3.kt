package com.example.questtugaslayout_0136

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLayout(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(top = 50.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(R.string.univ),
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.height(25.dp))

        // Mahasiswa 1
        KartuMahasiswa(
            nama = stringResource(R.string.mhs1),
            alamat = stringResource(R.string.almt1),
            warna = colorResource(R.color.grey),
            tinggiKolom = 100.dp,
            fontNama = FontFamily.Cursive,
            warnaAlamat = colorResource(R.color.yellow)
        )

        // Mahasiswa 2
        KartuMahasiswa(
            nama = stringResource(R.string.mhs2),
            alamat = stringResource(R.string.almt2),
            nomor = stringResource(R.string.nohp),
            warna = colorResource(R.color.purple),
            tinggiKolom = 130.dp,
            tebalNama = FontWeight.Bold,
            warnaNomor = colorResource(R.color.teal_200),
            warnaAlamat = colorResource(R.color.yellow)
        )

        // Mahasiswa 3
        KartuMahasiswa(
            nama = stringResource(R.string.mhs3),
            alamat = stringResource(R.string.almt3),
            nomor = stringResource(R.string.nohp),
            warna = colorResource(R.color.blue),
            tinggiKolom = 130.dp,
            tebalNama = FontWeight.Bold,
            warnaNomor = colorResource(R.color.teal_200),
            warnaAlamat = colorResource(R.color.yellow)
        )

        // Mahasiswa 4
        KartuMahasiswa(
            nama = stringResource(R.string.mhs4),
            alamat = stringResource(R.string.almt4),
            nomor = stringResource(R.string.nohp),
            warna = colorResource(R.color.green),
            tinggiKolom = 130.dp,
            tebalNama = FontWeight.Bold,
            warnaNomor = colorResource(R.color.teal_200),
            warnaAlamat = colorResource(R.color.yellow)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ) {
            Text(
                text = stringResource(R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 1.dp)
            )
        }
    }
}

@Composable
fun KartuMahasiswa(
    nama: String,
    alamat: String,
    warna: Color,
    tinggiKolom: Dp,
    nomor: String? = null,
    fontNama: FontFamily = FontFamily.Default,
    tebalNama: FontWeight = FontWeight.Normal,
    warnaNama: Color = Color.White,
    warnaNomor: Color = Color.White,
    warnaAlamat: Color = Color.White
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 12.dp,
                vertical = 5.dp
            ),
        colors = CardDefaults.cardColors(
            containerColor = warna
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(tinggiKolom)
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            val gambar = painterResource(R.drawable.logo_umy)

            //logo kiri
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .padding(5.dp)
            )

            //logo kanan
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .padding(5.dp)
            )

            //Informasi Mahasiswa
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = nama,
                    fontSize = 18.sp,
                    fontFamily = fontNama,
                    fontWeight = tebalNama,
                    color = warnaNama
                )

                if (nomor != null) {
                    Text(
                        text = nomor,
                        fontSize = 12.sp,
                        color = warnaNomor
                    )
                }

                Text(
                    text = alamat,
                    fontSize = 12.sp,
                    color = warnaAlamat
                )
            }
        }
    }
}