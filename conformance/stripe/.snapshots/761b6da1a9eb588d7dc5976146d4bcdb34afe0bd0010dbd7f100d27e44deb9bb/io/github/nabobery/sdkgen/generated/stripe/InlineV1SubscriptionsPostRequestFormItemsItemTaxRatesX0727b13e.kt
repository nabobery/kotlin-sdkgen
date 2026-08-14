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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b,
}

public sealed class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/tax_rates
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b:
      InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b) add(InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eBranch.InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eNoMatchException("InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e(element: JsonElement): InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b>()
  return InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b = matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b) add("InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b: value does not match InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
