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
 * This hash contains whether the buy button is enabled.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_buy_button
 */
@Serializable(with = CustomerSessionResourceComponentsResourceBuyButton.Serializer::class)
public class CustomerSessionResourceComponentsResourceBuyButton(
  /**
   * Whether the buy button is enabled.
   */
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): CustomerSessionResourceComponentsResourceBuyButton {
      check(enabledValue != null) { "enabled is required" }
      return CustomerSessionResourceComponentsResourceBuyButton(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerSessionResourceComponentsResourceBuyButton = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomerSessionResourceComponentsResourceBuyButton> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerSessionResourceComponentsResourceBuyButton {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerSessionResourceComponentsResourceBuyButton")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerSessionResourceComponentsResourceBuyButton must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return CustomerSessionResourceComponentsResourceBuyButton(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerSessionResourceComponentsResourceBuyButton) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerSessionResourceComponentsResourceBuyButton")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerSessionResourceComponentsResourceBuyButton(block: CustomerSessionResourceComponentsResourceBuyButton.Builder.() -> Unit): CustomerSessionResourceComponentsResourceBuyButton = CustomerSessionResourceComponentsResourceBuyButton.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerSessionResourceComponentsResourceBuyButton is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
