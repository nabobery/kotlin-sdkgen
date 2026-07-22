package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * The cardholder's billing address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/billing
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0(
    public val address: InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f,
) {
    public class Builder {
        private var addressValue: InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f? =
            null

        public var address: InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f
            get() = requireNotNull(addressValue) { "address is required" }
            set(`value`) {
                addressValue = value
            }

        public fun build(): InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0 {
            check(addressValue != null) { "address is required" }
            return InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0(
                address = address,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0 must be a JSON object",
                    )
            val address =
                json.decodeRequired<InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f>(
                    rawObject,
                    "address",
                )
            return InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0(
                address = address,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("address", json.encodeToJsonElement(value.address))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0(
    block: InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0.Builder.() -> Unit,
): InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0 =
    InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
