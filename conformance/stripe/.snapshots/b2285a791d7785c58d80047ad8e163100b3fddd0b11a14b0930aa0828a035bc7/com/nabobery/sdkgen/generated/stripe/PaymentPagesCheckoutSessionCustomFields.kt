package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_fields
 */
@Serializable(with = PaymentPagesCheckoutSessionCustomFields.Serializer::class)
public class PaymentPagesCheckoutSessionCustomFields(
  /**
   * String of your choice that your integration can use to reconcile this field. Must be unique to this field,
   * alphanumeric, and up to 200 characters.
   */
  public val key: String,
  public val label: PaymentPagesCheckoutSessionCustomFieldsLabel,
  /**
   * Whether the customer is required to complete the field before completing the Checkout Session. Defaults to `false`.
   */
  public val optional: Boolean,
  /**
   * The type of the field.
   */
  public val type: InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad,
  public val dropdown: PaymentPagesCheckoutSessionCustomFieldsDropdown? = null,
  public val numeric: PaymentPagesCheckoutSessionCustomFieldsNumeric? = null,
  public val text: PaymentPagesCheckoutSessionCustomFieldsText? = null,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var labelValue: PaymentPagesCheckoutSessionCustomFieldsLabel? = null

    public var label: PaymentPagesCheckoutSessionCustomFieldsLabel
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    private var optionalValue: Boolean? = null

    public var optional: Boolean
      get() = requireNotNull(optionalValue) { "optional is required" }
      set(`value`) {
        optionalValue = value
      }

    private var typeValue: InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad? = null

    public var type: InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var dropdown: PaymentPagesCheckoutSessionCustomFieldsDropdown? = null

    public var numeric: PaymentPagesCheckoutSessionCustomFieldsNumeric? = null

    public var text: PaymentPagesCheckoutSessionCustomFieldsText? = null

    public fun build(): PaymentPagesCheckoutSessionCustomFields {
      check(keyValue != null) { "key is required" }
      check(labelValue != null) { "label is required" }
      check(optionalValue != null) { "optional is required" }
      check(typeValue != null) { "type is required" }
      return PaymentPagesCheckoutSessionCustomFields(
        key = key,
        label = label,
        optional = optional,
        type = type,
        dropdown = dropdown,
        numeric = numeric,
        text = text,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCustomFields = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentPagesCheckoutSessionCustomFields> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCustomFields {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCustomFields")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionCustomFields must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val label = json.decodeRequired<PaymentPagesCheckoutSessionCustomFieldsLabel>(rawObject, "label")
      val optional = json.decodeRequired<Boolean>(rawObject, "optional")
      val type = json.decodeRequired<InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad>(rawObject, "type")
      return PaymentPagesCheckoutSessionCustomFields(
        key = key,
        label = label,
        optional = optional,
        type = type,
        dropdown = rawObject["dropdown"]?.let { json.decodeFromJsonElement<PaymentPagesCheckoutSessionCustomFieldsDropdown>(it) },
        numeric = rawObject["numeric"]?.let { json.decodeFromJsonElement<PaymentPagesCheckoutSessionCustomFieldsNumeric>(it) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<PaymentPagesCheckoutSessionCustomFieldsText>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionCustomFields) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCustomFields")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("label", json.encodeToJsonElement(value.label))
        put("optional", json.encodeToJsonElement(value.optional))
        put("type", json.encodeToJsonElement(value.type))
        value.dropdown?.let { put("dropdown", json.encodeToJsonElement(it)) }
        value.numeric?.let { put("numeric", json.encodeToJsonElement(it)) }
        value.text?.let { put("text", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionCustomFields(block: PaymentPagesCheckoutSessionCustomFields.Builder.() -> Unit): PaymentPagesCheckoutSessionCustomFields = PaymentPagesCheckoutSessionCustomFields.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionCustomFields is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
