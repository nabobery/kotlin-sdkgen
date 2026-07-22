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

public enum class InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eBranch {
    Branch1,
    InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64,
}

public sealed class InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eNoMatchException(
    message: String,
) : InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eDecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64,
            ).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eInspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64:
        InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64) {
                    add(
                        InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eBranch.InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64,
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
        ): InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e {
            val inspection = inspectInlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eNoMatchException(
                    "InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64e(
    element: JsonElement,
): InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eInspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64 =
        element
            .isJsonDecodable<InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64>()
    return InlineV1AccountsPersonsPostRequestFormMetadataXbb7ab64eInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64 = matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64) {
                    add(
                        "InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64: value does not match InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X12741e64",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
