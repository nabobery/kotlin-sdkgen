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

public enum class InlineV1InvoicesPostRequestFormShippingCostX10650005Branch {
  InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed,
  InlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276,
}

public sealed class InlineV1InvoicesPostRequestFormShippingCostX10650005DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormShippingCostX10650005NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormShippingCostX10650005DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormShippingCostX10650005Inspection(
  public val matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed, matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276).count { it }
}

/**
 * Settings for the cost of shipping for this invoice.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostX10650005.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostX10650005 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesPostRequestFormShippingCostX10650005Inspection,
) {
  public val inlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed:
      InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed>(raw) else null }

  public val inlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276:
      InlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesPostRequestFormShippingCostX10650005Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed) add(InlineV1InvoicesPostRequestFormShippingCostX10650005Branch.InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed)
      if (inspection.matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276) add(InlineV1InvoicesPostRequestFormShippingCostX10650005Branch.InlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormShippingCostX10650005 {
      val inspection = inspectInlineV1InvoicesPostRequestFormShippingCostX10650005(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormShippingCostX10650005NoMatchException("InlineV1InvoicesPostRequestFormShippingCostX10650005 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormShippingCostX10650005(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostX10650005> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostX10650005 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingCostX10650005")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingCostX10650005) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingCostX10650005").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormShippingCostX10650005(element: JsonElement): InlineV1InvoicesPostRequestFormShippingCostX10650005Inspection {
  val matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed = element.isJsonDecodable<InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed>()
  val matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276>()
  return InlineV1InvoicesPostRequestFormShippingCostX10650005Inspection(
    matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed = matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed,
    matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276 = matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed) add("InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed: value does not match InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed")
      if (!matchesInlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276) add("InlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276: value does not match InlineV1InvoicesPostRequestFormShippingCostAnyOf2X1e639276")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
