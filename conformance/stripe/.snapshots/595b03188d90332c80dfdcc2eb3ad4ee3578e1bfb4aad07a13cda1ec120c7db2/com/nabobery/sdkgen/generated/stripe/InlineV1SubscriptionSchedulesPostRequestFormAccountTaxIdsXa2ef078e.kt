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
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eBranch {
    Branch1,
    InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eNoMatchException(
    message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/invoice_settings/properties/account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/invoice_settings/properties/account_tax_ids
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eInspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7:
        InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eBranch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7,
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
        ): InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e {
            val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eNoMatchException(
                    "InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e(
    element: JsonElement,
): InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7 =
        element
            .isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7>()
    return InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078eInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7 = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7) {
                    add(
                        "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xc42df7c7",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
