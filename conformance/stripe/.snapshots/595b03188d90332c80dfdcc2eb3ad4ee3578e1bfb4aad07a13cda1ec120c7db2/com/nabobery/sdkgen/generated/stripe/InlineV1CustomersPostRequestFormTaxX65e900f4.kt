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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 * Tax details about the customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/tax
 */
@Serializable(with = InlineV1CustomersPostRequestFormTaxX65e900f4.Serializer::class)
public class InlineV1CustomersPostRequestFormTaxX65e900f4(
    public val ipAddress: InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c? = null,
    public val validateLocation: InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13? = null,
) {
    public class Builder {
        public var ipAddress: InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c? = null

        public var validateLocation: InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13? =
            null

        public fun build(): InlineV1CustomersPostRequestFormTaxX65e900f4 =
            InlineV1CustomersPostRequestFormTaxX65e900f4(
                ipAddress = ipAddress,
                validateLocation = validateLocation,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormTaxX65e900f4 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormTaxX65e900f4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormTaxX65e900f4 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormTaxX65e900f4")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersPostRequestFormTaxX65e900f4 must be a JSON object",
                    )
            return InlineV1CustomersPostRequestFormTaxX65e900f4(
                ipAddress =
                    rawObject["ip_address"]?.let {
                        json.decodeFromJsonElement<InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c>(it)
                    },
                validateLocation =
                    rawObject["validate_location"]?.let {
                        json.decodeFromJsonElement<InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormTaxX65e900f4,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormTaxX65e900f4")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.ipAddress?.let { put("ip_address", json.encodeToJsonElement(it)) }
                    value.validateLocation?.let { put("validate_location", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersPostRequestFormTaxX65e900f4(
    block: InlineV1CustomersPostRequestFormTaxX65e900f4.Builder.() -> Unit,
): InlineV1CustomersPostRequestFormTaxX65e900f4 = InlineV1CustomersPostRequestFormTaxX65e900f4.build(block)
