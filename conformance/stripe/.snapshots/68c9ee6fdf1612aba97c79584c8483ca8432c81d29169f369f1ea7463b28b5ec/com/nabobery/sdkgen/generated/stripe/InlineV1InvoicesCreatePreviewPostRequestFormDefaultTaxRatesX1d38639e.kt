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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eBranch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eNoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eDecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/default_tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/default_tax_rates
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b) add(InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eBranch.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eNoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639e(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b>()
  return InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX1d38639eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b = matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b) add("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b: value does not match InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xf918522b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
