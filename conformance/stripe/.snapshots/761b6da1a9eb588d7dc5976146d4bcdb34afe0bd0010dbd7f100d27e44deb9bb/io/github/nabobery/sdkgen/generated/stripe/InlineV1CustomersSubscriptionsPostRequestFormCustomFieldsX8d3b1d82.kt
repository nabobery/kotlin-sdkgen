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

public enum class InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82Inspection,
) {
  public val branch1:
      List<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsItemX2e722870>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsItemX2e722870>>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930:
      InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930) add(InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82Branch.InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsItemX2e722870>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930>()
  return InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930 = matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930) add("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930: value does not match InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
