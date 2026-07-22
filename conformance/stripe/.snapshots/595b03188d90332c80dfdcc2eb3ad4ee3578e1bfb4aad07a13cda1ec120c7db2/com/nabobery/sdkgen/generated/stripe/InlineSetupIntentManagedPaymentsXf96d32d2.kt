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

public enum class InlineSetupIntentManagedPaymentsXf96d32d2Branch {
    SmorResourceManagedPayments,
}

public sealed class InlineSetupIntentManagedPaymentsXf96d32d2DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSetupIntentManagedPaymentsXf96d32d2NoMatchException(
    message: String,
) : InlineSetupIntentManagedPaymentsXf96d32d2DecodingException(message)

internal data class InlineSetupIntentManagedPaymentsXf96d32d2Inspection(
    public val matchesSmorResourceManagedPayments: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSmorResourceManagedPayments).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/managed_payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/managed_payments
 */
@Serializable(with = InlineSetupIntentManagedPaymentsXf96d32d2.Serializer::class)
public class InlineSetupIntentManagedPaymentsXf96d32d2 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSetupIntentManagedPaymentsXf96d32d2Inspection,
) {
    public val smorResourceManagedPayments: SmorResourceManagedPaymentsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSmorResourceManagedPayments) {
                json
                    .decodeFromJsonElement<SmorResourceManagedPaymentsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineSetupIntentManagedPaymentsXf96d32d2Branch>
        get() =
            buildSet {
                if (inspection.matchesSmorResourceManagedPayments) {
                    add(
                        InlineSetupIntentManagedPaymentsXf96d32d2Branch.SmorResourceManagedPayments,
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
        ): InlineSetupIntentManagedPaymentsXf96d32d2 {
            val inspection = inspectInlineSetupIntentManagedPaymentsXf96d32d2(raw)
            if (inspection.matchCount == 0) {
                throw InlineSetupIntentManagedPaymentsXf96d32d2NoMatchException(
                    "InlineSetupIntentManagedPaymentsXf96d32d2 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSetupIntentManagedPaymentsXf96d32d2(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSetupIntentManagedPaymentsXf96d32d2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSetupIntentManagedPaymentsXf96d32d2 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentManagedPaymentsXf96d32d2")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupIntentManagedPaymentsXf96d32d2,
        ) {
            encoder.requireJsonEncoder("InlineSetupIntentManagedPaymentsXf96d32d2").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSetupIntentManagedPaymentsXf96d32d2(
    element: JsonElement,
): InlineSetupIntentManagedPaymentsXf96d32d2Inspection {
    val raw =
        element as? JsonObject ?: return InlineSetupIntentManagedPaymentsXf96d32d2Inspection(
            matchesSmorResourceManagedPayments = false,
            failures = listOf("SmorResourceManagedPayments: expected JSON object"),
        )
    val matchesSmorResourceManagedPayments = raw["enabled"] != null
    return InlineSetupIntentManagedPaymentsXf96d32d2Inspection(
        matchesSmorResourceManagedPayments = matchesSmorResourceManagedPayments,
        failures =
            buildList {
                if (!matchesSmorResourceManagedPayments) {
                    add(
                        "SmorResourceManagedPayments: required properties 'enabled' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
