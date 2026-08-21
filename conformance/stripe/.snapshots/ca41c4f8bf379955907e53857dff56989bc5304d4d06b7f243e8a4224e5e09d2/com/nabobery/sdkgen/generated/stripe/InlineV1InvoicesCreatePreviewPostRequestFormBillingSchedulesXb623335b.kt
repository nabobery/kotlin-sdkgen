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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bBranch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bNoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bDecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bInspection,
) {
  public val branch1:
      List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663>>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce) add(InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bBranch.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bNoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335b(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX9f704663>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce>()
  return InlineV1InvoicesCreatePreviewPostRequestFormBillingSchedulesXb623335bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce = matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce) add("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce: value does not match InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
