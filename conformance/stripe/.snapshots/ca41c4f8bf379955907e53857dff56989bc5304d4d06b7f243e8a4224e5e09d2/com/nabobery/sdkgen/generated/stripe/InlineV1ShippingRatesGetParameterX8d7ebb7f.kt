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

public enum class InlineV1ShippingRatesGetParameterX8d7ebb7fBranch {
  InlineV1ShippingRatesGetParameterAnyOf1Xa6f280df,
  Branch2,
}

public sealed class InlineV1ShippingRatesGetParameterX8d7ebb7fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ShippingRatesGetParameterX8d7ebb7fNoMatchException(
  message: String,
) : InlineV1ShippingRatesGetParameterX8d7ebb7fDecodingException(message)

internal data class InlineV1ShippingRatesGetParameterX8d7ebb7fInspection(
  public val matchesInlineV1ShippingRatesGetParameterAnyOf1Xa6f280df: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1ShippingRatesGetParameterAnyOf1Xa6f280df, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/get/parameters/1/schema
 */
@Serializable(with = InlineV1ShippingRatesGetParameterX8d7ebb7f.Serializer::class)
public class InlineV1ShippingRatesGetParameterX8d7ebb7f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ShippingRatesGetParameterX8d7ebb7fInspection,
) {
  public val inlineV1ShippingRatesGetParameterAnyOf1Xa6f280df:
      InlineV1ShippingRatesGetParameterAnyOf1Xa6f280df? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ShippingRatesGetParameterAnyOf1Xa6f280df) json.decodeFromJsonElement<InlineV1ShippingRatesGetParameterAnyOf1Xa6f280df>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1ShippingRatesGetParameterX8d7ebb7fBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1ShippingRatesGetParameterAnyOf1Xa6f280df) add(InlineV1ShippingRatesGetParameterX8d7ebb7fBranch.InlineV1ShippingRatesGetParameterAnyOf1Xa6f280df)
      if (inspection.matchesBranch2) add(InlineV1ShippingRatesGetParameterX8d7ebb7fBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ShippingRatesGetParameterX8d7ebb7f {
      val inspection = inspectInlineV1ShippingRatesGetParameterX8d7ebb7f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ShippingRatesGetParameterX8d7ebb7fNoMatchException("InlineV1ShippingRatesGetParameterX8d7ebb7f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ShippingRatesGetParameterX8d7ebb7f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ShippingRatesGetParameterX8d7ebb7f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ShippingRatesGetParameterX8d7ebb7f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ShippingRatesGetParameterX8d7ebb7f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ShippingRatesGetParameterX8d7ebb7f) {
      encoder.requireJsonEncoder("InlineV1ShippingRatesGetParameterX8d7ebb7f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ShippingRatesGetParameterX8d7ebb7f(element: JsonElement): InlineV1ShippingRatesGetParameterX8d7ebb7fInspection {
  val matchesInlineV1ShippingRatesGetParameterAnyOf1Xa6f280df = element.isJsonDecodable<InlineV1ShippingRatesGetParameterAnyOf1Xa6f280df>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1ShippingRatesGetParameterX8d7ebb7fInspection(
    matchesInlineV1ShippingRatesGetParameterAnyOf1Xa6f280df = matchesInlineV1ShippingRatesGetParameterAnyOf1Xa6f280df,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1ShippingRatesGetParameterAnyOf1Xa6f280df) add("InlineV1ShippingRatesGetParameterAnyOf1Xa6f280df: value does not match InlineV1ShippingRatesGetParameterAnyOf1Xa6f280df")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
