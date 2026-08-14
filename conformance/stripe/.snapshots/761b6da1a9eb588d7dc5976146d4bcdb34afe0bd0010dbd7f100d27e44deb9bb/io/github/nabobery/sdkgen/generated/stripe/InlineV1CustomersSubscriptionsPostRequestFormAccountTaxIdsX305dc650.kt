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

public enum class InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/invoice_settings/properties/account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/invoice_settings/properties/account_tax_ids
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0:
      InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0) add(InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650Branch.InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0>()
  return InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0 = matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0) add("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0: value does not match InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xbede9fa0")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
