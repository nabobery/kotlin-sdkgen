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

public enum class InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afBranch {
  Branch1,
  InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122,
}

public sealed class InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afNoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122).count { it }
}

/**
 * The tax rates that will apply to any line item that does not have `tax_rates` set. Pass an empty string to remove
 * previously-defined tax rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/default_tax_rates
 */
@Serializable(with = InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af.Serializer::class)
public class InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122:
      InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122) add(InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afBranch.InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af {
      val inspection = inspectInlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afNoMatchException("InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af(element: JsonElement): InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122>()
  return InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90afInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122 = matchesInlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122) add("InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122: value does not match InlineV1InvoicesPostRequestFormDefaultTaxRatesAnyOf2X29dd6122")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
