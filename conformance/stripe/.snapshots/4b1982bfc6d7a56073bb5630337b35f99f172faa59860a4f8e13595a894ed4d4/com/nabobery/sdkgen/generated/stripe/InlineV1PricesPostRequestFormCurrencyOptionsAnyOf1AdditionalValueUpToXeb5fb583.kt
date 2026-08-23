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

public enum class InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583Branch {
  InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d,
  Branch2,
}

public sealed class InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583NoMatchException(
  message: String,
) : InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583DecodingException(message)

internal data class InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583Inspection(
  public val matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d:
      Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/currency_options/anyOf/0/additionalProperties/properties/tiers/items/properties/up_to.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/currency_options/anyOf/0/additionalProperties/properties/tiers/items/properties/up_to
 */
@Serializable(with = InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583.Serializer::class)
public class InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583Inspection,
) {
  public val inlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d:
      InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d) json.decodeFromJsonElement<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d) add(InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583Branch.InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d)
      if (inspection.matchesBranch2) add(InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583 {
      val inspection = inspectInlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583NoMatchException("InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583) {
      encoder.requireJsonEncoder("InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583(element: JsonElement): InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583Inspection {
  val matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d = element.isJsonDecodable<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueUpToXeb5fb583Inspection(
    matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d = matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d) add("InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d: value does not match InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1AdditionalValueAnyOf1X07bf582d")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
