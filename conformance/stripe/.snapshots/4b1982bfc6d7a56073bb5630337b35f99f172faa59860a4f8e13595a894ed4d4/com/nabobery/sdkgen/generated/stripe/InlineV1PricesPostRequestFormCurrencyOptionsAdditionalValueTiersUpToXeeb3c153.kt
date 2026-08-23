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

public enum class InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153Branch {
  InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd,
  Branch2,
}

public sealed class InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153NoMatchException(
  message: String,
) : InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153DecodingException(message)

internal data class InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153Inspection(
  public val matchesInlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd:
      Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/currency_options/additionalProperties/properties/tiers/items/properties/up_to.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/currency_options/additionalProperties/properties/tiers/items/properties/up_to
 */
@Serializable(with = InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153.Serializer::class)
public class InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153Inspection,
) {
  public val inlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd:
      InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd) json.decodeFromJsonElement<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd) add(InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153Branch.InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd)
      if (inspection.matchesBranch2) add(InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153 {
      val inspection = inspectInlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153NoMatchException("InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153) {
      encoder.requireJsonEncoder("InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153(element: JsonElement): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153Inspection {
  val matchesInlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd = element.isJsonDecodable<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersUpToXeeb3c153Inspection(
    matchesInlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd = matchesInlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd) add("InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd: value does not match InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
