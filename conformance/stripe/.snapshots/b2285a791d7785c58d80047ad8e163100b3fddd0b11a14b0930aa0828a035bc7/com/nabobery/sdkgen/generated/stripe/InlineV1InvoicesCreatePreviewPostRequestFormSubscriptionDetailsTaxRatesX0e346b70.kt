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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70Branch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/tax_rates
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c) add(InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70Branch.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c>()
  return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTaxRatesX0e346b70Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c = matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c) add("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c: value does not match InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xa158316c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
