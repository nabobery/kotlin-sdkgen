package com.nabobery.sdkgen.runtime

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonPrimitive

/** The wire location of one generated operation parameter. */
public enum class SdkParameterLocation {
    PATH,
    QUERY,
    HEADER,
    COOKIE,
}

/**
 * One generated operation parameter after its typed value has been projected to one or more wire strings. Repeated
 * values stay repeated; the executor never joins them with commas.
 */
public class SdkRequestParameter(
    public val location: SdkParameterLocation,
    public val name: String,
    values: List<String>,
) {
    init {
        require(name.isNotBlank()) { "request parameter name must not be blank" }
    }

    /** Defensively copied wire values, preserving their original order and multiplicity. */
    public val values: List<String> = values.toList()

    public fun copy(
        location: SdkParameterLocation = this.location,
        name: String = this.name,
        values: List<String> = this.values,
    ): SdkRequestParameter = SdkRequestParameter(location, name, values)

    override fun equals(other: Any?): Boolean =
        other is SdkRequestParameter &&
            location == other.location &&
            name == other.name &&
            values == other.values

    override fun hashCode(): Int = arrayOf(location, name, values).contentHashCode()

    override fun toString(): String = "SdkRequestParameter(location=$location, name=$name, valueCount=${values.size})"
}

/** Percent-encodes one URI component using RFC 3986's unreserved set. */
public fun sdkUriEncode(value: String): String {
    val encoded = StringBuilder()
    for (byte in value.encodeToByteArray()) {
        val unsigned = byte.toInt() and 0xFF
        val character = unsigned.toChar()
        if (unsigned < 128 && character in URI_UNRESERVED) {
            encoded.append(character)
        } else {
            encoded.append('%')
            val hex = unsigned.toString(16).uppercase()
            if (hex.length == 1) encoded.append('0')
            encoded.append(hex)
        }
    }
    return encoded.toString()
}

/** Encodes one query name/value pair using the same URI-component rules everywhere in the runtime. */
internal fun encodeQueryParameter(
    name: String,
    value: String,
): String = "${sdkUriEncode(name)}=${sdkUriEncode(value)}"

/**
 * Builds the absolute request URI after path-template replacement and repeated-query serialization — the same
 * construction [SdkExecutor] uses internally to resolve a physical request. Public so generated code for
 * [PaginationDescriptor.HeaderNextUrl] pagination can compute the exact URI a page fetch will use (for
 * [com.nabobery.sdkgen.runtime.pagination.PageEnvelope.requestUri]) without duplicating this algorithm.
 */
public fun buildRequestUri(
    baseUri: String,
    pathTemplate: String,
    parameters: List<SdkRequestParameter>,
): String {
    val pathOnly = pathTemplate.substringBefore('?')
    val templateQuery = pathTemplate.substringAfter('?', missingDelimiterValue = "")
    val pathParameters = parameters.filter { it.location == SdkParameterLocation.PATH }
    val renderedPath = renderPathTemplate(pathOnly, pathParameters)
    val queryParts =
        buildList {
            if (templateQuery.isNotEmpty()) add(templateQuery)
            parameters
                .filter { it.location == SdkParameterLocation.QUERY }
                .forEach { parameter ->
                    parameter.values.forEach { value ->
                        add(encodeQueryParameter(parameter.name, value))
                    }
                }
        }
    val uri = baseUri.trimEnd('/') + "/" + renderedPath.trimStart('/')
    return if (queryParts.isEmpty()) uri else "$uri?${queryParts.joinToString("&")}"
}

private fun renderPathTemplate(
    pathTemplate: String,
    pathParameters: List<SdkRequestParameter>,
): String {
    val renderedPath = StringBuilder()
    var index = 0
    while (index < pathTemplate.length) {
        when (pathTemplate[index]) {
            '{' -> {
                val placeholderStart = index
                index++
                val nameStart = index
                while (index < pathTemplate.length && pathTemplate[index] != '}') {
                    require(pathTemplate[index] != '{') {
                        "malformed path template: nested placeholder at index $index"
                    }
                    index++
                }
                require(index < pathTemplate.length) {
                    "malformed path template: unclosed placeholder at index $placeholderStart"
                }
                require(index > nameStart) {
                    "malformed path template: empty placeholder at index $placeholderStart"
                }
                val name = pathTemplate.substring(nameStart, index)
                val values = pathParameters.filter { it.name == name }.flatMap { it.values }
                require(values.size == 1) {
                    "path parameter '$name' must have exactly one value"
                }
                renderedPath.append(sdkUriEncode(values.single()))
                index++
            }

            '}' -> {
                require(false) {
                    "malformed path template: unexpected '}' at index $index"
                }
            }

            else -> {
                renderedPath.append(pathTemplate[index])
                index++
            }
        }
    }
    return renderedPath.toString()
}

/** Merges generated header and cookie parameters after caller-supplied headers without collapsing repeated headers. */
internal fun buildRequestHeaders(
    existing: List<SdkHeader>,
    parameters: List<SdkRequestParameter>,
): List<SdkHeader> {
    val result = existing.toMutableList()
    parameters
        .filter { it.location == SdkParameterLocation.HEADER }
        .forEach { parameter ->
            parameter.values.forEach { value ->
                result += SdkHeader(parameter.name, value)
            }
        }
    val cookies =
        parameters
            .filter { it.location == SdkParameterLocation.COOKIE }
            .flatMap { parameter ->
                parameter.values.map { value -> "${sdkUriEncode(parameter.name)}=${sdkUriEncode(value)}" }
            }
    if (cookies.isNotEmpty()) {
        val cookieValue = cookies.joinToString("; ")
        val existingIndex = result.indexOfFirst { it.name.equals("Cookie", ignoreCase = true) }
        if (existingIndex < 0) {
            result += SdkHeader("Cookie", cookieValue)
        } else {
            val header = result[existingIndex]
            result[existingIndex] = SdkHeader(header.name, "${header.value}; $cookieValue")
        }
    }
    return result
}

private val URI_UNRESERVED = (('A'..'Z') + ('a'..'z') + ('0'..'9') + listOf('-', '_', '.', '~')).toSet()

/**
 * Projects a generated primitive-union parameter value to its wire strings.
 *
 * A parameter whose schema is a `oneOf` over primitive scalars and primitive arrays — GitHub's "an ID or a
 * name" path parameters and "one value or a list" query parameters, for example — is generated as a sealed
 * union whose every case carries the [raw] JSON it was built from. Because every branch of such a union is a
 * scalar or an array of scalars, the union collapses on the wire: a scalar branch contributes exactly one
 * value and an array branch contributes one per element. The branch itself is not observable in the request.
 *
 * Values are taken from [raw] rather than from the case's typed value so that one projection covers every
 * branch without the generator having to emit a `when` over case names. `JsonPrimitive.content` is used
 * deliberately: it yields the unquoted lexical form, which is what a path segment or query value carries.
 *
 * @throws IllegalArgumentException if [raw] is an object, or an array containing anything but primitives —
 *   shapes the projection is documented not to accept, so reaching them means the generator emitted a call it
 *   should not have.
 */
public fun sdkPrimitiveUnionParameterValues(raw: JsonElement): List<String> =
    when (raw) {
        is JsonNull -> {
            emptyList()
        }

        is JsonPrimitive -> {
            listOf(raw.content)
        }

        is JsonArray -> {
            raw.map { element ->
                val primitive =
                    element as? JsonPrimitive
                        ?: throw IllegalArgumentException(
                            "primitive-union parameter array element is not a primitive: $element",
                        )
                if (primitive is JsonNull) {
                    throw IllegalArgumentException("primitive-union parameter array element is null")
                }
                primitive.content
            }
        }

        else -> {
            throw IllegalArgumentException("primitive-union parameter value is not a primitive or array: $raw")
        }
    }
