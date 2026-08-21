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

public enum class InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95Branch {
  InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9,
  InlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144,
}

public sealed class InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95NoMatchException(
  message: String,
) : InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95DecodingException(message)

internal data class InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95Inspection(
  public val matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9: Boolean,
  public val matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9, matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144).count { it }
}

/**
 * The dimensions of this product for shipping purposes.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/package_dimensions
 */
@Serializable(with = InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95.Serializer::class)
public class InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95Inspection,
) {
  public val inlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9:
      InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9) json.decodeFromJsonElement<InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9>(raw) else null }

  public val inlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144:
      InlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144) json.decodeFromJsonElement<InlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144>(raw) else null }

  public val matchedBranches: Set<InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9) add(InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95Branch.InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9)
      if (inspection.matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144) add(InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95Branch.InlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95 {
      val inspection = inspectInlineV1ProductsPostRequestFormPackageDimensionsX1a994e95(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95NoMatchException("InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95) {
      encoder.requireJsonEncoder("InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ProductsPostRequestFormPackageDimensionsX1a994e95(element: JsonElement): InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95Inspection {
  val matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9 = element.isJsonDecodable<InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9>()
  val matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144 = element.isJsonDecodable<InlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144>()
  return InlineV1ProductsPostRequestFormPackageDimensionsX1a994e95Inspection(
    matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9 = matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9,
    matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144 = matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144,
    failures = buildList {
      if (!matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9) add("InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9: value does not match InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9")
      if (!matchesInlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144) add("InlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144: value does not match InlineV1ProductsPostRequestFormPackageDimensionsAnyOf2X0de52144")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
