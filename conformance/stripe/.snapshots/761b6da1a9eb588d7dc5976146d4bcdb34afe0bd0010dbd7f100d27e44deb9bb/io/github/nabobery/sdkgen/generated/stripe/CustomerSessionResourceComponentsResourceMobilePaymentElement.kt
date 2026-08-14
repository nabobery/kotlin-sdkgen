package io.github.nabobery.sdkgen.generated.stripe

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
 * This hash contains whether the mobile payment element is enabled and the features it supports.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_mobile_payment_element
 */
@Serializable(with = CustomerSessionResourceComponentsResourceMobilePaymentElement.Serializer::class)
public class CustomerSessionResourceComponentsResourceMobilePaymentElement(
  /**
   * Whether the mobile payment element is enabled.
   */
  public val enabled: Boolean,
  /**
   * This hash defines whether the mobile payment element supports certain features.
   */
  public val features: InlineCustomerSessionResou2ffcFeaturesX4813c261? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    /**
     * This hash defines whether the mobile payment element supports certain features.
     */
    public var features: InlineCustomerSessionResou2ffcFeaturesX4813c261? = null

    public fun build(): CustomerSessionResourceComponentsResourceMobilePaymentElement {
      check(enabledValue != null) { "enabled is required" }
      return CustomerSessionResourceComponentsResourceMobilePaymentElement(
        enabled = enabled,
        features = features,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerSessionResourceComponentsResourceMobilePaymentElement = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomerSessionResourceComponentsResourceMobilePaymentElement> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerSessionResourceComponentsResourceMobilePaymentElement {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerSessionResourceComponentsResourceMobilePaymentElement")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerSessionResourceComponentsResourceMobilePaymentElement must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return CustomerSessionResourceComponentsResourceMobilePaymentElement(
        enabled = enabled,
        features = rawObject["features"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerSessionResou2ffcFeaturesX4813c261?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerSessionResourceComponentsResourceMobilePaymentElement) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerSessionResourceComponentsResourceMobilePaymentElement")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.features?.let { put("features", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerSessionResourceComponentsResourceMobilePaymentElement(block: CustomerSessionResourceComponentsResourceMobilePaymentElement.Builder.() -> Unit): CustomerSessionResourceComponentsResourceMobilePaymentElement = CustomerSessionResourceComponentsResourceMobilePaymentElement.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerSessionResourceComponentsResourceMobilePaymentElement is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
