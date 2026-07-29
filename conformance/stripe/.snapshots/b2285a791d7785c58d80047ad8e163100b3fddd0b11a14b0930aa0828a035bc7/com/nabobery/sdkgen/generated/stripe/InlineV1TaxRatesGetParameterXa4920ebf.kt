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

public enum class InlineV1TaxRatesGetParameterXa4920ebfBranch {
  InlineV1TaxRatesGetParameterAnyOf1Xa63913ea,
  Branch2,
}

public sealed class InlineV1TaxRatesGetParameterXa4920ebfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TaxRatesGetParameterXa4920ebfNoMatchException(
  message: String,
) : InlineV1TaxRatesGetParameterXa4920ebfDecodingException(message)

internal data class InlineV1TaxRatesGetParameterXa4920ebfInspection(
  public val matchesInlineV1TaxRatesGetParameterAnyOf1Xa63913ea: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TaxRatesGetParameterAnyOf1Xa63913ea, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1tax_rates/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1tax_rates/get/parameters/1/schema
 */
@Serializable(with = InlineV1TaxRatesGetParameterXa4920ebf.Serializer::class)
public class InlineV1TaxRatesGetParameterXa4920ebf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TaxRatesGetParameterXa4920ebfInspection,
) {
  public val inlineV1TaxRatesGetParameterAnyOf1Xa63913ea:
      InlineV1TaxRatesGetParameterAnyOf1Xa63913ea? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TaxRatesGetParameterAnyOf1Xa63913ea) json.decodeFromJsonElement<InlineV1TaxRatesGetParameterAnyOf1Xa63913ea>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1TaxRatesGetParameterXa4920ebfBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TaxRatesGetParameterAnyOf1Xa63913ea) add(InlineV1TaxRatesGetParameterXa4920ebfBranch.InlineV1TaxRatesGetParameterAnyOf1Xa63913ea)
      if (inspection.matchesBranch2) add(InlineV1TaxRatesGetParameterXa4920ebfBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TaxRatesGetParameterXa4920ebf {
      val inspection = inspectInlineV1TaxRatesGetParameterXa4920ebf(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TaxRatesGetParameterXa4920ebfNoMatchException("InlineV1TaxRatesGetParameterXa4920ebf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TaxRatesGetParameterXa4920ebf(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TaxRatesGetParameterXa4920ebf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRatesGetParameterXa4920ebf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRatesGetParameterXa4920ebf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRatesGetParameterXa4920ebf) {
      encoder.requireJsonEncoder("InlineV1TaxRatesGetParameterXa4920ebf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TaxRatesGetParameterXa4920ebf(element: JsonElement): InlineV1TaxRatesGetParameterXa4920ebfInspection {
  val matchesInlineV1TaxRatesGetParameterAnyOf1Xa63913ea = element.isJsonDecodable<InlineV1TaxRatesGetParameterAnyOf1Xa63913ea>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1TaxRatesGetParameterXa4920ebfInspection(
    matchesInlineV1TaxRatesGetParameterAnyOf1Xa63913ea = matchesInlineV1TaxRatesGetParameterAnyOf1Xa63913ea,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1TaxRatesGetParameterAnyOf1Xa63913ea) add("InlineV1TaxRatesGetParameterAnyOf1Xa63913ea: value does not match InlineV1TaxRatesGetParameterAnyOf1Xa63913ea")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
