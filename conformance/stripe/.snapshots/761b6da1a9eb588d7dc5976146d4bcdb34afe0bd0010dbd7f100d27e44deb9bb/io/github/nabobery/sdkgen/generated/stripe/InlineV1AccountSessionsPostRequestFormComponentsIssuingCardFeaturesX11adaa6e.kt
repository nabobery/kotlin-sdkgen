package io.github.nabobery.sdkgen.generated.stripe

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
 * d/schema/properties/components/properties/issuing_card/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/issuing_card/properties/features
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e(
  public val cardManagement: Boolean? = null,
  public val cardSpendDisputeManagement: Boolean? = null,
  public val cardholderManagement: Boolean? = null,
  public val spendControlManagement: Boolean? = null,
) {
  public class Builder {
    public var cardManagement: Boolean? = null

    public var cardSpendDisputeManagement: Boolean? = null

    public var cardholderManagement: Boolean? = null

    public var spendControlManagement: Boolean? = null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e = InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e(
      cardManagement = cardManagement,
      cardSpendDisputeManagement = cardSpendDisputeManagement,
      cardholderManagement = cardholderManagement,
      spendControlManagement = spendControlManagement,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e must be a JSON object")
      return InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e(
        cardManagement = rawObject["card_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        cardSpendDisputeManagement = rawObject["card_spend_dispute_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        cardholderManagement = rawObject["cardholder_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        spendControlManagement = rawObject["spend_control_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardManagement?.let { put("card_management", json.encodeToJsonElement(it)) }
        value.cardSpendDisputeManagement?.let { put("card_spend_dispute_management", json.encodeToJsonElement(it)) }
        value.cardholderManagement?.let { put("cardholder_management", json.encodeToJsonElement(it)) }
        value.spendControlManagement?.let { put("spend_control_management", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e(block: InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e = InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e.build(block)
