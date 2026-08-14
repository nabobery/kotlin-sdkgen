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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464,
}

public sealed class InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464).count { it }
}

/**
 * The account on behalf of which to charge, for each of the subscription's invoices.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/on_behalf_of
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464:
      InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464) add(InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaBranch.InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaNoMatchException("InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa(element: JsonElement): InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464>()
  return InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaaInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464 = matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464) add("InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464: value does not match InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
