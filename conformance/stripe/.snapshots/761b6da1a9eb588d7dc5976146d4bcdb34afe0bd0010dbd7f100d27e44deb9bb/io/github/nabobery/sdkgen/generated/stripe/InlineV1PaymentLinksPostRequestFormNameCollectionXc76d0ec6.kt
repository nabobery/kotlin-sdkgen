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

public enum class InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6Branch {
  InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179,
  InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba,
}

public sealed class InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6NoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6Inspection(
  public val matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179, matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba).count { it }
}

/**
 * Controls settings applied for collecting the customer's name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/name_collection
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6Inspection,
) {
  public val inlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179:
      InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba:
      InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba>(raw) else null }

  public val matchedBranches: Set<InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179) add(InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6Branch.InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba) add(InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6Branch.InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6 {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6NoMatchException("InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6(element: JsonElement): InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6Inspection {
  val matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179 = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179>()
  val matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba>()
  return InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6Inspection(
    matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179 = matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179,
    matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba = matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba,
    failures = buildList {
      if (!matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179) add("InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179: value does not match InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179")
      if (!matchesInlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba) add("InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba: value does not match InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf2X2d03bdba")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
