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

public enum class InlineSubscriptionPendingUpdateXa60c9b03Branch {
  SubscriptionsResourcePendingUpdate,
}

public sealed class InlineSubscriptionPendingUpdateXa60c9b03DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionPendingUpdateXa60c9b03NoMatchException(
  message: String,
) : InlineSubscriptionPendingUpdateXa60c9b03DecodingException(message)

internal data class InlineSubscriptionPendingUpdateXa60c9b03Inspection(
  public val matchesSubscriptionsResourcePendingUpdate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionsResourcePendingUpdate).count { it }
}

/**
 * If specified, [pending updates](https://docs.stripe.com/billing/subscriptions/pending-updates) that will be applied
 * to the subscription once the `latest_invoice` has been paid.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/pending_update
 */
@Serializable(with = InlineSubscriptionPendingUpdateXa60c9b03.Serializer::class)
public class InlineSubscriptionPendingUpdateXa60c9b03 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionPendingUpdateXa60c9b03Inspection,
) {
  public val subscriptionsResourcePendingUpdate: SubscriptionsResourcePendingUpdateView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionsResourcePendingUpdate) json.decodeFromJsonElement<SubscriptionsResourcePendingUpdateView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionPendingUpdateXa60c9b03Branch>
    get() = buildSet {
      if (inspection.matchesSubscriptionsResourcePendingUpdate) add(InlineSubscriptionPendingUpdateXa60c9b03Branch.SubscriptionsResourcePendingUpdate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionPendingUpdateXa60c9b03 {
      val inspection = inspectInlineSubscriptionPendingUpdateXa60c9b03(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionPendingUpdateXa60c9b03NoMatchException("InlineSubscriptionPendingUpdateXa60c9b03 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionPendingUpdateXa60c9b03(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionPendingUpdateXa60c9b03> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionPendingUpdateXa60c9b03 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionPendingUpdateXa60c9b03")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionPendingUpdateXa60c9b03) {
      encoder.requireJsonEncoder("InlineSubscriptionPendingUpdateXa60c9b03").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionPendingUpdateXa60c9b03(element: JsonElement): InlineSubscriptionPendingUpdateXa60c9b03Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionPendingUpdateXa60c9b03Inspection(
    matchesSubscriptionsResourcePendingUpdate = false,
    failures = listOf("SubscriptionsResourcePendingUpdate: expected JSON object"),
  )
  val matchesSubscriptionsResourcePendingUpdate = raw["expires_at"] != null
  return InlineSubscriptionPendingUpdateXa60c9b03Inspection(
    matchesSubscriptionsResourcePendingUpdate = matchesSubscriptionsResourcePendingUpdate,
    failures = buildList {
      if (!matchesSubscriptionsResourcePendingUpdate) add("SubscriptionsResourcePendingUpdate: required properties 'expires_at' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
