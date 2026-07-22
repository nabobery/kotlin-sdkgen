package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902Branch {
    Branch1,
    Price,
}

public sealed class InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902NoMatchException(
    message: String,
) : InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902DecodingException(message)

internal data class InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902Inspection(
    public val matchesBranch1: Boolean,
    public val matchesPrice: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesPrice).count { it }
}

/**
 * The billing schedule will apply to the subscription item with the given price ID.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_schedules_applies_to/properties/price
 */
@Serializable(with = InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902.Serializer::class)
public class InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val price: Price? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesPrice) json.decodeFromJsonElement<Price>(raw) else null }

    public val matchedBranches:
        Set<InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902Branch.Branch1,
                    )
                }
                if (inspection.matchesPrice) {
                    add(
                        InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902Branch.Price,
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
        ): InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902 {
            val inspection = inspectInlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902NoMatchException(
                    "InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902(
    element: JsonElement,
): InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesPrice = element.isJsonDecodable<Price>()
    return InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902Inspection(
        matchesBranch1 = matchesBranch1,
        matchesPrice = matchesPrice,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesPrice) add("Price: value does not match Price")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
