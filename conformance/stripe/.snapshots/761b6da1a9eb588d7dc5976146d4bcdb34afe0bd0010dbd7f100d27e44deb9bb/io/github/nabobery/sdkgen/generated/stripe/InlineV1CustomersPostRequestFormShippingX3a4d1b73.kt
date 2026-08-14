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

public enum class InlineV1CustomersPostRequestFormShippingX3a4d1b73Branch {
  InlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19,
  InlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b,
}

public sealed class InlineV1CustomersPostRequestFormShippingX3a4d1b73DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormShippingX3a4d1b73NoMatchException(
  message: String,
) : InlineV1CustomersPostRequestFormShippingX3a4d1b73DecodingException(message)

internal data class InlineV1CustomersPostRequestFormShippingX3a4d1b73Inspection(
  public val matchesInlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19: Boolean,
  public val matchesInlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19, matchesInlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b).count { it }
}

/**
 * The customer's shipping information. Appears on invoices emailed to this customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/shipping
 */
@Serializable(with = InlineV1CustomersPostRequestFormShippingX3a4d1b73.Serializer::class)
public class InlineV1CustomersPostRequestFormShippingX3a4d1b73 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersPostRequestFormShippingX3a4d1b73Inspection,
) {
  public val inlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19:
      InlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19>(raw) else null }

  public val inlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b:
      InlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersPostRequestFormShippingX3a4d1b73Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19) add(InlineV1CustomersPostRequestFormShippingX3a4d1b73Branch.InlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19)
      if (inspection.matchesInlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b) add(InlineV1CustomersPostRequestFormShippingX3a4d1b73Branch.InlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersPostRequestFormShippingX3a4d1b73 {
      val inspection = inspectInlineV1CustomersPostRequestFormShippingX3a4d1b73(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersPostRequestFormShippingX3a4d1b73NoMatchException("InlineV1CustomersPostRequestFormShippingX3a4d1b73 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersPostRequestFormShippingX3a4d1b73(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormShippingX3a4d1b73> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormShippingX3a4d1b73 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormShippingX3a4d1b73")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormShippingX3a4d1b73) {
      encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormShippingX3a4d1b73").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersPostRequestFormShippingX3a4d1b73(element: JsonElement): InlineV1CustomersPostRequestFormShippingX3a4d1b73Inspection {
  val matchesInlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19 = element.isJsonDecodable<InlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19>()
  val matchesInlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b = element.isJsonDecodable<InlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b>()
  return InlineV1CustomersPostRequestFormShippingX3a4d1b73Inspection(
    matchesInlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19 = matchesInlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19,
    matchesInlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b = matchesInlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b,
    failures = buildList {
      if (!matchesInlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19) add("InlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19: value does not match InlineV1CustomersPostRequestFormShippingAnyOf1X716d3a19")
      if (!matchesInlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b) add("InlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b: value does not match InlineV1CustomersPostRequestFormShippingAnyOf2Xe470517b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
