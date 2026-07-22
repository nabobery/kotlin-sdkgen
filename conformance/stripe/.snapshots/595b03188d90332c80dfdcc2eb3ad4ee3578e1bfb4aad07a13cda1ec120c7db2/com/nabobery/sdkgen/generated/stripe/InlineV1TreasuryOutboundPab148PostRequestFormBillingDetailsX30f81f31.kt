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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31.Serializer::class)
public class InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31(
    public val address: InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa? = null,
    public val email: InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7? = null,
    public val name: InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e? = null,
    public val phone: InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e? = null,
) {
    public class Builder {
        public var address: InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa? = null

        public var email: InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7? = null

        public var name: InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e? = null

        public var phone: InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e? = null

        public fun build(): InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31 =
            InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31(
                address = address,
                email = email,
                name = name,
                phone = phone,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31 must be a JSON object",
                    )
            return InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31(
                address =
                    rawObject["address"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa>(it)
                    },
                email =
                    rawObject["email"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7>(it)
                    },
                name =
                    rawObject["name"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e>(it)
                    },
                phone =
                    rawObject["phone"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.address?.let { put("address", json.encodeToJsonElement(it)) }
                    value.email?.let { put("email", json.encodeToJsonElement(it)) }
                    value.name?.let { put("name", json.encodeToJsonElement(it)) }
                    value.phone?.let { put("phone", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31(
    block: InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31.Builder.() -> Unit,
): InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31 =
    InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31.build(block)
