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

public enum class InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffBranch {
    SetupIntentPaymentMethodOptionsAcssDebit,
    SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffDecodingException(
    message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffNoMatchException(
    message: String,
) : InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffDecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffInspection(
    public val matchesSetupIntentPaymentMethodOptionsAcssDebit: Boolean,
    public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesSetupIntentPaymentMethodOptionsAcssDebit,
                matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/acss_debit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffInspection,
) {
    public val setupIntentPaymentMethodOptionsAcssDebit: SetupIntentPaymentMethodOptionsAcssDebitView?
        by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSetupIntentPaymentMethodOptionsAcssDebit) {
                json
                    .decodeFromJsonElement<SetupIntentPaymentMethodOptionsAcssDebitView>(
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

    public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffBranch>
        get() =
            buildSet {
                if (inspection.matchesSetupIntentPaymentMethodOptionsAcssDebit) {
                    add(
                        InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffBranch.SetupIntentPaymentMethodOptionsAcssDebit,
                    )
                }
                if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffBranch.SetupIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff {
            val inspection = inspectInlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff(raw)
            if (inspection.matchCount == 0) {
                throw InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffNoMatchException(
                    "InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ff(
    element: JsonElement,
): InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffInspection {
    val raw =
        element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffInspection(
            matchesSetupIntentPaymentMethodOptionsAcssDebit = false,
            matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "SetupIntentPaymentMethodOptionsAcssDebit: expected JSON object",
                    "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesSetupIntentPaymentMethodOptionsAcssDebit = true
    val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlineSetupIntentPaymentMethodOptionsAcssDebitXf3d899ffInspection(
        matchesSetupIntentPaymentMethodOptionsAcssDebit = matchesSetupIntentPaymentMethodOptionsAcssDebit,
        matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesSetupIntentPaymentMethodOptionsAcssDebit) {
                    add(
                        "SetupIntentPaymentMethodOptionsAcssDebit: required properties  do not match their declared types",
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
