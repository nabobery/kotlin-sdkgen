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

public enum class InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada,
}

public sealed class InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada).count { it }
}

/**
 * The tax rates that will apply to any subscription item that does not have `tax_rates` set. Invoices created will have
 * their `default_tax_rates` populated from the subscription. Pass an empty string to remove previously-defined tax
 * rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/default_tax_rates
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada:
      InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada) add(InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cBranch.InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cNoMatchException("InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124c(element: JsonElement): InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada>()
  return InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX151d124cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada = matchesInlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada) add("InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada: value does not match InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
