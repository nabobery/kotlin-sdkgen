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

public enum class InlineSetupIntentPaymentMethodOptionsPixXc852d205Branch {
    SetupIntentPaymentMethodOptionsPix,
    SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsPixXc852d205DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsPixXc852d205NoMatchException(
    message: String,
) : InlineSetupIntentPaymentMethodOptionsPixXc852d205DecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsPixXc852d205Inspection(
    public val matchesSetupIntentPaymentMethodOptionsPix: Boolean,
    public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesSetupIntentPaymentMethodOptionsPix,
                matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/pix.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/pix
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsPixXc852d205.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsPixXc852d205 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSetupIntentPaymentMethodOptionsPixXc852d205Inspection,
) {
    public val setupIntentPaymentMethodOptionsPix: SetupIntentPaymentMethodOptionsPixView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSetupIntentPaymentMethodOptionsPix) {
                json
                    .decodeFromJsonElement<SetupIntentPaymentMethodOptionsPixView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val setupIntentTypeSpecificPaymentMethodOptionsClient:
        SetupIntentTypeSpecificPaymentMethodOptionsClientView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) {
                json
                    .decodeFromJsonElement<SetupIntentTypeSpecificPaymentMethodOptionsClientView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsPixXc852d205Branch>
        get() =
            buildSet {
                if (inspection.matchesSetupIntentPaymentMethodOptionsPix) {
                    add(
                        InlineSetupIntentPaymentMethodOptionsPixXc852d205Branch.SetupIntentPaymentMethodOptionsPix,
                    )
                }
                if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlineSetupIntentPaymentMethodOptionsPixXc852d205Branch.SetupIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlineSetupIntentPaymentMethodOptionsPixXc852d205 {
            val inspection = inspectInlineSetupIntentPaymentMethodOptionsPixXc852d205(raw)
            if (inspection.matchCount == 0) {
                throw InlineSetupIntentPaymentMethodOptionsPixXc852d205NoMatchException(
                    "InlineSetupIntentPaymentMethodOptionsPixXc852d205 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSetupIntentPaymentMethodOptionsPixXc852d205(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsPixXc852d205> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsPixXc852d205 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsPixXc852d205")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupIntentPaymentMethodOptionsPixXc852d205,
        ) {
            encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsPixXc852d205").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsPixXc852d205(
    element: JsonElement,
): InlineSetupIntentPaymentMethodOptionsPixXc852d205Inspection {
    val raw =
        element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsPixXc852d205Inspection(
            matchesSetupIntentPaymentMethodOptionsPix = false,
            matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "SetupIntentPaymentMethodOptionsPix: expected JSON object",
                    "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesSetupIntentPaymentMethodOptionsPix = true
    val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlineSetupIntentPaymentMethodOptionsPixXc852d205Inspection(
        matchesSetupIntentPaymentMethodOptionsPix = matchesSetupIntentPaymentMethodOptionsPix,
        matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesSetupIntentPaymentMethodOptionsPix) {
                    add(
                        "SetupIntentPaymentMethodOptionsPix: required properties  do not match their declared types",
                    )
                }
                if (!matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        "SetupIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
