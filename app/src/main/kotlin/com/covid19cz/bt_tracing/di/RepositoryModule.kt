package com.covid19cz.bt_tracing.di

import org.kodein.di.Kodein.Module

private const val MODULE_NAME = "Repository Module"

val repositoryModule = Module(MODULE_NAME, false) {
    //bind<XYZRepository>() with singleton { XYZRepositoryImpl(instance()) }
}