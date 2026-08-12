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

public enum class InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eBranch {
  PortalFlowsFlowSubscriptionUpdate,
}

public sealed class InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eNoMatchException(
  message: String,
) : InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eDecodingException(message)

internal data class InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eInspection(
  public val matchesPortalFlowsFlowSubscriptionUpdate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPortalFlowsFlowSubscriptionUpdate).count { it }
}

/**
 * Configuration when `flow.type=subscription_update`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow/properties/subscription_update
 */
@Serializable(with = InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e.Serializer::class)
public class InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eInspection,
) {
  public val portalFlowsFlowSubscriptionUpdate: PortalFlowsFlowSubscriptionUpdateView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPortalFlowsFlowSubscriptionUpdate) json.decodeFromJsonElement<PortalFlowsFlowSubscriptionUpdateView>(raw) else null }

  public val matchedBranches: Set<InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eBranch>
    get() = buildSet {
      if (inspection.matchesPortalFlowsFlowSubscriptionUpdate) add(InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eBranch.PortalFlowsFlowSubscriptionUpdate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e {
      val inspection = inspectInlinePortalFlowsFlowSubscriptionUpdateX2b2e419e(raw)
      if (inspection.matchCount == 0) {
        throw InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eNoMatchException("InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e) {
      encoder.requireJsonEncoder("InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePortalFlowsFlowSubscriptionUpdateX2b2e419e(element: JsonElement): InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eInspection {
  val raw = element as? JsonObject ?: return InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eInspection(
    matchesPortalFlowsFlowSubscriptionUpdate = false,
    failures = listOf("PortalFlowsFlowSubscriptionUpdate: expected JSON object"),
  )
  val matchesPortalFlowsFlowSubscriptionUpdate = raw["subscription"].isString()
  return InlinePortalFlowsFlowSubscriptionUpdateX2b2e419eInspection(
    matchesPortalFlowsFlowSubscriptionUpdate = matchesPortalFlowsFlowSubscriptionUpdate,
    failures = buildList {
      if (!matchesPortalFlowsFlowSubscriptionUpdate) add("PortalFlowsFlowSubscriptionUpdate: required properties 'subscription' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
