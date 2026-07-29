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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_fields_numeric
 */
@Serializable(with = PaymentLinksResourceCustomFieldsNumeric.Serializer::class)
public class PaymentLinksResourceCustomFieldsNumeric(
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

    public fun build(): PaymentLinksResourceCustomFieldsNumeric = PaymentLinksResourceCustomFieldsNumeric(
      defaultValue = defaultValue,
      maximumLength = maximumLength,
      minimumLength = minimumLength,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceCustomFieldsNumeric = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentLinksResourceCustomFieldsNumeric> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceCustomFieldsNumeric {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceCustomFieldsNumeric")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceCustomFieldsNumeric must be a JSON object")
      return PaymentLinksResourceCustomFieldsNumeric(
        defaultValue = rawObject["default_value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        maximumLength = rawObject["maximum_length"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        minimumLength = rawObject["minimum_length"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceCustomFieldsNumeric) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceCustomFieldsNumeric")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultValue?.let { put("default_value", it) }
        value.maximumLength?.let { put("maximum_length", json.encodeToJsonElement(it)) }
        value.minimumLength?.let { put("minimum_length", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceCustomFieldsNumeric(block: PaymentLinksResourceCustomFieldsNumeric.Builder.() -> Unit): PaymentLinksResourceCustomFieldsNumeric = PaymentLinksResourceCustomFieldsNumeric.build(block)
