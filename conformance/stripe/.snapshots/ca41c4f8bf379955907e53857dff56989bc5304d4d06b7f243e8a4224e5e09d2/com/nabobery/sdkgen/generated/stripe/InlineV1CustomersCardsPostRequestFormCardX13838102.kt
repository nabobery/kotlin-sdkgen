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

public enum class InlineV1CustomersCardsPostRequestFormCardX13838102Branch {
  InlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476,
  Branch2,
}

public sealed class InlineV1CustomersCardsPostRequestFormCardX13838102DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersCardsPostRequestFormCardX13838102NoMatchException(
  message: String,
) : InlineV1CustomersCardsPostRequestFormCardX13838102DecodingException(message)

internal data class InlineV1CustomersCardsPostRequestFormCardX13838102Inspection(
  public val matchesInlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476, matchesBranch2).count { it }
}

/**
 * A token, like the ones returned by [Stripe.js](https://stripe.com/docs/js).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/card
 */
@Serializable(with = InlineV1CustomersCardsPostRequestFormCardX13838102.Serializer::class)
public class InlineV1CustomersCardsPostRequestFormCardX13838102 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersCardsPostRequestFormCardX13838102Inspection,
) {
  public val inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476:
      InlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476) json.decodeFromJsonElement<InlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersCardsPostRequestFormCardX13838102Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476) add(InlineV1CustomersCardsPostRequestFormCardX13838102Branch.InlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476)
      if (inspection.matchesBranch2) add(InlineV1CustomersCardsPostRequestFormCardX13838102Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersCardsPostRequestFormCardX13838102 {
      val inspection = inspectInlineV1CustomersCardsPostRequestFormCardX13838102(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersCardsPostRequestFormCardX13838102NoMatchException("InlineV1CustomersCardsPostRequestFormCardX13838102 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersCardsPostRequestFormCardX13838102(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersCardsPostRequestFormCardX13838102> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersCardsPostRequestFormCardX13838102 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersCardsPostRequestFormCardX13838102")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCardsPostRequestFormCardX13838102) {
      encoder.requireJsonEncoder("InlineV1CustomersCardsPostRequestFormCardX13838102").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersCardsPostRequestFormCardX13838102(element: JsonElement): InlineV1CustomersCardsPostRequestFormCardX13838102Inspection {
  val matchesInlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476 = element.isJsonDecodable<InlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineV1CustomersCardsPostRequestFormCardX13838102Inspection(
    matchesInlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476 = matchesInlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476) add("InlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476: value does not match InlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
