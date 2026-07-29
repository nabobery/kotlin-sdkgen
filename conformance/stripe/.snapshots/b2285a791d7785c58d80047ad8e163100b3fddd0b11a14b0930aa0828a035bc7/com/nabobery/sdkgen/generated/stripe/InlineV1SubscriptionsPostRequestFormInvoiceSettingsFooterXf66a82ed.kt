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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81,
}

public sealed class InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/footer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/footer
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81) add(InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edBranch.InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edNoMatchException("InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82ed(element: JsonElement): InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81>()
  return InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterXf66a82edInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81 = matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81) add("InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81: value does not match InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
