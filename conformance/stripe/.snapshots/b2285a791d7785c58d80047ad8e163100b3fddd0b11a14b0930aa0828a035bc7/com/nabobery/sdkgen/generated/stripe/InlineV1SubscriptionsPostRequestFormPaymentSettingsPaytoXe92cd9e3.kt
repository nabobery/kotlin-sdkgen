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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3Branch {
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/payto
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3NoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoXe92cd9e3Inspection(
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X99f4ca6b")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd34c802f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
