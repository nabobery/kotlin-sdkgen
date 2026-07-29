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

public enum class InlineProductTaxCodeXef95fe7fBranch {
  Branch1,
  TaxCode,
}

public sealed class InlineProductTaxCodeXef95fe7fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineProductTaxCodeXef95fe7fNoMatchException(
  message: String,
) : InlineProductTaxCodeXef95fe7fDecodingException(message)

internal data class InlineProductTaxCodeXef95fe7fInspection(
  public val matchesBranch1: Boolean,
  public val matchesTaxCode: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTaxCode).count { it }
}

/**
 * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/product/properties/tax_code
 */
@Serializable(with = InlineProductTaxCodeXef95fe7f.Serializer::class)
public class InlineProductTaxCodeXef95fe7f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineProductTaxCodeXef95fe7fInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val taxCode: TaxCode? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxCode) json.decodeFromJsonElement<TaxCode>(raw) else null }

  public val matchedBranches: Set<InlineProductTaxCodeXef95fe7fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineProductTaxCodeXef95fe7fBranch.Branch1)
      if (inspection.matchesTaxCode) add(InlineProductTaxCodeXef95fe7fBranch.TaxCode)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineProductTaxCodeXef95fe7f {
      val inspection = inspectInlineProductTaxCodeXef95fe7f(raw)
      if (inspection.matchCount == 0) {
        throw InlineProductTaxCodeXef95fe7fNoMatchException("InlineProductTaxCodeXef95fe7f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineProductTaxCodeXef95fe7f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineProductTaxCodeXef95fe7f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProductTaxCodeXef95fe7f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProductTaxCodeXef95fe7f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineProductTaxCodeXef95fe7f) {
      encoder.requireJsonEncoder("InlineProductTaxCodeXef95fe7f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineProductTaxCodeXef95fe7f(element: JsonElement): InlineProductTaxCodeXef95fe7fInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTaxCode = element.isJsonDecodable<TaxCode>()
  return InlineProductTaxCodeXef95fe7fInspection(
    matchesBranch1 = matchesBranch1,
    matchesTaxCode = matchesTaxCode,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesTaxCode) add("TaxCode: value does not match TaxCode")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
