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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/boleto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/boleto
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4(
  public val taxId: String,
) {
  public class Builder {
    private var taxIdValue: String? = null

    public var taxId: String
      get() = requireNotNull(taxIdValue) { "taxId is required" }
      set(`value`) {
        taxIdValue = value
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4 {
      check(taxIdValue != null) { "taxId is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4(
        taxId = taxId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4 must be a JSON object")
      val taxId = json.decodeRequired<String>(rawObject, "tax_id")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4(
        taxId = taxId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tax_id", value.taxId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4 = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
