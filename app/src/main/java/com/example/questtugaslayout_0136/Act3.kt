package com.example.questtugaslayout_0136

import android.graphics.Color
import android.graphics.fonts.FontFamily
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLayout(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .padding(top = 50.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 15.sp
        )

        //Mahasiswa1
        KartuMahasiswa(
            nama = stringResource(R.string.mhs1),
            alamat = stringResource(R.string.almt1),
            warna = colorResource(R.color.grey),
            tinggiKolom = 100.dp,
            fontNama = FontFamily.Cursive,
            warnaAlamat = colorResource(R.color.yellow)
        )

        //Mahasiswa2
        KartuMahasiswa(
            nama = stringResource(R.string.mhs2),
            nomor = stringResource(R.string.nohp),
            alamat = stringResource(R.string.almt2),
            warna = colorResource(R.color.purple),
            tinggiKolom = 130.dp,
            tebalNama = FontWeight.Bold,
            warnaNomor = colorResource(R.color.teal_200),
            warnaAlamat = colorResource(R.color.yellow)
        )

        //Mahasiswa3
        KartuMahasiswa(
            nama = stringResource(R.string.mhs3),
            nomor = stringResource(R.string.nohp),
            alamat = stringResource(R.string.almt3),
            warna = colorResource(R.color.blue),
            tinggiKolom = 130.dp,
            tebalNama = FontWeight.Bold,
            warnaNomor = colorResource(R.color.teal_200),
            warnaAlamat = colorResource(R.color.yellow)
        )
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
    tabelNama: FontWeight = FontWeight.Normal,
    warnaColor: Color = colorResource(R.color.white),
    warnaAlamat: Color = colorResource(R.color.white)
){}
