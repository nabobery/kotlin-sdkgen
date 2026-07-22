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

public enum class InlineQuoteDefaultTaxRatesItemXd99c0405Branch {
    Branch1,
    TaxRate,
}

public sealed class InlineQuoteDefaultTaxRatesItemXd99c0405DecodingException(
    message: String,
) : SerializationException(message)

public class InlineQuoteDefaultTaxRatesItemXd99c0405NoMatchException(
    message: String,
) : InlineQuoteDefaultTaxRatesItemXd99c0405DecodingException(message)

internal data class InlineQuoteDefaultTaxRatesItemXd99c0405Inspection(
    public val matchesBranch1: Boolean,
    public val matchesTaxRate: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesTaxRate).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/quote/properties/default_tax_rates/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/default_tax_rates/items
 */
@Serializable(with = InlineQuoteDefaultTaxRatesItemXd99c0405.Serializer::class)
public class InlineQuoteDefaultTaxRatesItemXd99c0405 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineQuoteDefaultTaxRatesItemXd99c0405Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val taxRate: TaxRate? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesTaxRate) json.decodeFromJsonElement<TaxRate>(raw) else null }

    public val matchedBranches: Set<InlineQuoteDefaultTaxRatesItemXd99c0405Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineQuoteDefaultTaxRatesItemXd99c0405Branch.Branch1)
                if (inspection.matchesTaxRate) add(InlineQuoteDefaultTaxRatesItemXd99c0405Branch.TaxRate)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineQuoteDefaultTaxRatesItemXd99c0405 {
            val inspection = inspectInlineQuoteDefaultTaxRatesItemXd99c0405(raw)
            if (inspection.matchCount == 0) {
                throw InlineQuoteDefaultTaxRatesItemXd99c0405NoMatchException(
                    "InlineQuoteDefaultTaxRatesItemXd99c0405 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineQuoteDefaultTaxRatesItemXd99c0405(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineQuoteDefaultTaxRatesItemXd99c0405> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineQuoteDefaultTaxRatesItemXd99c0405 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineQuoteDefaultTaxRatesItemXd99c0405")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineQuoteDefaultTaxRatesItemXd99c0405,
        ) {
            encoder.requireJsonEncoder("InlineQuoteDefaultTaxRatesItemXd99c0405").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineQuoteDefaultTaxRatesItemXd99c0405(
    element: JsonElement,
): InlineQuoteDefaultTaxRatesItemXd99c0405Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesTaxRate = element.isJsonDecodable<TaxRate>()
    return InlineQuoteDefaultTaxRatesItemXd99c0405Inspection(
        matchesBranch1 = matchesBranch1,
        matchesTaxRate = matchesTaxRate,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesTaxRate) add("TaxRate: value does not match TaxRate")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
