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

public enum class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb,
}

public sealed class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/tax_rates
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb:
      InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb) add(InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fBranch.InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fNoMatchException("InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f(element: JsonElement): InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb>()
  return InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb = matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb) add("InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb: value does not match InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
