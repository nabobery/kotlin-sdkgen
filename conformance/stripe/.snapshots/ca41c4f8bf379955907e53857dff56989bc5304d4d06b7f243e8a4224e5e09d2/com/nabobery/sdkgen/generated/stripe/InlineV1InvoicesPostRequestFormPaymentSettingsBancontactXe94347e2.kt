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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2Branch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2Inspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/bancontact.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/bancontact
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2Inspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2) add(InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e) add(InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2Inspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsBancontactXe94347e2Inspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6e9c7ae2")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X50bf992e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
