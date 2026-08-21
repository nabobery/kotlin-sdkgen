package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/tax
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f(
  public val totalTaxAmount: Int,
) {
  public class Builder {
    private var totalTaxAmountValue: Int? = null

    public var totalTaxAmount: Int
      get() = requireNotNull(totalTaxAmountValue) { "totalTaxAmount is required" }
      set(`value`) {
        totalTaxAmountValue = value
      }

    public fun build(): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f {
      check(totalTaxAmountValue != null) { "totalTaxAmount is required" }
      return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f(
        totalTaxAmount = totalTaxAmount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f must be a JSON object")
      val totalTaxAmount = json.decodeRequired<Int>(rawObject, "total_tax_amount")
      return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f(
        totalTaxAmount = totalTaxAmount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_tax_amount", json.encodeToJsonElement(value.totalTaxAmount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f(block: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f.Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsTaxXd42e8f0f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
