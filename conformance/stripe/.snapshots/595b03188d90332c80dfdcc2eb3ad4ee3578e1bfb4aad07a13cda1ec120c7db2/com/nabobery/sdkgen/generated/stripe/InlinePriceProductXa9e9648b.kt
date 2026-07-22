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

public enum class InlinePriceProductXa9e9648bBranch {
    Branch1,
    Product,
    DeletedProduct,
}

public sealed class InlinePriceProductXa9e9648bDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePriceProductXa9e9648bNoMatchException(
    message: String,
) : InlinePriceProductXa9e9648bDecodingException(message)

internal data class InlinePriceProductXa9e9648bInspection(
    public val matchesBranch1: Boolean,
    public val matchesProduct: Boolean,
    public val matchesDeletedProduct: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesProduct, matchesDeletedProduct).count { it }
}

/**
 * The ID of the product this price is associated with.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/price/properties/product
 */
@Serializable(with = InlinePriceProductXa9e9648b.Serializer::class)
public class InlinePriceProductXa9e9648b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePriceProductXa9e9648bInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val product: Product? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesProduct) json.decodeFromJsonElement<Product>(raw) else null }

    public val deletedProduct: DeletedProduct? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesDeletedProduct) json.decodeFromJsonElement<DeletedProduct>(raw) else null
        }

    public val matchedBranches: Set<InlinePriceProductXa9e9648bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlinePriceProductXa9e9648bBranch.Branch1)
                if (inspection.matchesProduct) add(InlinePriceProductXa9e9648bBranch.Product)
                if (inspection.matchesDeletedProduct) add(InlinePriceProductXa9e9648bBranch.DeletedProduct)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePriceProductXa9e9648b {
            val inspection = inspectInlinePriceProductXa9e9648b(raw)
            if (inspection.matchCount == 0) {
                throw InlinePriceProductXa9e9648bNoMatchException(
                    "InlinePriceProductXa9e9648b matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlinePriceProductXa9e9648b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePriceProductXa9e9648b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePriceProductXa9e9648b {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePriceProductXa9e9648b")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePriceProductXa9e9648b,
        ) {
            encoder.requireJsonEncoder("InlinePriceProductXa9e9648b").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePriceProductXa9e9648b(element: JsonElement): InlinePriceProductXa9e9648bInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesProduct = element.isJsonDecodable<Product>()
    val matchesDeletedProduct = element.isJsonDecodable<DeletedProduct>()
    return InlinePriceProductXa9e9648bInspection(
        matchesBranch1 = matchesBranch1,
        matchesProduct = matchesProduct,
        matchesDeletedProduct = matchesDeletedProduct,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesProduct) add("Product: value does not match Product")
                if (!matchesDeletedProduct) add("DeletedProduct: value does not match DeletedProduct")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
