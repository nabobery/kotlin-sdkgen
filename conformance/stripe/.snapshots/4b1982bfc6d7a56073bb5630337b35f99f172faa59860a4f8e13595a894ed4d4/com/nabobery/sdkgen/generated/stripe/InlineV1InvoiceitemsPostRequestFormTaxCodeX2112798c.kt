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

public enum class InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cBranch {
  Branch1,
  InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49,
}

public sealed class InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cNoMatchException(
  message: String,
) : InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cDecodingException(message)

internal data class InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49).count { it }
}

/**
 * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/tax_code
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49:
      InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49) json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cBranch.Branch1)
      if (inspection.matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49) add(InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cBranch.InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c {
      val inspection = inspectInlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cNoMatchException("InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c) {
      encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c(element: JsonElement): InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49 = element.isJsonDecodable<InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49>()
  return InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49 = matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49) add("InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49: value does not match InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X63260f49")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
