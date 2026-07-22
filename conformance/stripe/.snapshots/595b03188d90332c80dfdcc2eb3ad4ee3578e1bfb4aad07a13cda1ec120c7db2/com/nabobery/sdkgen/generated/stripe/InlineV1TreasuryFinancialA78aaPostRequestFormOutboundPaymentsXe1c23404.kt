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
 * Includes Features related to initiating money movement out of the FinancialAccount to someone else's bucket of money.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1features/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/outbound_payments
 */
@Serializable(with = InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404.Serializer::class)
public class InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404(
    public val ach: InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsAchX4fced0be? = null,
    public val usDomesticWire: InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d? = null,
) {
    public class Builder {
        public var ach: InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsAchX4fced0be? =
            null

        public var usDomesticWire: InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d? =
            null

        public fun build(): InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404 =
            InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404(
                ach = ach,
                usDomesticWire = usDomesticWire,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404 must be a JSON object",
                    )
            return InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404(
                ach =
                    rawObject["ach"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsAchX4fced0be>(
                                it,
                            )
                    },
                usDomesticWire =
                    rawObject["us_domestic_wire"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
                    value.usDomesticWire?.let { put("us_domestic_wire", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404(
    block: InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404.Builder.() -> Unit,
): InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404 =
    InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404.build(block)
