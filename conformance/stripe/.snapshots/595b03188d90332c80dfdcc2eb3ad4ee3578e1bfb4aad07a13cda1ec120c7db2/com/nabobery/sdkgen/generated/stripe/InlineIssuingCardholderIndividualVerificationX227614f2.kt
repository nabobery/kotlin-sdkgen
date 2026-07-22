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

public enum class InlineIssuingCardholderIndividualVerificationX227614f2Branch {
    IssuingCardholderVerification,
}

public sealed class InlineIssuingCardholderIndividualVerificationX227614f2DecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingCardholderIndividualVerificationX227614f2NoMatchException(
    message: String,
) : InlineIssuingCardholderIndividualVerificationX227614f2DecodingException(message)

internal data class InlineIssuingCardholderIndividualVerificationX227614f2Inspection(
    public val matchesIssuingCardholderVerification: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingCardholderVerification).count { it }
}

/**
 * Government-issued ID document for this cardholder.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_individual/properties/verification
 */
@Serializable(with = InlineIssuingCardholderIndividualVerificationX227614f2.Serializer::class)
public class InlineIssuingCardholderIndividualVerificationX227614f2 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingCardholderIndividualVerificationX227614f2Inspection,
) {
    public val issuingCardholderVerification: IssuingCardholderVerificationView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingCardholderVerification) {
                json
                    .decodeFromJsonElement<IssuingCardholderVerificationView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingCardholderIndividualVerificationX227614f2Branch>
        get() =
            buildSet {
                if (inspection.matchesIssuingCardholderVerification) {
                    add(
                        InlineIssuingCardholderIndividualVerificationX227614f2Branch.IssuingCardholderVerification,
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
        ): InlineIssuingCardholderIndividualVerificationX227614f2 {
            val inspection = inspectInlineIssuingCardholderIndividualVerificationX227614f2(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingCardholderIndividualVerificationX227614f2NoMatchException(
                    "InlineIssuingCardholderIndividualVerificationX227614f2 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingCardholderIndividualVerificationX227614f2(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingCardholderIndividualVerificationX227614f2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingCardholderIndividualVerificationX227614f2 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardholderIndividualVerificationX227614f2")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingCardholderIndividualVerificationX227614f2,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineIssuingCardholderIndividualVerificationX227614f2",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingCardholderIndividualVerificationX227614f2(
    element: JsonElement,
): InlineIssuingCardholderIndividualVerificationX227614f2Inspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingCardholderIndividualVerificationX227614f2Inspection(
            matchesIssuingCardholderVerification = false,
            failures = listOf("IssuingCardholderVerification: expected JSON object"),
        )
    val matchesIssuingCardholderVerification = true
    return InlineIssuingCardholderIndividualVerificationX227614f2Inspection(
        matchesIssuingCardholderVerification = matchesIssuingCardholderVerification,
        failures =
            buildList {
                if (!matchesIssuingCardholderVerification) {
                    add(
                        "IssuingCardholderVerification: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
