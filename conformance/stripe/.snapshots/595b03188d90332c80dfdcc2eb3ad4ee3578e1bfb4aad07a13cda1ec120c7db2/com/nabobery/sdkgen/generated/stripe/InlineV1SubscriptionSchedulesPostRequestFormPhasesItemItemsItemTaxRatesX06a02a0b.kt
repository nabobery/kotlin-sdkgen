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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bBranch {
    Branch1,
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bNoMatchException(
    message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items/properties/tax_rates
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bInspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478,
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
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b {
            val inspection =
                inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bNoMatchException(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b(
    element: JsonElement,
): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478 =
        element
            .isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478>()
    return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0bInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478) {
                    add(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xe5a26478",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
