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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaBranch {
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaInspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaInspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaNoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aa(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaInspection {
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountXf66262aaInspection(
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X70eb0526")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X85c243d6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
