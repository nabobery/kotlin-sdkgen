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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_fields_option
 */
@Serializable(with = PaymentPagesCheckoutSessionCustomFieldsOption.Serializer::class)
public class PaymentPagesCheckoutSessionCustomFieldsOption(
  /**
   * The label for the option, displayed to the customer. Up to 100 characters.
   */
  public val label: String,
  /**
   * The value for this option, not displayed to the customer, used by your integration to reconcile the option selected
   * by the customer. Must be unique to this option, alphanumeric, and up to 100 characters.
   */
  public val `value`: String,
) {
  public class Builder {
    private var labelValue: String? = null

    public var label: String
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): PaymentPagesCheckoutSessionCustomFieldsOption {
      check(labelValue != null) { "label is required" }
      check(valueValue != null) { "value is required" }
      return PaymentPagesCheckoutSessionCustomFieldsOption(
        label = label,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCustomFieldsOption = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionCustomFieldsOption> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCustomFieldsOption {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCustomFieldsOption")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionCustomFieldsOption must be a JSON object")
      val label = json.decodeRequired<String>(rawObject, "label")
      val value = json.decodeRequired<String>(rawObject, "value")
      return PaymentPagesCheckoutSessionCustomFieldsOption(
        label = label,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionCustomFieldsOption) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCustomFieldsOption")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("label", value.label)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionCustomFieldsOption(block: PaymentPagesCheckoutSessionCustomFieldsOption.Builder.() -> Unit): PaymentPagesCheckoutSessionCustomFieldsOption = PaymentPagesCheckoutSessionCustomFieldsOption.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionCustomFieldsOption is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
