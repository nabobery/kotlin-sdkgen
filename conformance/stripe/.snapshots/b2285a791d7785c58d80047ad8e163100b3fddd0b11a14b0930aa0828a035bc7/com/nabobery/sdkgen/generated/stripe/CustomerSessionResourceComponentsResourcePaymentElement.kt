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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * This hash contains whether the Payment Element is enabled and the features it supports.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_payment_element
 */
@Serializable(with = CustomerSessionResourceComponentsResourcePaymentElement.Serializer::class)
public class CustomerSessionResourceComponentsResourcePaymentElement(
  /**
   * Whether the Payment Element is enabled.
   */
  public val enabled: Boolean,
  /**
   * This hash defines whether the Payment Element supports certain features.
   */
  public val features:
      InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    /**
     * This hash defines whether the Payment Element supports certain features.
     */
    public var features:
        InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8? = null

    public fun build(): CustomerSessionResourceComponentsResourcePaymentElement {
      check(enabledValue != null) { "enabled is required" }
      return CustomerSessionResourceComponentsResourcePaymentElement(
        enabled = enabled,
        features = features,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerSessionResourceComponentsResourcePaymentElement = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomerSessionResourceComponentsResourcePaymentElement> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerSessionResourceComponentsResourcePaymentElement {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerSessionResourceComponentsResourcePaymentElement")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerSessionResourceComponentsResourcePaymentElement must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return CustomerSessionResourceComponentsResourcePaymentElement(
        enabled = enabled,
        features = rawObject["features"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerSessionResourceComponentsResourcePaymentElement) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerSessionResourceComponentsResourcePaymentElement")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.features?.let { put("features", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerSessionResourceComponentsResourcePaymentElement(block: CustomerSessionResourceComponentsResourcePaymentElement.Builder.() -> Unit): CustomerSessionResourceComponentsResourcePaymentElement = CustomerSessionResourceComponentsResourcePaymentElement.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerSessionResourceComponentsResourcePaymentElement is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
