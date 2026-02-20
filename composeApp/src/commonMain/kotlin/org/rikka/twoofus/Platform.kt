package org.rikka.twoofus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform