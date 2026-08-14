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

public enum class InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/cancellation_details/properties/comment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/cancellation_details/properties/comment
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66:
      InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66) add(InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4Branch.InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66>()
  return InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66 = matchesInlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66) add("InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66: value does not match InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsAnyOf2Xfdb3fb66")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
