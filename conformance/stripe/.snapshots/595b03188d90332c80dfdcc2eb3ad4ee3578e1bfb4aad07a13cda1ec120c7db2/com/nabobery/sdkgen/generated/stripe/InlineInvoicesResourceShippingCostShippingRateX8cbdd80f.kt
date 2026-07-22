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

public enum class InlineInvoicesResourceShippingCostShippingRateX8cbdd80fBranch {
    Branch1,
    ShippingRate,
}

public sealed class InlineInvoicesResourceShippingCostShippingRateX8cbdd80fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoicesResourceShippingCostShippingRateX8cbdd80fNoMatchException(
    message: String,
) : InlineInvoicesResourceShippingCostShippingRateX8cbdd80fDecodingException(message)

internal data class InlineInvoicesResourceShippingCostShippingRateX8cbdd80fInspection(
    public val matchesBranch1: Boolean,
    public val matchesShippingRate: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesShippingRate).count { it }
}

/**
 * The ID of the ShippingRate for this invoice.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_shipping_cost/properties/shipping_rate
 */
@Serializable(with = InlineInvoicesResourceShippingCostShippingRateX8cbdd80f.Serializer::class)
public class InlineInvoicesResourceShippingCostShippingRateX8cbdd80f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoicesResourceShippingCostShippingRateX8cbdd80fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val shippingRate: ShippingRate? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesShippingRate) json.decodeFromJsonElement<ShippingRate>(raw) else null
        }

    public val matchedBranches: Set<InlineInvoicesResourceShippingCostShippingRateX8cbdd80fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineInvoicesResourceShippingCostShippingRateX8cbdd80fBranch.Branch1,
                    )
                }
                if (inspection.matchesShippingRate) {
                    add(
                        InlineInvoicesResourceShippingCostShippingRateX8cbdd80fBranch.ShippingRate,
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
        ): InlineInvoicesResourceShippingCostShippingRateX8cbdd80f {
            val inspection = inspectInlineInvoicesResourceShippingCostShippingRateX8cbdd80f(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoicesResourceShippingCostShippingRateX8cbdd80fNoMatchException(
                    "InlineInvoicesResourceShippingCostShippingRateX8cbdd80f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoicesResourceShippingCostShippingRateX8cbdd80f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoicesResourceShippingCostShippingRateX8cbdd80f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoicesResourceShippingCostShippingRateX8cbdd80f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesResourceShippingCostShippingRateX8cbdd80f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoicesResourceShippingCostShippingRateX8cbdd80f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineInvoicesResourceShippingCostShippingRateX8cbdd80f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoicesResourceShippingCostShippingRateX8cbdd80f(
    element: JsonElement,
): InlineInvoicesResourceShippingCostShippingRateX8cbdd80fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesShippingRate = element.isJsonDecodable<ShippingRate>()
    return InlineInvoicesResourceShippingCostShippingRateX8cbdd80fInspection(
        matchesBranch1 = matchesBranch1,
        matchesShippingRate = matchesShippingRate,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesShippingRate) add("ShippingRate: value does not match ShippingRate")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
