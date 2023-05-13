package com.example.pertemuan_6_sqllite

import android.provider.BaseColumns

object MahasiswaContract {
    class MahasiswaEntry : BaseColumns{
        companion object {
            const val TABLE_NAME = "mahasiswa"
            const val COLUMN_EMAIL = "email"
            const val  COLUMN_NAMA = "nama"
            const val  COLUMN_NIM = "nim"
            const val COLUMN_PASSWORD = "password"
        }
    }
}