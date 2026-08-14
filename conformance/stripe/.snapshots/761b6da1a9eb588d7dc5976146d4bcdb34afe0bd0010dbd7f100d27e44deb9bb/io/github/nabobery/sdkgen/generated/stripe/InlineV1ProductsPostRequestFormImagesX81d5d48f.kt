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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1ProductsPostRequestFormImagesX81d5d48fBranch {
  Branch1,
  InlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79,
}

public sealed class InlineV1ProductsPostRequestFormImagesX81d5d48fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ProductsPostRequestFormImagesX81d5d48fNoMatchException(
  message: String,
) : InlineV1ProductsPostRequestFormImagesX81d5d48fDecodingException(message)

internal data class InlineV1ProductsPostRequestFormImagesX81d5d48fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79).count { it }
}

/**
 * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/images
 */
@Serializable(with = InlineV1ProductsPostRequestFormImagesX81d5d48f.Serializer::class)
public class InlineV1ProductsPostRequestFormImagesX81d5d48f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ProductsPostRequestFormImagesX81d5d48fInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79:
      InlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79) json.decodeFromJsonElement<InlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79>(raw) else null }

  public val matchedBranches: Set<InlineV1ProductsPostRequestFormImagesX81d5d48fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ProductsPostRequestFormImagesX81d5d48fBranch.Branch1)
      if (inspection.matchesInlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79) add(InlineV1ProductsPostRequestFormImagesX81d5d48fBranch.InlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ProductsPostRequestFormImagesX81d5d48f {
      val inspection = inspectInlineV1ProductsPostRequestFormImagesX81d5d48f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ProductsPostRequestFormImagesX81d5d48fNoMatchException("InlineV1ProductsPostRequestFormImagesX81d5d48f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ProductsPostRequestFormImagesX81d5d48f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ProductsPostRequestFormImagesX81d5d48f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormImagesX81d5d48f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormImagesX81d5d48f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormImagesX81d5d48f) {
      encoder.requireJsonEncoder("InlineV1ProductsPostRequestFormImagesX81d5d48f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ProductsPostRequestFormImagesX81d5d48f(element: JsonElement): InlineV1ProductsPostRequestFormImagesX81d5d48fInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79 = element.isJsonDecodable<InlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79>()
  return InlineV1ProductsPostRequestFormImagesX81d5d48fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79 = matchesInlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79) add("InlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79: value does not match InlineV1ProductsPostRequestFormImagesAnyOf2Xc226ac79")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
