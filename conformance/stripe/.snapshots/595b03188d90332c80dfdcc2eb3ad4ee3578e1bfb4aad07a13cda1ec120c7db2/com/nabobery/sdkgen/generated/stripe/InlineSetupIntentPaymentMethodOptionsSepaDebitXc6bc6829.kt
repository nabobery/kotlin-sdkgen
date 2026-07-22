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

public enum class InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829Branch {
    SetupIntentPaymentMethodOptionsSepaDebit,
    SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829NoMatchException(
    message: String,
) : InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829DecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829Inspection(
    public val matchesSetupIntentPaymentMethodOptionsSepaDebit: Boolean,
    public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesSetupIntentPaymentMethodOptionsSepaDebit,
                matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/sepa_debit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829Inspection,
) {
    public val setupIntentPaymentMethodOptionsSepaDebit: SetupIntentPaymentMethodOptionsSepaDebitView?
        by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSetupIntentPaymentMethodOptionsSepaDebit) {
                json
                    .decodeFromJsonElement<SetupIntentPaymentMethodOptionsSepaDebitView>(
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

    public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829Branch>
        get() =
            buildSet {
                if (inspection.matchesSetupIntentPaymentMethodOptionsSepaDebit) {
                    add(
                        InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829Branch.SetupIntentPaymentMethodOptionsSepaDebit,
                    )
                }
                if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829Branch.SetupIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829 {
            val inspection = inspectInlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829(raw)
            if (inspection.matchCount == 0) {
                throw InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829NoMatchException(
                    "InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829(
    element: JsonElement,
): InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829Inspection {
    val raw =
        element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829Inspection(
            matchesSetupIntentPaymentMethodOptionsSepaDebit = false,
            matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "SetupIntentPaymentMethodOptionsSepaDebit: expected JSON object",
                    "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesSetupIntentPaymentMethodOptionsSepaDebit = true
    val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlineSetupIntentPaymentMethodOptionsSepaDebitXc6bc6829Inspection(
        matchesSetupIntentPaymentMethodOptionsSepaDebit = matchesSetupIntentPaymentMethodOptionsSepaDebit,
        matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesSetupIntentPaymentMethodOptionsSepaDebit) {
                    add(
                        "SetupIntentPaymentMethodOptionsSepaDebit: required properties  do not match their declared types",
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
