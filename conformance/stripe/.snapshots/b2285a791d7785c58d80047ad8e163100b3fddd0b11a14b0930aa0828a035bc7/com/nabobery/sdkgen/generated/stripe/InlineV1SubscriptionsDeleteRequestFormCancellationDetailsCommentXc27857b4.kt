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

public enum class InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4Branch {
  Branch1,
  InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887,
}

public sealed class InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4NoMatchException(
  message: String,
) : InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4DecodingException(message)

internal data class InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/delete/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/cancellation_details/properties/comment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/delete/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/cancellation_details/properties/comment
 */
@Serializable(with = InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4.Serializer::class)
public class InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887:
      InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887) json.decodeFromJsonElement<InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887) add(InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4Branch.InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4 {
      val inspection = inspectInlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4NoMatchException("InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4(element: JsonElement): InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887 = element.isJsonDecodable<InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887>()
  return InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887 = matchesInlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887) add("InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887: value does not match InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentAnyOf2X0b30f887")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
