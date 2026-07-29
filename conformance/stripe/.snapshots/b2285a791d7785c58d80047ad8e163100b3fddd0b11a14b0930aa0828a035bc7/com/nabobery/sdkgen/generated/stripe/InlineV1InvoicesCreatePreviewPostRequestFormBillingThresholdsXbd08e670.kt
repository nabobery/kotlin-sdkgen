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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670Branch {
  InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492,
  InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670Inspection(
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492:
      Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492, matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/billing_thresholds
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670Inspection,
) {
  public val inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492) add(InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670Branch.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29) add(InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670Branch.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670Inspection {
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492>()
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29>()
  return InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbd08e670Inspection(
    matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492 = matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29 = matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29,
    failures = buildList {
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492) add("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492: value does not match InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X803b4492")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29) add("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29: value does not match InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X89b2dc29")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
