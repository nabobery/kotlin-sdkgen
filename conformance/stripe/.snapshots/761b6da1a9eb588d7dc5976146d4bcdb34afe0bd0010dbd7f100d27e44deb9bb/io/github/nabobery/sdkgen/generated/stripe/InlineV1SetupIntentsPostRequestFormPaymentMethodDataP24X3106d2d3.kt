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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/p24.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/p24
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3(
  public val bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24BankXf7f659ad? = null,
) {
  public class Builder {
    public var bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24BankXf7f659ad? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24BankXf7f659ad>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataP24X3106d2d3.build(block)
