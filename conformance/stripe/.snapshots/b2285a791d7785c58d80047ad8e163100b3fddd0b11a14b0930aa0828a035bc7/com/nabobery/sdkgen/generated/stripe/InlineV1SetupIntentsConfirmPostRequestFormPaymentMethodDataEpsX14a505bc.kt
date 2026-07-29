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
 * w-form-urlencoded/schema/properties/payment_method_data/properties/eps.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/eps
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc(
  public val bank:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsBankX6ff2d020? = null,
) {
  public class Builder {
    public var bank: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsBankX6ff2d020? =
        null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsBankX6ff2d020>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEpsX14a505bc.build(block)
