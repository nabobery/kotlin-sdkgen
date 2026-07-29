package com.nabobery.sdkgen.buildlogic.publication

import java.io.File
import java.security.MessageDigest

/** Computes the lowercase hexadecimal SHA-256 digest of a file's bytes, streaming rather than loading it whole. */
internal object Sha256 {
    internal fun of(file: File): String {
        val digest = MessageDigest.getInstance("SHA-256")
        file.inputStream().use { input ->
            val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
            while (true) {
                val read = input.read(buffer)
                if (read < 0) break
                digest.update(buffer, 0, read)
            }
        }
        return digest.digest().joinToString(separator = "") { "%02x".format(it) }
    }
}
