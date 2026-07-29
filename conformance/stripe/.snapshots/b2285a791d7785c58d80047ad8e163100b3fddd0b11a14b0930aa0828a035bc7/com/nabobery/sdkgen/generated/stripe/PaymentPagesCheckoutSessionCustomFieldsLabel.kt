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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_fields_label
 */
@Serializable(with = PaymentPagesCheckoutSessionCustomFieldsLabel.Serializer::class)
public class PaymentPagesCheckoutSessionCustomFieldsLabel(
  /**
   * The type of the label.
   */
  public val type: InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251,
  /**
   * Custom text for the label, displayed to the customer. Up to 50 characters.
   */
  public val custom: String? = null,
) {
  public class Builder {
    private var typeValue: InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251? = null

    public var type: InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Custom text for the label, displayed to the customer. Up to 50 characters.
     */
    public var custom: String? = null

    public fun build(): PaymentPagesCheckoutSessionCustomFieldsLabel {
      check(typeValue != null) { "type is required" }
      return PaymentPagesCheckoutSessionCustomFieldsLabel(
        type = type,
        custom = custom,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCustomFieldsLabel = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentPagesCheckoutSessionCustomFieldsLabel> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCustomFieldsLabel {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCustomFieldsLabel")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionCustomFieldsLabel must be a JSON object")
      val type = json.decodeRequired<InlinePaymentPagesCheckoutSessionCustomFieldsLabelTypeX04c14251>(rawObject, "type")
      return PaymentPagesCheckoutSessionCustomFieldsLabel(
        type = type,
        custom = rawObject["custom"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionCustomFieldsLabel) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCustomFieldsLabel")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.custom?.let { put("custom", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionCustomFieldsLabel(block: PaymentPagesCheckoutSessionCustomFieldsLabel.Builder.() -> Unit): PaymentPagesCheckoutSessionCustomFieldsLabel = PaymentPagesCheckoutSessionCustomFieldsLabel.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionCustomFieldsLabel is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
