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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eBranch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/konbini.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/konbini
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eBranch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97e(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128>()
  return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX0a25e97eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd056d128")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
