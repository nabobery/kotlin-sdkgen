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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/p24.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/p24
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6(
  public val bank:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb? = null,
) {
  public class Builder {
    public var bank: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb? =
        null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6 = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6 must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6 = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24X25dc44b6.build(block)
