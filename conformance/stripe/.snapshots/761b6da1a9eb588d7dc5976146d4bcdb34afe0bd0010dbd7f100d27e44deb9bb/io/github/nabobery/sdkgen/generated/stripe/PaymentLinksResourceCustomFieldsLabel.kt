package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_fields_label
 */
@Serializable(with = PaymentLinksResourceCustomFieldsLabel.Serializer::class)
public class PaymentLinksResourceCustomFieldsLabel(
  /**
   * The type of the label.
   */
  public val type: InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100,
  /**
   * Custom text for the label, displayed to the customer. Up to 50 characters.
   */
  public val custom: String? = null,
) {
  public class Builder {
    private var typeValue: InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100? = null

    public var type: InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Custom text for the label, displayed to the customer. Up to 50 characters.
     */
    public var custom: String? = null

    public fun build(): PaymentLinksResourceCustomFieldsLabel {
      check(typeValue != null) { "type is required" }
      return PaymentLinksResourceCustomFieldsLabel(
        type = type,
        custom = custom,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceCustomFieldsLabel = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceCustomFieldsLabel> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceCustomFieldsLabel {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceCustomFieldsLabel")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceCustomFieldsLabel must be a JSON object")
      val type = json.decodeRequired<InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100>(rawObject, "type")
      return PaymentLinksResourceCustomFieldsLabel(
        type = type,
        custom = rawObject["custom"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceCustomFieldsLabel) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceCustomFieldsLabel")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.custom?.let { put("custom", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceCustomFieldsLabel(block: PaymentLinksResourceCustomFieldsLabel.Builder.() -> Unit): PaymentLinksResourceCustomFieldsLabel = PaymentLinksResourceCustomFieldsLabel.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceCustomFieldsLabel is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
