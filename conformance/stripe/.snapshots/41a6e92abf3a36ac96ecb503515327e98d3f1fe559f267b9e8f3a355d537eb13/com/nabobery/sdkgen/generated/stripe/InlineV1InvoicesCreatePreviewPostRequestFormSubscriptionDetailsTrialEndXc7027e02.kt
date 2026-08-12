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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02Branch {
  InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7,
  Branch2,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02Inspection(
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7:
      Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/trial_end.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/trial_end
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02Inspection,
) {
  public val inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7) add(InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02Branch.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7)
      if (inspection.matchesBranch2) add(InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02Inspection {
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTrialEndXc7027e02Inspection(
    matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7 = matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7) add("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7: value does not match InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
