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

public enum class InlineIssuingTransactionTokenX8b0d36f2Branch {
    Branch1,
    IssuingToken,
}

public sealed class InlineIssuingTransactionTokenX8b0d36f2DecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingTransactionTokenX8b0d36f2NoMatchException(
    message: String,
) : InlineIssuingTransactionTokenX8b0d36f2DecodingException(message)

internal data class InlineIssuingTransactionTokenX8b0d36f2Inspection(
    public val matchesBranch1: Boolean,
    public val matchesIssuingToken: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesIssuingToken).count { it }
}

/**
 * [Token](https://docs.stripe.com/api/issuing/tokens/object) object used for this transaction. If a network token was
 * not used for this transaction, this field will be null.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/token
 */
@Serializable(with = InlineIssuingTransactionTokenX8b0d36f2.Serializer::class)
public class InlineIssuingTransactionTokenX8b0d36f2 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingTransactionTokenX8b0d36f2Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val issuingToken: IssuingToken? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingToken) json.decodeFromJsonElement<IssuingToken>(raw) else null
        }

    public val matchedBranches: Set<InlineIssuingTransactionTokenX8b0d36f2Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineIssuingTransactionTokenX8b0d36f2Branch.Branch1)
                if (inspection.matchesIssuingToken) add(InlineIssuingTransactionTokenX8b0d36f2Branch.IssuingToken)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineIssuingTransactionTokenX8b0d36f2 {
            val inspection = inspectInlineIssuingTransactionTokenX8b0d36f2(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingTransactionTokenX8b0d36f2NoMatchException(
                    "InlineIssuingTransactionTokenX8b0d36f2 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingTransactionTokenX8b0d36f2(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingTransactionTokenX8b0d36f2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingTransactionTokenX8b0d36f2 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionTokenX8b0d36f2")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingTransactionTokenX8b0d36f2,
        ) {
            encoder.requireJsonEncoder("InlineIssuingTransactionTokenX8b0d36f2").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingTransactionTokenX8b0d36f2(
    element: JsonElement,
): InlineIssuingTransactionTokenX8b0d36f2Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesIssuingToken = element.isJsonDecodable<IssuingToken>()
    return InlineIssuingTransactionTokenX8b0d36f2Inspection(
        matchesBranch1 = matchesBranch1,
        matchesIssuingToken = matchesIssuingToken,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesIssuingToken) add("IssuingToken: value does not match IssuingToken")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
