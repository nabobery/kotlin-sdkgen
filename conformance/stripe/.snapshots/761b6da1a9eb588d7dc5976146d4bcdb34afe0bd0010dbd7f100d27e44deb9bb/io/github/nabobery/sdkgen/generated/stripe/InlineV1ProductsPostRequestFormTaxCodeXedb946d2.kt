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

public enum class InlineV1ProductsPostRequestFormTaxCodeXedb946d2Branch {
  Branch1,
  InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde,
}

public sealed class InlineV1ProductsPostRequestFormTaxCodeXedb946d2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ProductsPostRequestFormTaxCodeXedb946d2NoMatchException(
  message: String,
) : InlineV1ProductsPostRequestFormTaxCodeXedb946d2DecodingException(message)

internal data class InlineV1ProductsPostRequestFormTaxCodeXedb946d2Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde).count { it }
}

/**
 * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/tax_code
 */
@Serializable(with = InlineV1ProductsPostRequestFormTaxCodeXedb946d2.Serializer::class)
public class InlineV1ProductsPostRequestFormTaxCodeXedb946d2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ProductsPostRequestFormTaxCodeXedb946d2Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde:
      InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde) json.decodeFromJsonElement<InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde>(raw) else null }

  public val matchedBranches: Set<InlineV1ProductsPostRequestFormTaxCodeXedb946d2Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ProductsPostRequestFormTaxCodeXedb946d2Branch.Branch1)
      if (inspection.matchesInlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde) add(InlineV1ProductsPostRequestFormTaxCodeXedb946d2Branch.InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ProductsPostRequestFormTaxCodeXedb946d2 {
      val inspection = inspectInlineV1ProductsPostRequestFormTaxCodeXedb946d2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ProductsPostRequestFormTaxCodeXedb946d2NoMatchException("InlineV1ProductsPostRequestFormTaxCodeXedb946d2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ProductsPostRequestFormTaxCodeXedb946d2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ProductsPostRequestFormTaxCodeXedb946d2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormTaxCodeXedb946d2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormTaxCodeXedb946d2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormTaxCodeXedb946d2) {
      encoder.requireJsonEncoder("InlineV1ProductsPostRequestFormTaxCodeXedb946d2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ProductsPostRequestFormTaxCodeXedb946d2(element: JsonElement): InlineV1ProductsPostRequestFormTaxCodeXedb946d2Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde = element.isJsonDecodable<InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde>()
  return InlineV1ProductsPostRequestFormTaxCodeXedb946d2Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde = matchesInlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde) add("InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde: value does not match InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
