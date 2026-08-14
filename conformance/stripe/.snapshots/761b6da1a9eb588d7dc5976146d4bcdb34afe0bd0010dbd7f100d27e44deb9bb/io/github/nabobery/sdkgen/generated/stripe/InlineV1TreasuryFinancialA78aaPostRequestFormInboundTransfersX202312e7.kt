package io.github.nabobery.sdkgen.generated.stripe

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
 * Contains settings related to adding funds to a FinancialAccount from another Account with the same owner.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1features/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/inbound_transfers
 */
@Serializable(with = InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7.Serializer::class)
public class InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7(
  public val ach: InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersAchX2c57d0a2? = null,
) {
  public class Builder {
    public var ach: InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersAchX2c57d0a2? =
        null

    public fun build(): InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7 = InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7(
      ach = ach,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7 must be a JSON object")
      return InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7(
        ach = rawObject["ach"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersAchX2c57d0a2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7(block: InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7.Builder.() -> Unit): InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7 = InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7.build(block)
