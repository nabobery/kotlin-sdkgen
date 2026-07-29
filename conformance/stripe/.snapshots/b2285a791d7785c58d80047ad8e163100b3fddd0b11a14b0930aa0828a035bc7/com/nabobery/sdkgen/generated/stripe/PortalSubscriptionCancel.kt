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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_subscription_cancel
 */
@Serializable(with = PortalSubscriptionCancel.Serializer::class)
public class PortalSubscriptionCancel(
  public val cancellationReason: PortalSubscriptionCancellationReason,
  /**
   * Whether the feature is enabled.
   */
  public val enabled: Boolean,
  /**
   * Whether to cancel subscriptions immediately or at the end of the billing period.
   */
  public val mode: InlinePortalSubscriptionCancelModeX54b9776b,
  /**
   * Whether to create prorations when canceling subscriptions. Possible values are `none` and `create_prorations`.
   */
  public val prorationBehavior: InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50,
) {
  public class Builder {
    private var cancellationReasonValue: PortalSubscriptionCancellationReason? = null

    public var cancellationReason: PortalSubscriptionCancellationReason
      get() = requireNotNull(cancellationReasonValue) { "cancellationReason is required" }
      set(`value`) {
        cancellationReasonValue = value
      }

    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var modeValue: InlinePortalSubscriptionCancelModeX54b9776b? = null

    public var mode: InlinePortalSubscriptionCancelModeX54b9776b
      get() = requireNotNull(modeValue) { "mode is required" }
      set(`value`) {
        modeValue = value
      }

    private var prorationBehaviorValue: InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50? =
        null

    public var prorationBehavior: InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50
      get() = requireNotNull(prorationBehaviorValue) { "prorationBehavior is required" }
      set(`value`) {
        prorationBehaviorValue = value
      }

    public fun build(): PortalSubscriptionCancel {
      check(cancellationReasonValue != null) { "cancellationReason is required" }
      check(enabledValue != null) { "enabled is required" }
      check(modeValue != null) { "mode is required" }
      check(prorationBehaviorValue != null) { "prorationBehavior is required" }
      return PortalSubscriptionCancel(
        cancellationReason = cancellationReason,
        enabled = enabled,
        mode = mode,
        prorationBehavior = prorationBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalSubscriptionCancel = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PortalSubscriptionCancel> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalSubscriptionCancel {
      val jsonDecoder = decoder.requireJsonDecoder("PortalSubscriptionCancel")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalSubscriptionCancel must be a JSON object")
      val cancellationReason = json.decodeRequired<PortalSubscriptionCancellationReason>(rawObject, "cancellation_reason")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val mode = json.decodeRequired<InlinePortalSubscriptionCancelModeX54b9776b>(rawObject, "mode")
      val prorationBehavior = json.decodeRequired<InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50>(rawObject, "proration_behavior")
      return PortalSubscriptionCancel(
        cancellationReason = cancellationReason,
        enabled = enabled,
        mode = mode,
        prorationBehavior = prorationBehavior,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalSubscriptionCancel) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalSubscriptionCancel")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cancellation_reason", json.encodeToJsonElement(value.cancellationReason))
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("mode", json.encodeToJsonElement(value.mode))
        put("proration_behavior", json.encodeToJsonElement(value.prorationBehavior))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalSubscriptionCancel(block: PortalSubscriptionCancel.Builder.() -> Unit): PortalSubscriptionCancel = PortalSubscriptionCancel.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalSubscriptionCancel is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
