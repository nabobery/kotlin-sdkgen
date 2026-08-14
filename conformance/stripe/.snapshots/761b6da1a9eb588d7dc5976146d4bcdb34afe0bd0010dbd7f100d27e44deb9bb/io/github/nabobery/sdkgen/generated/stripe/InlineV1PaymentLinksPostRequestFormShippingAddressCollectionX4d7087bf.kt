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

public enum class InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfBranch {
  InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447,
  InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e,
}

public sealed class InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfNoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfInspection(
  public val matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447:
      Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447, matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e).count { it }
}

/**
 * Configuration for collecting the customer's shipping address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_address_collection
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfInspection,
) {
  public val inlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447:
      InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e:
      InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447) add(InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfBranch.InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e) add(InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfBranch.InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfNoMatchException("InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf(element: JsonElement): InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfInspection {
  val matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447 = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447>()
  val matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e>()
  return InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bfInspection(
    matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447 = matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447,
    matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e = matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e,
    failures = buildList {
      if (!matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447) add("InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447: value does not match InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447")
      if (!matchesInlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e) add("InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e: value does not match InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf2Xad5ebe9e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
