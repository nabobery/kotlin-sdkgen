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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3Branch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/sepa_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3NoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsSepaDebitXf7f1c4a3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xef1e91da")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
