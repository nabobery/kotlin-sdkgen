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

public enum class InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad,
}

public sealed class InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/account_tax_ids
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad) add(InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aBranch.InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aNoMatchException("InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755a(element: JsonElement): InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad>()
  return InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsXa196755aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad = matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad) add("InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad: value does not match InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X8a7fddad")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
