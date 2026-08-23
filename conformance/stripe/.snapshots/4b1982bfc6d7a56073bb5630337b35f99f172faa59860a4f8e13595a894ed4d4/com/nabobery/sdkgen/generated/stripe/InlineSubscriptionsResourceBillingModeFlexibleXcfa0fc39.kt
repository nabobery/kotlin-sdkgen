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

public enum class InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39Branch {
  SubscriptionsResourceBillingModeFlexible,
}

public sealed class InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39NoMatchException(
  message: String,
) : InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39DecodingException(message)

internal data class InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39Inspection(
  public val matchesSubscriptionsResourceBillingModeFlexible: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionsResourceBillingModeFlexible).count { it }
}

/**
 * Configure behavior for flexible billing mode
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_mode/properties/flexible
 */
@Serializable(with = InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39.Serializer::class)
public class InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39Inspection,
) {
  public val subscriptionsResourceBillingModeFlexible: SubscriptionsResourceBillingModeFlexibleView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionsResourceBillingModeFlexible) json.decodeFromJsonElement<SubscriptionsResourceBillingModeFlexibleView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39Branch>
    get() = buildSet {
      if (inspection.matchesSubscriptionsResourceBillingModeFlexible) add(InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39Branch.SubscriptionsResourceBillingModeFlexible)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39 {
      val inspection = inspectInlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39NoMatchException("InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39(element: JsonElement): InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39Inspection(
    matchesSubscriptionsResourceBillingModeFlexible = false,
    failures = listOf("SubscriptionsResourceBillingModeFlexible: expected JSON object"),
  )
  val matchesSubscriptionsResourceBillingModeFlexible = true
  return InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39Inspection(
    matchesSubscriptionsResourceBillingModeFlexible = matchesSubscriptionsResourceBillingModeFlexible,
    failures = buildList {
      if (!matchesSubscriptionsResourceBillingModeFlexible) add("SubscriptionsResourceBillingModeFlexible: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
