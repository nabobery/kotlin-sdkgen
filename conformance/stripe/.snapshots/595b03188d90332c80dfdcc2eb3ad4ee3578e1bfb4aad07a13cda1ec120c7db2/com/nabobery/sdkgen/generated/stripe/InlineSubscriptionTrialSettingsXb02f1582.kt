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

public enum class InlineSubscriptionTrialSettingsXb02f1582Branch {
    SubscriptionsResourceTrialSettingsTrialSettings,
}

public sealed class InlineSubscriptionTrialSettingsXb02f1582DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionTrialSettingsXb02f1582NoMatchException(
    message: String,
) : InlineSubscriptionTrialSettingsXb02f1582DecodingException(message)

internal data class InlineSubscriptionTrialSettingsXb02f1582Inspection(
    public val matchesSubscriptionsResourceTrialSettingsTrialSettings: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSubscriptionsResourceTrialSettingsTrialSettings).count { it }
}

/**
 * Settings related to subscription trials.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/trial_settings
 */
@Serializable(with = InlineSubscriptionTrialSettingsXb02f1582.Serializer::class)
public class InlineSubscriptionTrialSettingsXb02f1582 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionTrialSettingsXb02f1582Inspection,
) {
    public val subscriptionsResourceTrialSettingsTrialSettings:
        SubscriptionsResourceTrialSettingsTrialSettingsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSubscriptionsResourceTrialSettingsTrialSettings) {
                json
                    .decodeFromJsonElement<SubscriptionsResourceTrialSettingsTrialSettingsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineSubscriptionTrialSettingsXb02f1582Branch>
        get() =
            buildSet {
                if (inspection.matchesSubscriptionsResourceTrialSettingsTrialSettings) {
                    add(
                        InlineSubscriptionTrialSettingsXb02f1582Branch.SubscriptionsResourceTrialSettingsTrialSettings,
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
        ): InlineSubscriptionTrialSettingsXb02f1582 {
            val inspection = inspectInlineSubscriptionTrialSettingsXb02f1582(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionTrialSettingsXb02f1582NoMatchException(
                    "InlineSubscriptionTrialSettingsXb02f1582 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionTrialSettingsXb02f1582(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionTrialSettingsXb02f1582> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionTrialSettingsXb02f1582 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionTrialSettingsXb02f1582")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionTrialSettingsXb02f1582,
        ) {
            encoder.requireJsonEncoder("InlineSubscriptionTrialSettingsXb02f1582").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionTrialSettingsXb02f1582(
    element: JsonElement,
): InlineSubscriptionTrialSettingsXb02f1582Inspection {
    val raw =
        element as? JsonObject ?: return InlineSubscriptionTrialSettingsXb02f1582Inspection(
            matchesSubscriptionsResourceTrialSettingsTrialSettings = false,
            failures = listOf("SubscriptionsResourceTrialSettingsTrialSettings: expected JSON object"),
        )
    val matchesSubscriptionsResourceTrialSettingsTrialSettings = raw["end_behavior"] != null
    return InlineSubscriptionTrialSettingsXb02f1582Inspection(
        matchesSubscriptionsResourceTrialSettingsTrialSettings = matchesSubscriptionsResourceTrialSettingsTrialSettings,
        failures =
            buildList {
                if (!matchesSubscriptionsResourceTrialSettingsTrialSettings) {
                    add(
                        "SubscriptionsResourceTrialSettingsTrialSettings: required properties 'end_behavior' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
