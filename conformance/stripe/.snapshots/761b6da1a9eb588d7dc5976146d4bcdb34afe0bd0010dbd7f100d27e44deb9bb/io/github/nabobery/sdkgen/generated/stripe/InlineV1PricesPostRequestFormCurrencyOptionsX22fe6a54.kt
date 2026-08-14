package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54Branch {
  Branch1,
  InlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3,
}

public sealed class InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54NoMatchException(
  message: String,
) : InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54DecodingException(message)

internal data class InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3).count { it }
}

/**
 * Prices defined in each available currency option. Each key must be a three-letter [ISO currency
 * code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
 * currency](https://stripe.com/docs/currencies).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/currency_options
 */
@Serializable(with = InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54.Serializer::class)
public class InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3:
      InlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3) json.decodeFromJsonElement<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3>(raw) else null }

  public val matchedBranches: Set<InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54Branch.Branch1)
      if (inspection.matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3) add(InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54Branch.InlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54 {
      val inspection = inspectInlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54NoMatchException("InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54) {
      encoder.requireJsonEncoder("InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54(element: JsonElement): InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3 = element.isJsonDecodable<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3>()
  return InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3 = matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3) add("InlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3: value does not match InlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
