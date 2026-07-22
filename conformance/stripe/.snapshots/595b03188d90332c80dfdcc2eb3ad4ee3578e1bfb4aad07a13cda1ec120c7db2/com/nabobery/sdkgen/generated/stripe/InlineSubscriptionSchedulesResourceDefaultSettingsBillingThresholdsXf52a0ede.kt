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

public enum class InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeBranch {
    SubscriptionBillingThresholds,
}

public sealed class InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeDecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeNoMatchException(
    message: String,
) : InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeDecodingException(message)

internal data class InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeInspection(
    public val matchesSubscriptionBillingThresholds: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSubscriptionBillingThresholds).count { it }
}

/**
 * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_default_settings/properties/billing_
 * thresholds
 */
@Serializable(with = InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede.Serializer::class)
public class InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeInspection,
) {
    public val subscriptionBillingThresholds: SubscriptionBillingThresholdsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSubscriptionBillingThresholds) {
                json
                    .decodeFromJsonElement<SubscriptionBillingThresholdsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeBranch>
        get() =
            buildSet {
                if (inspection.matchesSubscriptionBillingThresholds) {
                    add(
                        InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeBranch.SubscriptionBillingThresholds,
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
        ): InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede {
            val inspection = inspectInlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeNoMatchException(
                    "InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede(
    element: JsonElement,
): InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeInspection {
    val raw =
        element as? JsonObject
            ?: return InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeInspection(
                matchesSubscriptionBillingThresholds = false,
                failures = listOf("SubscriptionBillingThresholds: expected JSON object"),
            )
    val matchesSubscriptionBillingThresholds = true
    return InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0edeInspection(
        matchesSubscriptionBillingThresholds = matchesSubscriptionBillingThresholds,
        failures =
            buildList {
                if (!matchesSubscriptionBillingThresholds) {
                    add(
                        "SubscriptionBillingThresholds: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
