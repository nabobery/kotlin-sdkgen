package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11Branch {
    Branch1,
    InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3,
}

public sealed class InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11NoMatchException(
    message: String,
) : InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11DecodingException(message)

internal data class InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3,
            ).count {
                it
            }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1balance_transactions~1{transaction}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11.Serializer::class)
public class InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3:
        InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3) {
                json
                    .decodeFromJsonElement<InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3) {
                    add(
                        InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11Branch.InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3,
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
        ): InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11 {
            val inspection = inspectInlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11NoMatchException(
                    "InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11(
    element: JsonElement,
): InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3 =
        element
            .isJsonDecodable<InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3>()
    return InlineV1CustomersBalanceTransactionsPostRequestFormMetadataX0b89ad11Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3 = matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3) {
                    add(
                        "InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3: value does not match InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
