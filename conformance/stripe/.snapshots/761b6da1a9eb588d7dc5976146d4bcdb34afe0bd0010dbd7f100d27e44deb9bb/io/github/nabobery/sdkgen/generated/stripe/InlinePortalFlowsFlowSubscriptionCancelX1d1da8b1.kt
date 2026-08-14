package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1Branch {
  PortalFlowsFlowSubscriptionCancel,
}

public sealed class InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1NoMatchException(
  message: String,
) : InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1DecodingException(message)

internal data class InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1Inspection(
  public val matchesPortalFlowsFlowSubscriptionCancel: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPortalFlowsFlowSubscriptionCancel).count { it }
}

/**
 * Configuration when `flow.type=subscription_cancel`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow/properties/subscription_cancel
 */
@Serializable(with = InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1.Serializer::class)
public class InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1Inspection,
) {
  public val portalFlowsFlowSubscriptionCancel: PortalFlowsFlowSubscriptionCancelView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPortalFlowsFlowSubscriptionCancel) json.decodeFromJsonElement<PortalFlowsFlowSubscriptionCancelView>(raw) else null }

  public val matchedBranches: Set<InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1Branch>
    get() = buildSet {
      if (inspection.matchesPortalFlowsFlowSubscriptionCancel) add(InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1Branch.PortalFlowsFlowSubscriptionCancel)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1 {
      val inspection = inspectInlinePortalFlowsFlowSubscriptionCancelX1d1da8b1(raw)
      if (inspection.matchCount == 0) {
        throw InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1NoMatchException("InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1) {
      encoder.requireJsonEncoder("InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePortalFlowsFlowSubscriptionCancelX1d1da8b1(element: JsonElement): InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1Inspection {
  val raw = element as? JsonObject ?: return InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1Inspection(
    matchesPortalFlowsFlowSubscriptionCancel = false,
    failures = listOf("PortalFlowsFlowSubscriptionCancel: expected JSON object"),
  )
  val matchesPortalFlowsFlowSubscriptionCancel = raw["subscription"].isString()
  return InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1Inspection(
    matchesPortalFlowsFlowSubscriptionCancel = matchesPortalFlowsFlowSubscriptionCancel,
    failures = buildList {
      if (!matchesPortalFlowsFlowSubscriptionCancel) add("PortalFlowsFlowSubscriptionCancel: required properties 'subscription' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
