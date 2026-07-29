package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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

/**
 * The set of functionalities that the platform can restrict on the FinancialAccount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/platform_restrictions
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c.Serializer::class)
public class InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c(
  public val inboundFlows:
      InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsXb4fe1d51? = null,
  public val outboundFlows:
      InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391? = null,
) {
  public class Builder {
    public var inboundFlows: InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsXb4fe1d51? =
        null

    public var outboundFlows: InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391? =
        null

    public fun build(): InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c = InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c(
      inboundFlows = inboundFlows,
      outboundFlows = outboundFlows,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c must be a JSON object")
      return InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c(
        inboundFlows = rawObject["inbound_flows"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsXb4fe1d51>(it) },
        outboundFlows = rawObject["outbound_flows"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.inboundFlows?.let { put("inbound_flows", json.encodeToJsonElement(it)) }
        value.outboundFlows?.let { put("outbound_flows", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c(block: InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c.Builder.() -> Unit): InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c = InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c.build(block)
