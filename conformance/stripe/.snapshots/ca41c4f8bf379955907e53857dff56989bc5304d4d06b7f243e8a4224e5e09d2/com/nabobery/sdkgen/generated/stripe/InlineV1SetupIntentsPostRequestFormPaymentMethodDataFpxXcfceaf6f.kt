package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/fpx.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/fpx
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f(
  public val bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX650db564,
) {
  public class Builder {
    private var bankValue: InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX650db564? =
        null

    public var bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX650db564
      get() = requireNotNull(bankValue) { "bank is required" }
      set(`value`) {
        bankValue = value
      }

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f {
      check(bankValue != null) { "bank is required" }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f(
        bank = bank,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f must be a JSON object")
      val bank = json.decodeRequired<InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX650db564>(rawObject, "bank")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f(
        bank = bank,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bank", json.encodeToJsonElement(value.bank))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f = InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxXcfceaf6f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
