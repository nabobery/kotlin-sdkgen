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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/naver_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/naver_pay
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413(
  public val funding:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81? = null,
) {
  public class Builder {
    public var funding:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413(
      funding = funding,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413(
        funding = rawObject["funding"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingX89551c81>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.funding?.let { put("funding", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayXd7447413.build(block)
