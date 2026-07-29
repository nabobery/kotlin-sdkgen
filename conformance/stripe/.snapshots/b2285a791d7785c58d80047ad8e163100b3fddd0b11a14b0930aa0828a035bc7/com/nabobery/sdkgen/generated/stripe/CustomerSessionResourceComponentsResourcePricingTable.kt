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
 * This hash contains whether the pricing table is enabled.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_pricing_table
 */
@Serializable(with = CustomerSessionResourceComponentsResourcePricingTable.Serializer::class)
public class CustomerSessionResourceComponentsResourcePricingTable(
  /**
   * Whether the pricing table is enabled.
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

    public fun build(): CustomerSessionResourceComponentsResourcePricingTable {
      check(enabledValue != null) { "enabled is required" }
      return CustomerSessionResourceComponentsResourcePricingTable(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerSessionResourceComponentsResourcePricingTable = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomerSessionResourceComponentsResourcePricingTable> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerSessionResourceComponentsResourcePricingTable {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerSessionResourceComponentsResourcePricingTable")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerSessionResourceComponentsResourcePricingTable must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return CustomerSessionResourceComponentsResourcePricingTable(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerSessionResourceComponentsResourcePricingTable) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerSessionResourceComponentsResourcePricingTable")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerSessionResourceComponentsResourcePricingTable(block: CustomerSessionResourceComponentsResourcePricingTable.Builder.() -> Unit): CustomerSessionResourceComponentsResourcePricingTable = CustomerSessionResourceComponentsResourcePricingTable.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerSessionResourceComponentsResourcePricingTable is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
