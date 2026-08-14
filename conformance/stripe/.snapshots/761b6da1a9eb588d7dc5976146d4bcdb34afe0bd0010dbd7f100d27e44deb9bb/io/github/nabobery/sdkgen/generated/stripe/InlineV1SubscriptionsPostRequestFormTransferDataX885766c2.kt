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

public enum class InlineV1SubscriptionsPostRequestFormTransferDataX885766c2Branch {
  InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec,
  InlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8,
}

public sealed class InlineV1SubscriptionsPostRequestFormTransferDataX885766c2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormTransferDataX885766c2NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormTransferDataX885766c2DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormTransferDataX885766c2Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec, matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8).count { it }
}

/**
 * If specified, the funds from the subscription's invoices will be transferred to the destination and the ID of the
 * resulting transfers will be found on the resulting charges. This will be unset if you POST an empty value.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/transfer_data
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormTransferDataX885766c2.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormTransferDataX885766c2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormTransferDataX885766c2Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec:
      InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8:
      InlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormTransferDataX885766c2Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec) add(InlineV1SubscriptionsPostRequestFormTransferDataX885766c2Branch.InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8) add(InlineV1SubscriptionsPostRequestFormTransferDataX885766c2Branch.InlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormTransferDataX885766c2 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormTransferDataX885766c2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormTransferDataX885766c2NoMatchException("InlineV1SubscriptionsPostRequestFormTransferDataX885766c2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormTransferDataX885766c2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormTransferDataX885766c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormTransferDataX885766c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormTransferDataX885766c2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormTransferDataX885766c2) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormTransferDataX885766c2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormTransferDataX885766c2(element: JsonElement): InlineV1SubscriptionsPostRequestFormTransferDataX885766c2Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec>()
  val matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8>()
  return InlineV1SubscriptionsPostRequestFormTransferDataX885766c2Inspection(
    matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec = matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec,
    matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8 = matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec) add("InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec: value does not match InlineV1SubscriptionsPostRequestFormTransferDataAnyOf1X169b82ec")
      if (!matchesInlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8) add("InlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8: value does not match InlineV1SubscriptionsPostRequestFormTransferDataAnyOf2X26d114c8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
