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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/features/properties/inbound_transfers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/features/properties/inbound_transfers
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca.Serializer::class)
public class InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca(
    public val ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchX807eb3a6? = null,
) {
    public class Builder {
        public var ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchX807eb3a6? = null

        public fun build(): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca =
            InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca(
                ach = ach,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca must be a JSON object",
                    )
            return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca(
                ach =
                    rawObject["ach"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchX807eb3a6>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca(
    block: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca.Builder.() -> Unit,
): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca =
    InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca.build(block)
