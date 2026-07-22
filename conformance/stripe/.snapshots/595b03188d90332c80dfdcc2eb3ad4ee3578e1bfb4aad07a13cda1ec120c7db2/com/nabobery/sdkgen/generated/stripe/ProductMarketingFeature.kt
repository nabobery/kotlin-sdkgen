package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/product_marketing_feature
 */
@Serializable(with = ProductMarketingFeature.Serializer::class)
public class ProductMarketingFeature(
    /**
     * The marketing feature name. Up to 80 characters long.
     */
    public val name: String? = null,
) {
    public class Builder {
        /**
         * The marketing feature name. Up to 80 characters long.
         */
        public var name: String? = null

        public fun build(): ProductMarketingFeature =
            ProductMarketingFeature(
                name = name,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ProductMarketingFeature = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ProductMarketingFeature> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ProductMarketingFeature {
            val jsonDecoder = decoder.requireJsonDecoder("ProductMarketingFeature")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ProductMarketingFeature must be a JSON object")
            return ProductMarketingFeature(
                name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ProductMarketingFeature,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ProductMarketingFeature")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.name?.let { put("name", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun productMarketingFeature(block: ProductMarketingFeature.Builder.() -> Unit): ProductMarketingFeature =
    ProductMarketingFeature.build(block)
