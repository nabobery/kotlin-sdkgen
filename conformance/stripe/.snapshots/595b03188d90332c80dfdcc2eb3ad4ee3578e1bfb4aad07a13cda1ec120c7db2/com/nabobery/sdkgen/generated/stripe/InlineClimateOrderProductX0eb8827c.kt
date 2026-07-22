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

public enum class InlineClimateOrderProductX0eb8827cBranch {
    Branch1,
    ClimateProduct,
}

public sealed class InlineClimateOrderProductX0eb8827cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineClimateOrderProductX0eb8827cNoMatchException(
    message: String,
) : InlineClimateOrderProductX0eb8827cDecodingException(message)

internal data class InlineClimateOrderProductX0eb8827cInspection(
    public val matchesBranch1: Boolean,
    public val matchesClimateProduct: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesClimateProduct).count { it }
}

/**
 * Unique ID for the Climate `Product` this order is purchasing.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate.order/properties/product
 */
@Serializable(with = InlineClimateOrderProductX0eb8827c.Serializer::class)
public class InlineClimateOrderProductX0eb8827c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineClimateOrderProductX0eb8827cInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val climateProduct: ClimateProduct? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesClimateProduct) json.decodeFromJsonElement<ClimateProduct>(raw) else null
        }

    public val matchedBranches: Set<InlineClimateOrderProductX0eb8827cBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineClimateOrderProductX0eb8827cBranch.Branch1)
                if (inspection.matchesClimateProduct) add(InlineClimateOrderProductX0eb8827cBranch.ClimateProduct)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineClimateOrderProductX0eb8827c {
            val inspection = inspectInlineClimateOrderProductX0eb8827c(raw)
            if (inspection.matchCount == 0) {
                throw InlineClimateOrderProductX0eb8827cNoMatchException(
                    "InlineClimateOrderProductX0eb8827c matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineClimateOrderProductX0eb8827c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineClimateOrderProductX0eb8827c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineClimateOrderProductX0eb8827c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineClimateOrderProductX0eb8827c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineClimateOrderProductX0eb8827c,
        ) {
            encoder.requireJsonEncoder("InlineClimateOrderProductX0eb8827c").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineClimateOrderProductX0eb8827c(
    element: JsonElement,
): InlineClimateOrderProductX0eb8827cInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesClimateProduct = element.isJsonDecodable<ClimateProduct>()
    return InlineClimateOrderProductX0eb8827cInspection(
        matchesBranch1 = matchesBranch1,
        matchesClimateProduct = matchesClimateProduct,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesClimateProduct) add("ClimateProduct: value does not match ClimateProduct")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
