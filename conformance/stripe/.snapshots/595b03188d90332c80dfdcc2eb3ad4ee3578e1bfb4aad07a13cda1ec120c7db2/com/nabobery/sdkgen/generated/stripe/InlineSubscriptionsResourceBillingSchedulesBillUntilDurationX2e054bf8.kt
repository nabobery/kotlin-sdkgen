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

public enum class InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8Branch {
    SubscriptionsResourceBillingSchedulesBillUntilDuration,
}

public sealed class InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8NoMatchException(
    message: String,
) : InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8DecodingException(message)

internal data class InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8Inspection(
    public val matchesSubscriptionsResourceBillingSchedulesBillUntilDuration: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSubscriptionsResourceBillingSchedulesBillUntilDuration).count { it }
}

/**
 * Specifies the billing period.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_schedules_bill_until/properties/durat
 * ion
 */
@Serializable(with = InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8.Serializer::class)
public class InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8Inspection,
) {
    public val subscriptionsResourceBillingSchedulesBillUntilDuration:
        SubscriptionsResourceBillingSchedulesBillUntilDurationView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSubscriptionsResourceBillingSchedulesBillUntilDuration) {
                json
                    .decodeFromJsonElement<SubscriptionsResourceBillingSchedulesBillUntilDurationView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8Branch>
        get() =
            buildSet {
                if (inspection.matchesSubscriptionsResourceBillingSchedulesBillUntilDuration) {
                    add(
                        InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8Branch.SubscriptionsResourceBillingSchedulesBillUntilDuration,
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
        ): InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8 {
            val inspection = inspectInlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8NoMatchException(
                    "InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8(
    element: JsonElement,
): InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8Inspection {
    val raw =
        element as? JsonObject
            ?: return InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8Inspection(
                matchesSubscriptionsResourceBillingSchedulesBillUntilDuration = false,
                failures = listOf("SubscriptionsResourceBillingSchedulesBillUntilDuration: expected JSON object"),
            )
    val matchesSubscriptionsResourceBillingSchedulesBillUntilDuration = raw["interval"] != null
    return InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8Inspection(
        matchesSubscriptionsResourceBillingSchedulesBillUntilDuration = matchesSubscriptionsResourceBillingSchedulesBillUntilDuration,
        failures =
            buildList {
                if (!matchesSubscriptionsResourceBillingSchedulesBillUntilDuration) {
                    add(
                        "SubscriptionsResourceBillingSchedulesBillUntilDuration: required properties 'interval' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
