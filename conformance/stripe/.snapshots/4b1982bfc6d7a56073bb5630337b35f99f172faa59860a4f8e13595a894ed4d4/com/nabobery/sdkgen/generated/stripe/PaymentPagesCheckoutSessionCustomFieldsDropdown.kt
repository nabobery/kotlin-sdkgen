package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_fields_dropdown
 */
@Serializable(with = PaymentPagesCheckoutSessionCustomFieldsDropdown.Serializer::class)
public class PaymentPagesCheckoutSessionCustomFieldsDropdown(
  options: List<PaymentPagesCheckoutSessionCustomFieldsOption>,
  /**
   * The value that pre-fills on the payment page.
   */
  public val defaultValue: String? = null,
  /**
   * The option selected by the customer. This will be the `value` for the option.
   */
  public val `value`: String? = null,
) {
  /**
   * The options available for the customer to select. Up to 200 options allowed.
   */
  public val options: List<PaymentPagesCheckoutSessionCustomFieldsOption> = options.toList()

  public class Builder {
    private var optionsValue: List<PaymentPagesCheckoutSessionCustomFieldsOption>? = null

    public var options: List<PaymentPagesCheckoutSessionCustomFieldsOption>
      get() = requireNotNull(optionsValue) { "options is required" }.toList()
      set(`value`) {
        optionsValue = value.toList()
      }

    /**
     * The value that pre-fills on the payment page.
     */
    public var defaultValue: String? = null

    /**
     * The option selected by the customer. This will be the `value` for the option.
     */
    public var `value`: String? = null

    public fun build(): PaymentPagesCheckoutSessionCustomFieldsDropdown {
      check(optionsValue != null) { "options is required" }
      return PaymentPagesCheckoutSessionCustomFieldsDropdown(
        options = options,
        defaultValue = defaultValue,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCustomFieldsDropdown = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionCustomFieldsDropdown> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCustomFieldsDropdown {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCustomFieldsDropdown")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionCustomFieldsDropdown must be a JSON object")
      val options = json.decodeRequired<List<PaymentPagesCheckoutSessionCustomFieldsOption>>(rawObject, "options")
      return PaymentPagesCheckoutSessionCustomFieldsDropdown(
        options = options,
        defaultValue = rawObject["default_value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        value = rawObject["value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionCustomFieldsDropdown) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCustomFieldsDropdown")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("options", json.encodeToJsonElement(value.options))
        value.defaultValue?.let { put("default_value", it) }
        value.value?.let { put("value", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionCustomFieldsDropdown(block: PaymentPagesCheckoutSessionCustomFieldsDropdown.Builder.() -> Unit): PaymentPagesCheckoutSessionCustomFieldsDropdown = PaymentPagesCheckoutSessionCustomFieldsDropdown.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionCustomFieldsDropdown is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
