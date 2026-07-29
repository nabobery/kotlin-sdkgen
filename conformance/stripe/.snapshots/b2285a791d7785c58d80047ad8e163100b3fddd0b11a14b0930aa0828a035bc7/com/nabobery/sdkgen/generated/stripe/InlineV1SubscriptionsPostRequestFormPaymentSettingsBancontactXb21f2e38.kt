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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38Branch {
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/bancontact.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/bancontact
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38NoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXb21f2e38Inspection(
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X2609a2be")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
