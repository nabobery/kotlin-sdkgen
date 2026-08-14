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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32Branch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/konbini.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/konbini
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32NoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniXd7207a32Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X58a25e4c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
