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

public enum class InlineSubscriptionManagedPaymentsX33f1992eBranch {
    SmorResourceManagedPayments,
}

public sealed class InlineSubscriptionManagedPaymentsX33f1992eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionManagedPaymentsX33f1992eNoMatchException(
    message: String,
) : InlineSubscriptionManagedPaymentsX33f1992eDecodingException(message)

internal data class InlineSubscriptionManagedPaymentsX33f1992eInspection(
    public val matchesSmorResourceManagedPayments: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSmorResourceManagedPayments).count { it }
}

/**
 * Settings for Managed Payments for this Subscription and resulting [Invoices](/api/invoices/object) and
 * [PaymentIntents](/api/payment_intents/object).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/managed_payments
 */
@Serializable(with = InlineSubscriptionManagedPaymentsX33f1992e.Serializer::class)
public class InlineSubscriptionManagedPaymentsX33f1992e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionManagedPaymentsX33f1992eInspection,
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

    public val matchedBranches: Set<InlineSubscriptionManagedPaymentsX33f1992eBranch>
        get() =
            buildSet {
                if (inspection.matchesSmorResourceManagedPayments) {
                    add(
                        InlineSubscriptionManagedPaymentsX33f1992eBranch.SmorResourceManagedPayments,
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
        ): InlineSubscriptionManagedPaymentsX33f1992e {
            val inspection = inspectInlineSubscriptionManagedPaymentsX33f1992e(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionManagedPaymentsX33f1992eNoMatchException(
                    "InlineSubscriptionManagedPaymentsX33f1992e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionManagedPaymentsX33f1992e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionManagedPaymentsX33f1992e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionManagedPaymentsX33f1992e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionManagedPaymentsX33f1992e")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionManagedPaymentsX33f1992e,
        ) {
            encoder.requireJsonEncoder("InlineSubscriptionManagedPaymentsX33f1992e").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionManagedPaymentsX33f1992e(
    element: JsonElement,
): InlineSubscriptionManagedPaymentsX33f1992eInspection {
    val raw =
        element as? JsonObject ?: return InlineSubscriptionManagedPaymentsX33f1992eInspection(
            matchesSmorResourceManagedPayments = false,
            failures = listOf("SmorResourceManagedPayments: expected JSON object"),
        )
    val matchesSmorResourceManagedPayments = raw["enabled"] != null
    return InlineSubscriptionManagedPaymentsX33f1992eInspection(
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
