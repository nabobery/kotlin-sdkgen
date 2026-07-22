package com.nabobery.sdkgen.runtime.bodies

import com.nabobery.sdkgen.runtime.SdkRequestBody

/**
 * Mutable, ordered `application/x-www-form-urlencoded` request-body builder.
 *
 * This builder is not thread-safe. [build] snapshots the entries present at that call, may be called repeatedly, and
 * returns a new immutable body each time; later [add] calls never mutate bodies that were already built.
 */
public class FormUrlEncodedBody {
    private val entries: MutableList<Pair<String, String>> = mutableListOf()

    /** Adds one form entry. Repeating [name] preserves a repeated key in insertion order. */
    public fun add(
        name: String,
        value: String,
    ): FormUrlEncodedBody = apply { entries += name to value }

    /** Adds one finite form number using SDKGen's locale-independent canonical rendering. */
    public fun add(
        name: String,
        value: Double,
    ): FormUrlEncodedBody = add(name, renderFormNumber(value))

    /** Builds replayable immutable UTF-8 bytes using the HTML form percent-encoding rules. */
    public fun build(): SdkRequestBody.Bytes =
        SdkRequestBody.Bytes(
            entries
                .joinToString(
                    "&",
                ) { (name, value) -> "${formEncode(name)}=${formEncode(value)}" }
                .encodeToByteArray(),
            FORM_CONTENT_TYPE,
        )
}

private fun renderFormNumber(value: Double): String {
    require(value.isFinite()) { "Form numbers must be finite" }
    if (value == 0.0) return "0"
    val rendered = value.toString().lowercase().replace("e+", "e")
    if ('e' in rendered) {
        val mantissa = rendered.substringBefore('e').trimEnd('0').trimEnd('.')
        return "$mantissa" + "e" + rendered.substringAfter('e').trimStart('+')
    }
    val unsigned = rendered.removePrefix("-")
    if ('.' !in unsigned && unsigned.length > 16) {
        val digits = unsigned.trimEnd('0')
        val fraction = digits.drop(1)
        val mantissa = digits.first().toString() + if (fraction.isEmpty()) "" else ".$fraction"
        val sign = if (rendered.startsWith('-')) "-" else ""
        return "$sign${mantissa}e${unsigned.length - 1}"
    }
    return rendered
}

private fun formEncode(value: String): String =
    buildString {
        value.replaceLoneSurrogates().encodeToByteArray().forEach { byte ->
            val unsigned = byte.toInt() and 0xFF
            when {
                unsigned == ' '.code -> {
                    append('+')
                }

                unsigned in 'a'.code..'z'.code ||
                    unsigned in 'A'.code..'Z'.code ||
                    unsigned in '0'.code..'9'.code ||
                    unsigned == '*'.code ||
                    unsigned == '-'.code ||
                    unsigned == '.'.code ||
                    unsigned == '_'.code -> {
                    append(unsigned.toChar())
                }

                else -> {
                    append('%')
                    append(HEX[unsigned ushr 4])
                    append(HEX[unsigned and 0x0F])
                }
            }
        }
    }

private fun String.replaceLoneSurrogates(): String =
    buildString(length) {
        var index = 0
        while (index < this@replaceLoneSurrogates.length) {
            val current = this@replaceLoneSurrogates[index]
            when {
                current.isHighSurrogate() &&
                    index + 1 < this@replaceLoneSurrogates.length &&
                    this@replaceLoneSurrogates[index + 1].isLowSurrogate() -> {
                    append(current)
                    append(this@replaceLoneSurrogates[index + 1])
                    index += 2
                }

                current.isHighSurrogate() || current.isLowSurrogate() -> {
                    append('�')
                    index += 1
                }

                else -> {
                    append(current)
                    index += 1
                }
            }
        }
    }

private const val FORM_CONTENT_TYPE: String = "application/x-www-form-urlencoded"
private const val HEX: String = "0123456789ABCDEF"
