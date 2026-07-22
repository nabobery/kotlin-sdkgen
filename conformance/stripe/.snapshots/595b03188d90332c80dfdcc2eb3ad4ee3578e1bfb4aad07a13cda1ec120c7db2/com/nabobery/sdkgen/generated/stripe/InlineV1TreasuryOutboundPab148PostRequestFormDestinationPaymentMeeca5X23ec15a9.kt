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
 * Payment method-specific configuration for this OutboundPayment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_options
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9.Serializer::class)
public class InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9(
    public val usBankAccount: InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece? = null,
) {
    public class Builder {
        public var usBankAccount: InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece? =
            null

        public fun build(): InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9 =
            InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9(
                usBankAccount = usBankAccount,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9 must be a JSON object",
                    )
            return InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9(
                usBankAccount =
                    rawObject["us_bank_account"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa9feeece>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9(
    block: InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9.Builder.() -> Unit,
): InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9 =
    InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMeeca5X23ec15a9.build(block)
