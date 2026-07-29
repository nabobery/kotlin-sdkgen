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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineLineItemSubscriptionX73f0eb42Branch {
  Branch1,
  Subscription,
}

public sealed class InlineLineItemSubscriptionX73f0eb42DecodingException(
  message: String,
) : SerializationException(message)

public class InlineLineItemSubscriptionX73f0eb42NoMatchException(
  message: String,
) : InlineLineItemSubscriptionX73f0eb42DecodingException(message)

internal data class InlineLineItemSubscriptionX73f0eb42Inspection(
  public val matchesBranch1: Boolean,
  public val matchesSubscription: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSubscription).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/line_item/properties/subscription.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/line_item/properties/subscription
 */
@Serializable(with = InlineLineItemSubscriptionX73f0eb42.Serializer::class)
public class InlineLineItemSubscriptionX73f0eb42 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLineItemSubscriptionX73f0eb42Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val subscription: Subscription? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscription) json.decodeFromJsonElement<Subscription>(raw) else null }

  public val matchedBranches: Set<InlineLineItemSubscriptionX73f0eb42Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineLineItemSubscriptionX73f0eb42Branch.Branch1)
      if (inspection.matchesSubscription) add(InlineLineItemSubscriptionX73f0eb42Branch.Subscription)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLineItemSubscriptionX73f0eb42 {
      val inspection = inspectInlineLineItemSubscriptionX73f0eb42(raw)
      if (inspection.matchCount == 0) {
        throw InlineLineItemSubscriptionX73f0eb42NoMatchException("InlineLineItemSubscriptionX73f0eb42 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLineItemSubscriptionX73f0eb42(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineLineItemSubscriptionX73f0eb42> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLineItemSubscriptionX73f0eb42 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLineItemSubscriptionX73f0eb42")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLineItemSubscriptionX73f0eb42) {
      encoder.requireJsonEncoder("InlineLineItemSubscriptionX73f0eb42").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLineItemSubscriptionX73f0eb42(element: JsonElement): InlineLineItemSubscriptionX73f0eb42Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesSubscription = element.isJsonDecodable<Subscription>()
  return InlineLineItemSubscriptionX73f0eb42Inspection(
    matchesBranch1 = matchesBranch1,
    matchesSubscription = matchesSubscription,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesSubscription) add("Subscription: value does not match Subscription")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
