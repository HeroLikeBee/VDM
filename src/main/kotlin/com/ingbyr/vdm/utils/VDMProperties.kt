package com.ingbyr.vdm.utils

import java.nio.file.Paths

object VDMProperties {
    const val VDM_UPDATE_URL = "https://github.com/ingbyr/VDM/releases/latest"
    const val VDM_SOURCE_CODE = "https://github.com/ingbyr/VDM"
    const val VDM_LICENSE = "https://raw.githubusercontent.com/ingbyr/VDM/master/LICENSE.txt"
    const val VDM_REPORT_BUGS = "https://github.com/ingbyr/VDM/issues"
    const val UNKNOWN_VERSION = "0.0.0"
    const val DONATION_URL = "https://paypal.me/ingbyr"
    const val DB_DOWNLOAD_TASKS = "DB_DOWNLOAD_TASKS"
    val APP_DIR = Paths.get(System.getProperty("user.dir")).toAbsolutePath()!!
    val USER_DIR = Paths.get(System.getProperty("user.home"), ".vdm").toAbsolutePath()!!
    val DATABASE_PATH_STR = Paths.get(System.getProperty("user.home"), ".vdm", "vdm.db").toAbsolutePath().toString()
}