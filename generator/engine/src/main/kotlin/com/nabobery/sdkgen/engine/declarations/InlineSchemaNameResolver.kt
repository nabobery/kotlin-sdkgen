package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.model.SchemaId

internal class InlineSchemaNameResolver(
    private val digest: (SchemaId) -> String = { schemaId -> sha256Hex(schemaId.value.encodeToByteArray()) },
    private val modelPrefix: String? = null,
) {
    fun resolveAll(
        schemaIds: List<SchemaId>,
        reservedNames: Set<String>,
    ): Map<SchemaId, String> {
        val plans = schemaIds.distinct().associateWith(::plan)
        val tagLengths = schemaIds.distinct().associateWith { MINIMUM_TAG_LENGTH }.toMutableMap()

        while (true) {
            val names =
                plans.mapValues { (schemaId, plan) ->
                    render(plan.tokens, digest(schemaId), tagLengths.getValue(schemaId))
                }
            val conflicts =
                names.entries
                    .groupBy(Map.Entry<SchemaId, String>::value)
                    .values
                    .filter { entries -> entries.size > 1 }
                    .flatten()
                    .mapTo(mutableSetOf(), Map.Entry<SchemaId, String>::key)
            names.filterValues { name -> name in reservedNames }.keys.forEach(conflicts::add)
            if (conflicts.isEmpty()) return names
            conflicts.forEach { schemaId ->
                val current = tagLengths.getValue(schemaId)
                require(current < digest(schemaId).length) {
                    "Unable to allocate a unique inline schema name for ${schemaId.value}"
                }
                tagLengths[schemaId] = minOf(current + TAG_LENGTH_STEP, digest(schemaId).length)
            }
        }
    }

    private fun plan(schemaId: SchemaId): NamePlan {
        val fragment = schemaId.value.substringAfter('#', missingDelimiterValue = "")
        val segments = parseFragment(fragment)
        val tokens =
            when (segments.firstOrNull()) {
                "paths" -> pathTokens(segments)
                "components" -> componentTokens(segments)
                else -> genericTokens(segments)
            }
        return NamePlan(listOfNotNull(modelPrefix, "Inline") + tokens.ifEmpty { listOf("Schema") })
    }

    private fun parseFragment(fragment: String): List<String> {
        if (fragment.isEmpty()) return emptyList()
        require(fragment.startsWith('/')) { "SchemaId fragment is not an RFC 6901 pointer: $fragment" }
        return fragment.drop(1).split('/').map(::decodePointerSegment)
    }

    private fun decodePointerSegment(segment: String): String {
        val result = StringBuilder(segment.length)
        var index = 0
        while (index < segment.length) {
            if (segment[index] == '~' && index + 1 < segment.length) {
                when (segment[index + 1]) {
                    '0' -> {
                        result.append('~')
                        index += 2
                        continue
                    }

                    '1' -> {
                        result.append('/')
                        index += 2
                        continue
                    }
                }
            }
            result.append(segment[index])
            index += 1
        }
        return result.toString()
    }

    private fun pathTokens(segments: List<String>): List<String> {
        if (segments.size < 3) return genericTokens(segments)
        val pathAnchor =
            segments[1]
                .split('/')
                .filter { segment -> segment.isNotBlank() && !segment.matches(PATH_PARAMETER) }
                .joinToString(" ")
                .ifBlank { "Root" }
        if (segments[2] == "parameters") {
            return parameterTokens(listOf(pathAnchor), segments, 2) ?: genericTokens(segments)
        }
        val method = segments[2]
        val anchor = listOf(pathAnchor, method)
        return when (segments.getOrNull(3)) {
            "parameters" -> parameterTokens(anchor, segments, 3)
            "requestBody" -> schemaOrContentTokens(segments, 4)?.let { anchor + "Request" + it }
            "responses" -> responseTokens(anchor, segments, 3)
            else -> null
        } ?: genericTokens(segments)
    }

    private fun parameterTokens(
        anchor: List<String>,
        segments: List<String>,
        markerIndex: Int,
    ): List<String>? = schemaOrContentTokens(segments, markerIndex + 2)?.let { anchor + "Parameter" + it }

    private fun responseTokens(
        anchor: List<String>,
        segments: List<String>,
        markerIndex: Int,
    ): List<String>? {
        val status = segments.getOrNull(markerIndex + 1) ?: return null
        val responseAnchor = anchor + "Response$status"
        val contentOrHeadersIndex = markerIndex + 2
        return if (segments.getOrNull(contentOrHeadersIndex) == "headers") {
            val headerName = segments.getOrNull(contentOrHeadersIndex + 1) ?: return null
            schemaOrContentTokens(segments, contentOrHeadersIndex + 2)?.let {
                responseAnchor + listOf("Header", headerName) + it
            }
        } else {
            schemaOrContentTokens(segments, contentOrHeadersIndex)?.let(responseAnchor::plus)
        }
    }

    private fun componentTokens(segments: List<String>): List<String> {
        if (segments.size < 3) return genericTokens(segments)
        val kind = segments[1]
        val owner = segments[2]
        return when (kind) {
            "schemas" -> listOf(owner) + semanticTail(segments.drop(3))
            "requestBodies" -> schemaOrContentTokens(segments, 3)?.let { listOf(owner, "Request") + it }
            "responses" -> reusableResponseTokens(owner, segments)
            "parameters" -> schemaOrContentTokens(segments, 3)?.let { listOf(owner, "Parameter") + it }
            "headers" -> schemaOrContentTokens(segments, 3)?.let { listOf(owner, "Header") + it }
            else -> null
        } ?: genericTokens(segments)
    }

    private fun reusableResponseTokens(
        owner: String,
        segments: List<String>,
    ): List<String>? =
        if (segments.getOrNull(3) == "headers") {
            val headerName = segments.getOrNull(4) ?: return null
            schemaOrContentTokens(segments, 5)?.let { listOf(owner, "Response", "Header", headerName) + it }
        } else {
            schemaOrContentTokens(segments, 3)?.let { listOf(owner, "Response") + it }
        }

    private fun schemaOrContentTokens(
        segments: List<String>,
        index: Int,
    ): List<String>? =
        when (segments.getOrNull(index)) {
            "schema" -> {
                semanticTail(segments.drop(index + 1))
            }

            "content" -> {
                val media = segments.getOrNull(index + 1) ?: return null
                if (segments.getOrNull(index + 2) != "schema") return null
                listOf(mediaToken(media)) + semanticTail(segments.drop(index + 3))
            }

            else -> {
                null
            }
        }

    private fun mediaToken(mediaType: String): String {
        val baseType = mediaType.substringBefore(';').trim().lowercase()
        return when (baseType) {
            "application/json" -> "Json"
            "application/problem+json" -> "ProblemJson"
            "application/merge-patch+json" -> "MergePatchJson"
            "text/event-stream" -> "EventStream"
            "multipart/form-data" -> "Multipart"
            "application/x-www-form-urlencoded" -> "Form"
            "application/octet-stream" -> "Binary"
            else -> KotlinNameResolver.typeName(baseType)
        }
    }

    private fun semanticTail(segments: List<String>): List<String> {
        val result = mutableListOf<String>()
        var index = 0
        while (index < segments.size) {
            when (val segment = segments[index]) {
                "properties" -> {
                    segments.getOrNull(index + 1)?.let(result::add)
                    index += 2
                }

                "items" -> {
                    result += "Item"
                    index += 1
                }

                "additionalProperties" -> {
                    result += "AdditionalValue"
                    index += 1
                }

                "oneOf", "anyOf", "allOf" -> {
                    val branch = segments.getOrNull(index + 1)?.toIntOrNull()
                    result += if (branch == null) segment else "$segment ${branch + 1}"
                    index += if (branch == null) 1 else 2
                }

                "schema", "content" -> {
                    index += 1
                }

                else -> {
                    result += segment
                    index += 1
                }
            }
        }
        return result
    }

    private fun genericTokens(segments: List<String>): List<String> = semanticTail(segments)

    private fun render(
        rawTokens: List<String>,
        digest: String,
        tagLength: Int,
    ): String {
        require(digest.length >= tagLength && digest.take(tagLength).all { it in "0123456789abcdef" }) {
            "Inline schema digest must contain at least $tagLength lowercase hexadecimal characters"
        }
        val tag = "X${digest.take(tagLength)}"
        val maximumBaseLength = IDENTIFIER_LENGTH_TARGET - tag.length
        val tokens = rawTokens.map(KotlinNameResolver::typeName).filter(String::isNotBlank).toMutableList()
        shorten(tokens, maximumBaseLength)
        return tokens.joinToString("") + tag
    }

    private fun shorten(
        tokens: MutableList<String>,
        maximumLength: Int,
    ) {
        if (tokens.joinToString("").length > maximumLength) {
            tokens.indices.forEach { index ->
                tokens[index] = shortenToken(tokens[index], minOf(tokens[index].length, MAXIMUM_PRESERVED_TOKEN_LENGTH))
            }
        }
        while (tokens.joinToString("").length > maximumLength && tokens.size > 4) {
            tokens.removeAt(tokens.size - 2)
        }
        while (tokens.joinToString("").length > maximumLength) {
            val index = tokens.indices.maxByOrNull { tokenIndex -> tokens[tokenIndex].length } ?: break
            val overflow = tokens.joinToString("").length - maximumLength
            val targetLength = maxOf(MINIMUM_SHORT_TOKEN_LENGTH, tokens[index].length - overflow)
            if (targetLength >= tokens[index].length) break
            tokens[index] = shortenToken(tokens[index], targetLength)
        }
        while (tokens.joinToString("").length > maximumLength && tokens.size > 1) {
            tokens.removeAt(tokens.size - 2)
        }
        if (tokens.joinToString("").length > maximumLength) {
            tokens[0] = shortenToken(tokens[0], maximumLength)
        }
    }

    private fun shortenToken(
        token: String,
        targetLength: Int,
    ): String {
        if (token.length <= targetLength) return token
        val hash = sha256Hex(token.encodeToByteArray()).take(TOKEN_HASH_LENGTH)
        val prefixLength = maxOf(1, targetLength - hash.length)
        return token.take(prefixLength) + hash
    }

    private data class NamePlan(
        val tokens: List<String>,
    )

    private companion object {
        const val IDENTIFIER_LENGTH_TARGET = 80
        const val MINIMUM_TAG_LENGTH = 8
        const val TAG_LENGTH_STEP = 4
        const val MAXIMUM_PRESERVED_TOKEN_LENGTH = 24
        const val MINIMUM_SHORT_TOKEN_LENGTH = 8
        const val TOKEN_HASH_LENGTH = 4
        val PATH_PARAMETER = Regex("\\{[^{}]+}")
    }
}
