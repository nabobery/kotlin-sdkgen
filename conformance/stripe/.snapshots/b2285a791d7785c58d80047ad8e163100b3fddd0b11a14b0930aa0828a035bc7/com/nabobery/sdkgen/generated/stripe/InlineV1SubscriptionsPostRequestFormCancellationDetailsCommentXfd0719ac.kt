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

public enum class InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d,
}

public sealed class InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/cancellation_details/properties/comment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/cancellation_details/properties/comment
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d:
      InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d) add(InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acBranch.InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acNoMatchException("InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac(element: JsonElement): InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d>()
  return InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719acInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d = matchesInlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d) add("InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d: value does not match InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentAnyOf2X87b33d7d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
