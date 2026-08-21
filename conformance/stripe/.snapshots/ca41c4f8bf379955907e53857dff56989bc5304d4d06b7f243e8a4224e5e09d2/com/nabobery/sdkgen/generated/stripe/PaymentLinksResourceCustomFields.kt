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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_fields
 */
@Serializable(with = PaymentLinksResourceCustomFields.Serializer::class)
public class PaymentLinksResourceCustomFields(
  /**
   * String of your choice that your integration can use to reconcile this field. Must be unique to this field,
   * alphanumeric, and up to 200 characters.
   */
  public val key: String,
  public val label: PaymentLinksResourceCustomFieldsLabel,
  /**
   * Whether the customer is required to complete the field before completing the Checkout Session. Defaults to `false`.
   */
  public val optional: Boolean,
  /**
   * The type of the field.
   */
  public val type: InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e,
  public val dropdown: PaymentLinksResourceCustomFieldsDropdown? = null,
  public val numeric: PaymentLinksResourceCustomFieldsNumeric? = null,
  public val text: PaymentLinksResourceCustomFieldsText? = null,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var labelValue: PaymentLinksResourceCustomFieldsLabel? = null

    public var label: PaymentLinksResourceCustomFieldsLabel
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

    private var typeValue: InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e? = null

    public var type: InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var dropdown: PaymentLinksResourceCustomFieldsDropdown? = null

    public var numeric: PaymentLinksResourceCustomFieldsNumeric? = null

    public var text: PaymentLinksResourceCustomFieldsText? = null

    public fun build(): PaymentLinksResourceCustomFields {
      check(keyValue != null) { "key is required" }
      check(labelValue != null) { "label is required" }
      check(optionalValue != null) { "optional is required" }
      check(typeValue != null) { "type is required" }
      return PaymentLinksResourceCustomFields(
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
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceCustomFields = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceCustomFields> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceCustomFields {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceCustomFields")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceCustomFields must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val label = json.decodeRequired<PaymentLinksResourceCustomFieldsLabel>(rawObject, "label")
      val optional = json.decodeRequired<Boolean>(rawObject, "optional")
      val type = json.decodeRequired<InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e>(rawObject, "type")
      return PaymentLinksResourceCustomFields(
        key = key,
        label = label,
        optional = optional,
        type = type,
        dropdown = rawObject["dropdown"]?.let { json.decodeFromJsonElement<PaymentLinksResourceCustomFieldsDropdown>(it) },
        numeric = rawObject["numeric"]?.let { json.decodeFromJsonElement<PaymentLinksResourceCustomFieldsNumeric>(it) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<PaymentLinksResourceCustomFieldsText>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceCustomFields) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceCustomFields")
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

public fun paymentLinksResourceCustomFields(block: PaymentLinksResourceCustomFields.Builder.() -> Unit): PaymentLinksResourceCustomFields = PaymentLinksResourceCustomFields.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceCustomFields is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
