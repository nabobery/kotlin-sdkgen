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
 * chema/properties/payment_method_data/properties/p24.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/p24
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131(
  public val bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24BankX828791f9? = null,
) {
  public class Builder {
    public var bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24BankX828791f9? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24BankX828791f9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X4324f131.build(block)
