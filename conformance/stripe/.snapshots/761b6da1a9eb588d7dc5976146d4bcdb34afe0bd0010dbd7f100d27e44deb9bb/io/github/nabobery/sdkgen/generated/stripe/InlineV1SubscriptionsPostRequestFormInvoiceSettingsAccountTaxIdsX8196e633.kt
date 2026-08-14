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

public enum class InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633Branch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e,
}

public sealed class InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_settings/properties/account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_settings/properties/account_tax_ids
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e) add(InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633Branch.InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633NoMatchException("InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633(element: JsonElement): InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e>()
  return InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e = matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e) add("InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e: value does not match InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
