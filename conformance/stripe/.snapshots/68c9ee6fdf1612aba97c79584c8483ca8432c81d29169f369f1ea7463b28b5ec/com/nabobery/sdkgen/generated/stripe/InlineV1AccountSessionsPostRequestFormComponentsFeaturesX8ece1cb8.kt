package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/financial_account_transactions/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/financial_account_transactions/properties/features
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8(
  public val cardSpendDisputeManagement: Boolean? = null,
) {
  public class Builder {
    public var cardSpendDisputeManagement: Boolean? = null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8 = InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8(
      cardSpendDisputeManagement = cardSpendDisputeManagement,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8 must be a JSON object")
      return InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8(
        cardSpendDisputeManagement = rawObject["card_spend_dispute_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardSpendDisputeManagement?.let { put("card_spend_dispute_management", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8(block: InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8 = InlineV1AccountSessionsPostRequestFormComponentsFeaturesX8ece1cb8.build(block)
