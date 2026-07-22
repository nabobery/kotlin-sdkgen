package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineConfirmationTokenMandateDataXfd4d495cBranch {
    ConfirmationTokensResourceMandateData,
}

public sealed class InlineConfirmationTokenMandateDataXfd4d495cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineConfirmationTokenMandateDataXfd4d495cNoMatchException(
    message: String,
) : InlineConfirmationTokenMandateDataXfd4d495cDecodingException(message)

internal data class InlineConfirmationTokenMandateDataXfd4d495cInspection(
    public val matchesConfirmationTokensResourceMandateData: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesConfirmationTokensResourceMandateData).count { it }
}

/**
 * Data used for generating a Mandate.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/confirmation_token/properties/mandate_data
 */
@Serializable(with = InlineConfirmationTokenMandateDataXfd4d495c.Serializer::class)
public class InlineConfirmationTokenMandateDataXfd4d495c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineConfirmationTokenMandateDataXfd4d495cInspection,
) {
    public val confirmationTokensResourceMandateData: ConfirmationTokensResourceMandateDataView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesConfirmationTokensResourceMandateData) {
                json
                    .decodeFromJsonElement<ConfirmationTokensResourceMandateDataView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineConfirmationTokenMandateDataXfd4d495cBranch>
        get() =
            buildSet {
                if (inspection.matchesConfirmationTokensResourceMandateData) {
                    add(
                        InlineConfirmationTokenMandateDataXfd4d495cBranch.ConfirmationTokensResourceMandateData,
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
        ): InlineConfirmationTokenMandateDataXfd4d495c {
            val inspection = inspectInlineConfirmationTokenMandateDataXfd4d495c(raw)
            if (inspection.matchCount == 0) {
                throw InlineConfirmationTokenMandateDataXfd4d495cNoMatchException(
                    "InlineConfirmationTokenMandateDataXfd4d495c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineConfirmationTokenMandateDataXfd4d495c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineConfirmationTokenMandateDataXfd4d495c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineConfirmationTokenMandateDataXfd4d495c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineConfirmationTokenMandateDataXfd4d495c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineConfirmationTokenMandateDataXfd4d495c,
        ) {
            encoder.requireJsonEncoder("InlineConfirmationTokenMandateDataXfd4d495c").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineConfirmationTokenMandateDataXfd4d495c(
    element: JsonElement,
): InlineConfirmationTokenMandateDataXfd4d495cInspection {
    val raw =
        element as? JsonObject ?: return InlineConfirmationTokenMandateDataXfd4d495cInspection(
            matchesConfirmationTokensResourceMandateData = false,
            failures = listOf("ConfirmationTokensResourceMandateData: expected JSON object"),
        )
    val matchesConfirmationTokensResourceMandateData = raw["customer_acceptance"] != null
    return InlineConfirmationTokenMandateDataXfd4d495cInspection(
        matchesConfirmationTokensResourceMandateData = matchesConfirmationTokensResourceMandateData,
        failures =
            buildList {
                if (!matchesConfirmationTokensResourceMandateData) {
                    add(
                        "ConfirmationTokensResourceMandateData: required properties 'customer_acceptance' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
