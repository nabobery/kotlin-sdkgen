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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/ideal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/ideal
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e(
  public val bank:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealBankX8b546f49? = null,
) {
  public class Builder {
    public var bank: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealBankX8b546f49?
        = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealBankX8b546f49>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataIdealXf2867c3e.build(block)
