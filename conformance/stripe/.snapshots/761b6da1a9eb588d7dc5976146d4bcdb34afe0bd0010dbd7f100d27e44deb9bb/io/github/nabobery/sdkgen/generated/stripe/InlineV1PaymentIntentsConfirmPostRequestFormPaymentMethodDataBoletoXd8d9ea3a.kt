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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/boleto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/boleto
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a(
  public val taxId: String,
) {
  public class Builder {
    private var taxIdValue: String? = null

    public var taxId: String
      get() = requireNotNull(taxIdValue) { "taxId is required" }
      set(`value`) {
        taxIdValue = value
      }

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a {
      check(taxIdValue != null) { "taxId is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a(
        taxId = taxId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a must be a JSON object")
      val taxId = json.decodeRequired<String>(rawObject, "tax_id")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a(
        taxId = taxId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tax_id", value.taxId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataBoletoXd8d9ea3a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
