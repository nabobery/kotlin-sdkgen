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

public enum class InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363Branch {
    Branch1,
    InlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9,
}

public sealed class InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363NoMatchException(
    message: String,
) : InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363DecodingException(message)

internal data class InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9,
            ).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_informational/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363.Serializer::class)
public class InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9:
        InlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9) {
                json
                    .decodeFromJsonElement<InlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9) {
                    add(
                        InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363Branch.InlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9,
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
        ): InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363 {
            val inspection = inspectInlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363NoMatchException(
                    "InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363(
    element: JsonElement,
): InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9 =
        element
            .isJsonDecodable<InlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9>()
    return InlineV1PaymentRecordsRepo6844PostRequestFormMetadataXd2ff9363Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9 = matchesInlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9) {
                    add(
                        "InlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9: value does not match InlineV1PaymentRecordsRepo6844PostRequestFormMetadataAnyOf2X371770c9",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
