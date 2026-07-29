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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_fields_text
 */
@Serializable(with = PaymentPagesCheckoutSessionCustomFieldsText.Serializer::class)
public class PaymentPagesCheckoutSessionCustomFieldsText(
  /**
   * The value that pre-fills the field on the payment page.
   */
  public val defaultValue: String? = null,
  /**
   * The maximum character length constraint for the customer's input.
   */
  public val maximumLength: Int? = null,
  /**
   * The minimum character length requirement for the customer's input.
   */
  public val minimumLength: Int? = null,
  /**
   * The value entered by the customer.
   */
  public val `value`: String? = null,
) {
  public class Builder {
    /**
     * The value that pre-fills the field on the payment page.
     */
    public var defaultValue: String? = null

    /**
     * The maximum character length constraint for the customer's input.
     */
    public var maximumLength: Int? = null

    /**
     * The minimum character length requirement for the customer's input.
     */
    public var minimumLength: Int? = null

    /**
     * The value entered by the customer.
     */
    public var `value`: String? = null

    public fun build(): PaymentPagesCheckoutSessionCustomFieldsText = PaymentPagesCheckoutSessionCustomFieldsText(
      defaultValue = defaultValue,
      maximumLength = maximumLength,
      minimumLength = minimumLength,
      value = value,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCustomFieldsText = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentPagesCheckoutSessionCustomFieldsText> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCustomFieldsText {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCustomFieldsText")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionCustomFieldsText must be a JSON object")
      return PaymentPagesCheckoutSessionCustomFieldsText(
        defaultValue = rawObject["default_value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        maximumLength = rawObject["maximum_length"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        minimumLength = rawObject["minimum_length"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        value = rawObject["value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionCustomFieldsText) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCustomFieldsText")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultValue?.let { put("default_value", it) }
        value.maximumLength?.let { put("maximum_length", json.encodeToJsonElement(it)) }
        value.minimumLength?.let { put("minimum_length", json.encodeToJsonElement(it)) }
        value.value?.let { put("value", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionCustomFieldsText(block: PaymentPagesCheckoutSessionCustomFieldsText.Builder.() -> Unit): PaymentPagesCheckoutSessionCustomFieldsText = PaymentPagesCheckoutSessionCustomFieldsText.build(block)
