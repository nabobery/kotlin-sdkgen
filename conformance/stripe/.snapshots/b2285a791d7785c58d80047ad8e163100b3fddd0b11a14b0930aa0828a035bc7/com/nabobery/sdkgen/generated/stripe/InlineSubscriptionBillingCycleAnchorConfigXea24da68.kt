package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSubscriptionBillingCycleAnchorConfigXea24da68Branch {
  SubscriptionsResourceBillingCycleAnchorConfig,
}

public sealed class InlineSubscriptionBillingCycleAnchorConfigXea24da68DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionBillingCycleAnchorConfigXea24da68NoMatchException(
  message: String,
) : InlineSubscriptionBillingCycleAnchorConfigXea24da68DecodingException(message)

internal data class InlineSubscriptionBillingCycleAnchorConfigXea24da68Inspection(
  public val matchesSubscriptionsResourceBillingCycleAnchorConfig: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionsResourceBillingCycleAnchorConfig).count { it }
}

/**
 * The fixed values used to calculate the `billing_cycle_anchor`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/billing_cycle_anchor_config
 */
@Serializable(with = InlineSubscriptionBillingCycleAnchorConfigXea24da68.Serializer::class)
public class InlineSubscriptionBillingCycleAnchorConfigXea24da68 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionBillingCycleAnchorConfigXea24da68Inspection,
) {
  public val subscriptionsResourceBillingCycleAnchorConfig:
      SubscriptionsResourceBillingCycleAnchorConfigView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionsResourceBillingCycleAnchorConfig) json.decodeFromJsonElement<SubscriptionsResourceBillingCycleAnchorConfigView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionBillingCycleAnchorConfigXea24da68Branch>
    get() = buildSet {
      if (inspection.matchesSubscriptionsResourceBillingCycleAnchorConfig) add(InlineSubscriptionBillingCycleAnchorConfigXea24da68Branch.SubscriptionsResourceBillingCycleAnchorConfig)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionBillingCycleAnchorConfigXea24da68 {
      val inspection = inspectInlineSubscriptionBillingCycleAnchorConfigXea24da68(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionBillingCycleAnchorConfigXea24da68NoMatchException("InlineSubscriptionBillingCycleAnchorConfigXea24da68 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionBillingCycleAnchorConfigXea24da68(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionBillingCycleAnchorConfigXea24da68> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionBillingCycleAnchorConfigXea24da68 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionBillingCycleAnchorConfigXea24da68")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionBillingCycleAnchorConfigXea24da68) {
      encoder.requireJsonEncoder("InlineSubscriptionBillingCycleAnchorConfigXea24da68").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionBillingCycleAnchorConfigXea24da68(element: JsonElement): InlineSubscriptionBillingCycleAnchorConfigXea24da68Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionBillingCycleAnchorConfigXea24da68Inspection(
    matchesSubscriptionsResourceBillingCycleAnchorConfig = false,
    failures = listOf("SubscriptionsResourceBillingCycleAnchorConfig: expected JSON object"),
  )
  val matchesSubscriptionsResourceBillingCycleAnchorConfig = raw["day_of_month"] != null
  return InlineSubscriptionBillingCycleAnchorConfigXea24da68Inspection(
    matchesSubscriptionsResourceBillingCycleAnchorConfig = matchesSubscriptionsResourceBillingCycleAnchorConfig,
    failures = buildList {
      if (!matchesSubscriptionsResourceBillingCycleAnchorConfig) add("SubscriptionsResourceBillingCycleAnchorConfig: required properties 'day_of_month' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
