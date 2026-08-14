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

public enum class InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609Inspection,
) {
  public val branch1:
      List<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsItemX8045383a>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsItemX8045383a>>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a:
      InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a) add(InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609Branch.InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsItemX8045383a>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a>()
  return InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX3a0a1609Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a = matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a) add("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a: value does not match InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2Xb4a4ac3a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
