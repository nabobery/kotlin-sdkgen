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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44Branch {
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/bancontact.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/bancontact
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44NoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsBancontactXe53aac44Inspection(
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X478a4f02")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X21ad872f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
