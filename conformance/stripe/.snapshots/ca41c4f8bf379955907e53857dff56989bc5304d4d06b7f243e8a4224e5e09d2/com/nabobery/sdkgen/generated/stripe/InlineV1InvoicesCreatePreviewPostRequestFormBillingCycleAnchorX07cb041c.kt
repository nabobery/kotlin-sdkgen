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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cBranch {
  InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308,
  Branch2,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cNoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cDecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cInspection(
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308:
      Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_cycle_anchor.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_cycle_anchor
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cInspection,
) {
  public val inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308) add(InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cBranch.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308)
      if (inspection.matchesBranch2) add(InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cNoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041c(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cInspection {
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX07cb041cInspection(
    matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308 = matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308) add("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308: value does not match InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
