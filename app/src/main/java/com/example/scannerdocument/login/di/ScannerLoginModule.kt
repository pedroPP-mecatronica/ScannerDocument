package com.example.scannerdocument.login.di

import com.example.scannerdocument.login.viewmodel.ScannerLoginViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

internal val scannerLoginModule = module {
    viewModel { ScannerLoginViewModel() }
}