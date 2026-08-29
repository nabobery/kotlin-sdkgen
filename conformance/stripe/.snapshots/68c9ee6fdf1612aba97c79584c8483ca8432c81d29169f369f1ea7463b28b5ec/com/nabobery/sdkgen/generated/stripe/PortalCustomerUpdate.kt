package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_customer_update
 */
@Serializable(with = PortalCustomerUpdate.Serializer::class)
public class PortalCustomerUpdate(
  allowedUpdates: List<InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a>,
  /**
   * Whether the feature is enabled.
   */
  public val enabled: Boolean,
) {
  /**
   * The types of customer updates that are supported. When empty, customers are not updateable.
   */
  public val allowedUpdates: List<InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a> =
      allowedUpdates.toList()

  public class Builder {
    private var allowedUpdatesValue: List<InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a>? =
        null

    public var allowedUpdates: List<InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a>
      get() = requireNotNull(allowedUpdatesValue) { "allowedUpdates is required" }.toList()
      set(`value`) {
        allowedUpdatesValue = value.toList()
      }

    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): PortalCustomerUpdate {
      check(allowedUpdatesValue != null) { "allowedUpdates is required" }
      check(enabledValue != null) { "enabled is required" }
      return PortalCustomerUpdate(
        allowedUpdates = allowedUpdates,
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalCustomerUpdate = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalCustomerUpdate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalCustomerUpdate {
      val jsonDecoder = decoder.requireJsonDecoder("PortalCustomerUpdate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalCustomerUpdate must be a JSON object")
      val allowedUpdates = json.decodeRequired<List<InlinePortalCustomerUpdateAllowedUpdatesItemXc0dd315a>>(rawObject, "allowed_updates")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PortalCustomerUpdate(
        allowedUpdates = allowedUpdates,
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalCustomerUpdate) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalCustomerUpdate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("allowed_updates", json.encodeToJsonElement(value.allowedUpdates))
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalCustomerUpdate(block: PortalCustomerUpdate.Builder.() -> Unit): PortalCustomerUpdate = PortalCustomerUpdate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalCustomerUpdate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
