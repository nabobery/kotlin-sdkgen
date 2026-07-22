package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7Branch {
    Branch1,
    InlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add,
}

public sealed class InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7NoMatchException(
    message: String,
) : InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7DecodingException(message)

internal data class InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add).count { it }
}

/**
 * The customer's business name. This may be up to *150 characters*.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/business_name
 */
@Serializable(with = InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7.Serializer::class)
public class InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add:
        InlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add) {
                json
                    .decodeFromJsonElement<InlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7Branch.Branch1)
                if (inspection.matchesInlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add) {
                    add(
                        InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7Branch.InlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7 {
            val inspection = inspectInlineV1CustomersPostRequestFormBusinessNameX3b2c85e7(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7NoMatchException(
                    "InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersPostRequestFormBusinessNameX3b2c85e7(
    element: JsonElement,
): InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add =
        element
            .isJsonDecodable<InlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add>()
    return InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add = matchesInlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add) {
                    add(
                        "InlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add: value does not match InlineV1CustomersPostRequestFormBusinessNameAnyOf2X41449add",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
