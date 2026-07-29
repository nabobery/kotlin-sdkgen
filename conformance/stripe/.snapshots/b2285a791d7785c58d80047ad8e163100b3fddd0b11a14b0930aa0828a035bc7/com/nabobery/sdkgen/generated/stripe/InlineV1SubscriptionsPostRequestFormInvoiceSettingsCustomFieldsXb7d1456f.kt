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

public enum class InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2,
}

public sealed class InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fInspection,
) {
  public val branch1:
      List<InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3>>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2) add(InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fBranch.InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fNoMatchException("InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456f(element: JsonElement): InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsItemXd6ba19c3>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2>()
  return InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXb7d1456fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2 = matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2) add("InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2: value does not match InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
