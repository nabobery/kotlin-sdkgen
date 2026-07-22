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
 * The set of functionalities that the platform can restrict on the FinancialAccount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/platform_restrictions
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad.Serializer::class)
public class InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad(
    public val inboundFlows: InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce? = null,
    public val outboundFlows: InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXf195182f? = null,
) {
    public class Builder {
        public var inboundFlows: InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce? =
            null

        public var outboundFlows: InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXf195182f? =
            null

        public fun build(): InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad =
            InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad(
                inboundFlows = inboundFlows,
                outboundFlows = outboundFlows,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad must be a JSON object",
                    )
            return InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad(
                inboundFlows =
                    rawObject["inbound_flows"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce>(
                            it,
                        )
                    },
                outboundFlows =
                    rawObject["outbound_flows"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXf195182f>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.inboundFlows?.let { put("inbound_flows", json.encodeToJsonElement(it)) }
                    value.outboundFlows?.let { put("outbound_flows", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad(
    block: InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad.Builder.() -> Unit,
): InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad =
    InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad.build(block)
