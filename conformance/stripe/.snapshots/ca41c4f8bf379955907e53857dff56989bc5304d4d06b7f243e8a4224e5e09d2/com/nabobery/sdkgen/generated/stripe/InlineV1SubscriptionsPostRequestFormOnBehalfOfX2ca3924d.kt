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

public enum class InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6,
}

public sealed class InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6).count { it }
}

/**
 * The account on behalf of which to charge, for each of the subscription's invoices.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/on_behalf_of
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6:
      InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6) add(InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dBranch.InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dNoMatchException("InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924d(element: JsonElement): InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6>()
  return InlineV1SubscriptionsPostRequestFormOnBehalfOfX2ca3924dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6 = matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6) add("InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6: value does not match InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2Xf08833b6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
