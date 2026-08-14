package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/fpx.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/fpx
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b(
  public val bank: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxBankXa73f8928,
) {
  public class Builder {
    private var bankValue:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxBankXa73f8928? = null

    public var bank: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxBankXa73f8928
      get() = requireNotNull(bankValue) { "bank is required" }
      set(`value`) {
        bankValue = value
      }

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b {
      check(bankValue != null) { "bank is required" }
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b(
        bank = bank,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b must be a JSON object")
      val bank = json.decodeRequired<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxBankXa73f8928>(rawObject, "bank")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b(
        bank = bank,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bank", json.encodeToJsonElement(value.bank))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFpxX8a9f046b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
