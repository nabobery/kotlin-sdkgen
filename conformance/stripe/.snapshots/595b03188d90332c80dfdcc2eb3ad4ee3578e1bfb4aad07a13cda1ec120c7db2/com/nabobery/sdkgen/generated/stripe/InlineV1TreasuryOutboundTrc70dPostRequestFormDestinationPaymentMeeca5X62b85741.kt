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
 * Hash describing payment method configuration details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_options
 */
@Serializable(with = InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741.Serializer::class)
public class InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741(
    public val usBankAccount: InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c? = null,
) {
    public class Builder {
        public var usBankAccount: InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c? =
            null

        public fun build(): InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741 =
            InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741(
                usBankAccount = usBankAccount,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741 must be a JSON object",
                    )
            return InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741(
                usBankAccount =
                    rawObject["us_bank_account"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryOutboundTrc70dPostRequestFormUsBankAccountXc1c4215c>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741",
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

public fun inlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741(
    block: InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741.Builder.() -> Unit,
): InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741 =
    InlineV1TreasuryOutboundTrc70dPostRequestFormDestinationPaymentMeeca5X62b85741.build(block)
