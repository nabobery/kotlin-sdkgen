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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/eps.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/eps
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294(
  public val bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsBankX11cd3eb6? = null,
) {
  public class Builder {
    public var bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsBankX11cd3eb6? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsBankX11cd3eb6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataEpsX43356294.build(block)
