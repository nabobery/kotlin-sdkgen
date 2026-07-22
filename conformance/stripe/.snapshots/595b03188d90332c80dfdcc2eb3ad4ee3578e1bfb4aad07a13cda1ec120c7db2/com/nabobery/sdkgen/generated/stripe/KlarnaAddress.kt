package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class KlarnaAddressView(
    public val country: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/klarna_address
 */
@Serializable(with = KlarnaAddress.Serializer::class)
public class KlarnaAddress(
    /**
     * The payer address country
     */
    public val country: String? = null,
) {
    public class Builder {
        /**
         * The payer address country
         */
        public var country: String? = null

        public fun build(): KlarnaAddress =
            KlarnaAddress(
                country = country,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): KlarnaAddress = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<KlarnaAddress> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): KlarnaAddress {
            val jsonDecoder = decoder.requireJsonDecoder("KlarnaAddress")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("KlarnaAddress must be a JSON object")
            return KlarnaAddress(
                country =
                    rawObject["country"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: KlarnaAddress,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("KlarnaAddress")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.country?.let { put("country", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun klarnaAddress(block: KlarnaAddress.Builder.() -> Unit): KlarnaAddress = KlarnaAddress.build(block)
