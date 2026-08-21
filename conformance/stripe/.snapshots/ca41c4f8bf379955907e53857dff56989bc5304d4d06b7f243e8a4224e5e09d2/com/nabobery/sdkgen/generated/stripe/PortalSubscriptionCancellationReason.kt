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
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_subscription_cancellation_reason
 */
@Serializable(with = PortalSubscriptionCancellationReason.Serializer::class)
public class PortalSubscriptionCancellationReason(
  /**
   * Whether the feature is enabled.
   */
  public val enabled: Boolean,
  options: List<InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95>,
) {
  /**
   * Which cancellation reasons will be given as options to the customer.
   */
  public val options: List<InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95> =
      options.toList()

  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var optionsValue: List<InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95>?
        = null

    public var options: List<InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95>
      get() = requireNotNull(optionsValue) { "options is required" }.toList()
      set(`value`) {
        optionsValue = value.toList()
      }

    public fun build(): PortalSubscriptionCancellationReason {
      check(enabledValue != null) { "enabled is required" }
      check(optionsValue != null) { "options is required" }
      return PortalSubscriptionCancellationReason(
        enabled = enabled,
        options = options,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalSubscriptionCancellationReason = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalSubscriptionCancellationReason> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalSubscriptionCancellationReason {
      val jsonDecoder = decoder.requireJsonDecoder("PortalSubscriptionCancellationReason")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalSubscriptionCancellationReason must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val options = json.decodeRequired<List<InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95>>(rawObject, "options")
      return PortalSubscriptionCancellationReason(
        enabled = enabled,
        options = options,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalSubscriptionCancellationReason) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalSubscriptionCancellationReason")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("options", json.encodeToJsonElement(value.options))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalSubscriptionCancellationReason(block: PortalSubscriptionCancellationReason.Builder.() -> Unit): PortalSubscriptionCancellationReason = PortalSubscriptionCancellationReason.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalSubscriptionCancellationReason is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
