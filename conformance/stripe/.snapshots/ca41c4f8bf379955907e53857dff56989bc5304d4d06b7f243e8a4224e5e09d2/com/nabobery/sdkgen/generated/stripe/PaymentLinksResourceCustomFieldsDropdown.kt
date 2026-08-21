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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_fields_dropdown
 */
@Serializable(with = PaymentLinksResourceCustomFieldsDropdown.Serializer::class)
public class PaymentLinksResourceCustomFieldsDropdown(
  options: List<PaymentLinksResourceCustomFieldsDropdownOption>,
  /**
   * The value that pre-fills on the payment page.
   */
  public val defaultValue: String? = null,
) {
  /**
   * The options available for the customer to select. Up to 200 options allowed.
   */
  public val options: List<PaymentLinksResourceCustomFieldsDropdownOption> = options.toList()

  public class Builder {
    private var optionsValue: List<PaymentLinksResourceCustomFieldsDropdownOption>? = null

    public var options: List<PaymentLinksResourceCustomFieldsDropdownOption>
      get() = requireNotNull(optionsValue) { "options is required" }.toList()
      set(`value`) {
        optionsValue = value.toList()
      }

    /**
     * The value that pre-fills on the payment page.
     */
    public var defaultValue: String? = null

    public fun build(): PaymentLinksResourceCustomFieldsDropdown {
      check(optionsValue != null) { "options is required" }
      return PaymentLinksResourceCustomFieldsDropdown(
        options = options,
        defaultValue = defaultValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceCustomFieldsDropdown = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceCustomFieldsDropdown> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceCustomFieldsDropdown {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceCustomFieldsDropdown")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceCustomFieldsDropdown must be a JSON object")
      val options = json.decodeRequired<List<PaymentLinksResourceCustomFieldsDropdownOption>>(rawObject, "options")
      return PaymentLinksResourceCustomFieldsDropdown(
        options = options,
        defaultValue = rawObject["default_value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceCustomFieldsDropdown) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceCustomFieldsDropdown")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("options", json.encodeToJsonElement(value.options))
        value.defaultValue?.let { put("default_value", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceCustomFieldsDropdown(block: PaymentLinksResourceCustomFieldsDropdown.Builder.() -> Unit): PaymentLinksResourceCustomFieldsDropdown = PaymentLinksResourceCustomFieldsDropdown.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceCustomFieldsDropdown is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
