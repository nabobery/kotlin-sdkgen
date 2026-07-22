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

public enum class InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aBranch {
    SubscriptionTransferData,
}

public sealed class InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aNoMatchException(
    message: String,
) : InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aDecodingException(message)

internal data class InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aInspection(
    public val matchesSubscriptionTransferData: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSubscriptionTransferData).count { it }
}

/**
 * The account (if any) the associated subscription's payments will be attributed to for tax reporting, and where funds
 * from each payment will be transferred to for each of the subscription's invoices.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedule_phase_configuration/properties/transfer_data
 */
@Serializable(with = InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a.Serializer::class)
public class InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aInspection,
) {
    public val subscriptionTransferData: SubscriptionTransferDataView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSubscriptionTransferData) {
                json.decodeFromJsonElement<SubscriptionTransferDataView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aBranch>
        get() =
            buildSet {
                if (inspection.matchesSubscriptionTransferData) {
                    add(
                        InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aBranch.SubscriptionTransferData,
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
        ): InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a {
            val inspection = inspectInlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aNoMatchException(
                    "InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a(
    element: JsonElement,
): InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aInspection {
    val raw =
        element as? JsonObject ?: return InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aInspection(
            matchesSubscriptionTransferData = false,
            failures = listOf("SubscriptionTransferData: expected JSON object"),
        )
    val matchesSubscriptionTransferData = raw["destination"] != null
    return InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34aInspection(
        matchesSubscriptionTransferData = matchesSubscriptionTransferData,
        failures =
            buildList {
                if (!matchesSubscriptionTransferData) {
                    add(
                        "SubscriptionTransferData: required properties 'destination' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
