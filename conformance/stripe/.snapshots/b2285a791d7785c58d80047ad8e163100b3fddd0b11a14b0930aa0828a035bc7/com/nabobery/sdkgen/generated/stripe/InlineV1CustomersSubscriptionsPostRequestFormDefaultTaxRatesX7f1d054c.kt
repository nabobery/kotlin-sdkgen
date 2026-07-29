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

public enum class InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cBranch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a).count { it }
}

/**
 * The tax rates that will apply to any subscription item that does not have `tax_rates` set. Invoices created will have
 * their `default_tax_rates` populated from the subscription. Pass an empty string to remove previously-defined tax
 * rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/default_tax_rates
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a:
      InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cBranch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a) add(InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cBranch.InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054c(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a>()
  return InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesX7f1d054cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a = matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a) add("InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a: value does not match InlineV1CustomersSubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X06999c2a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
