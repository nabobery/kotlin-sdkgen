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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5Branch {
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5Inspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327:
      Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5Inspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5Inspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742>()
  return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardX31cffed5Inspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc229b327")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X90c42742")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
