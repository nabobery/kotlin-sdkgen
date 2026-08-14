package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/upi/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/upi/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93(
  public val amount: Int? = null,
  public val amountType: InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX4d68164f? = null,
  public val description: String? = null,
  public val endDate: Int? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var amountType: InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX4d68164f? = null

    public var description: String? = null

    public var endDate: Int? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93 = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93(
      amount = amount,
      amountType = amountType,
      description = description,
      endDate = endDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX4d68164f>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93(block: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93 = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsXceda3e93.build(block)
