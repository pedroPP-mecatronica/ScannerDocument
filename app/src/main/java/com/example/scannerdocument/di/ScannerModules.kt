package com.example.scannerdocument.di

import com.example.scannerdocument.login.di.scannerLoginModule
import org.koin.dsl.module

internal val scannerModules = module { scannerLoginModule }