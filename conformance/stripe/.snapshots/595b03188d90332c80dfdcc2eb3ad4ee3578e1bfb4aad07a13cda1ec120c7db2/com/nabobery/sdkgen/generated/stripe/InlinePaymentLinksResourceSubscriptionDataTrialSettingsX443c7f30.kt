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

public enum class InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30Branch {
    SubscriptionsTrialsResourceTrialSettings,
}

public sealed class InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30NoMatchException(
    message: String,
) : InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30DecodingException(message)

internal data class InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30Inspection(
    public val matchesSubscriptionsTrialsResourceTrialSettings: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSubscriptionsTrialsResourceTrialSettings).count { it }
}

/**
 * Settings related to subscription trials.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_subscription_data/properties/trial_settings
 */
@Serializable(with = InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30.Serializer::class)
public class InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30Inspection,
) {
    public val subscriptionsTrialsResourceTrialSettings: SubscriptionsTrialsResourceTrialSettingsView?
        by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSubscriptionsTrialsResourceTrialSettings) {
                json
                    .decodeFromJsonElement<SubscriptionsTrialsResourceTrialSettingsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30Branch>
        get() =
            buildSet {
                if (inspection.matchesSubscriptionsTrialsResourceTrialSettings) {
                    add(
                        InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30Branch.SubscriptionsTrialsResourceTrialSettings,
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
        ): InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30 {
            val inspection = inspectInlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30NoMatchException(
                    "InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30(
    element: JsonElement,
): InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30Inspection(
            matchesSubscriptionsTrialsResourceTrialSettings = false,
            failures = listOf("SubscriptionsTrialsResourceTrialSettings: expected JSON object"),
        )
    val matchesSubscriptionsTrialsResourceTrialSettings = raw["end_behavior"] != null
    return InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30Inspection(
        matchesSubscriptionsTrialsResourceTrialSettings = matchesSubscriptionsTrialsResourceTrialSettings,
        failures =
            buildList {
                if (!matchesSubscriptionsTrialsResourceTrialSettings) {
                    add(
                        "SubscriptionsTrialsResourceTrialSettings: required properties 'end_behavior' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
