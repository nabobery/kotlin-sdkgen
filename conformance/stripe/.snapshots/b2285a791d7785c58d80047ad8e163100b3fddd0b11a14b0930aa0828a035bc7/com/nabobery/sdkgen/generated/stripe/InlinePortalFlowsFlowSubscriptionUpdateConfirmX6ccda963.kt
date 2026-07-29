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

public enum class InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963Branch {
  PortalFlowsFlowSubscriptionUpdateConfirm,
}

public sealed class InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963NoMatchException(
  message: String,
) : InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963DecodingException(message)

internal data class InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963Inspection(
  public val matchesPortalFlowsFlowSubscriptionUpdateConfirm: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPortalFlowsFlowSubscriptionUpdateConfirm).count { it }
}

/**
 * Configuration when `flow.type=subscription_update_confirm`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow/properties/subscription_update_confirm
 */
@Serializable(with = InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963.Serializer::class)
public class InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963Inspection,
) {
  public val portalFlowsFlowSubscriptionUpdateConfirm: PortalFlowsFlowSubscriptionUpdateConfirmView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPortalFlowsFlowSubscriptionUpdateConfirm) json.decodeFromJsonElement<PortalFlowsFlowSubscriptionUpdateConfirmView>(raw) else null }

  public val matchedBranches: Set<InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963Branch>
    get() = buildSet {
      if (inspection.matchesPortalFlowsFlowSubscriptionUpdateConfirm) add(InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963Branch.PortalFlowsFlowSubscriptionUpdateConfirm)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963 {
      val inspection = inspectInlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963(raw)
      if (inspection.matchCount == 0) {
        throw InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963NoMatchException("InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963) {
      encoder.requireJsonEncoder("InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963(element: JsonElement): InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963Inspection {
  val raw = element as? JsonObject ?: return InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963Inspection(
    matchesPortalFlowsFlowSubscriptionUpdateConfirm = false,
    failures = listOf("PortalFlowsFlowSubscriptionUpdateConfirm: expected JSON object"),
  )
  val matchesPortalFlowsFlowSubscriptionUpdateConfirm = raw["items"] != null && raw["subscription"].isString()
  return InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963Inspection(
    matchesPortalFlowsFlowSubscriptionUpdateConfirm = matchesPortalFlowsFlowSubscriptionUpdateConfirm,
    failures = buildList {
      if (!matchesPortalFlowsFlowSubscriptionUpdateConfirm) add("PortalFlowsFlowSubscriptionUpdateConfirm: required properties 'items', 'subscription' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
