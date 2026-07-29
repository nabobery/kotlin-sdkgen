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

public enum class InlineV1ProductsGetParameterXca1d8d3dBranch {
  InlineV1ProductsGetParameterAnyOf1X448cc4a9,
  Branch2,
}

public sealed class InlineV1ProductsGetParameterXca1d8d3dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ProductsGetParameterXca1d8d3dNoMatchException(
  message: String,
) : InlineV1ProductsGetParameterXca1d8d3dDecodingException(message)

internal data class InlineV1ProductsGetParameterXca1d8d3dInspection(
  public val matchesInlineV1ProductsGetParameterAnyOf1X448cc4a9: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1ProductsGetParameterAnyOf1X448cc4a9, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1products/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1products/get/parameters/1/schema
 */
@Serializable(with = InlineV1ProductsGetParameterXca1d8d3d.Serializer::class)
public class InlineV1ProductsGetParameterXca1d8d3d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ProductsGetParameterXca1d8d3dInspection,
) {
  public val inlineV1ProductsGetParameterAnyOf1X448cc4a9:
      InlineV1ProductsGetParameterAnyOf1X448cc4a9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ProductsGetParameterAnyOf1X448cc4a9) json.decodeFromJsonElement<InlineV1ProductsGetParameterAnyOf1X448cc4a9>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1ProductsGetParameterXca1d8d3dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1ProductsGetParameterAnyOf1X448cc4a9) add(InlineV1ProductsGetParameterXca1d8d3dBranch.InlineV1ProductsGetParameterAnyOf1X448cc4a9)
      if (inspection.matchesBranch2) add(InlineV1ProductsGetParameterXca1d8d3dBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ProductsGetParameterXca1d8d3d {
      val inspection = inspectInlineV1ProductsGetParameterXca1d8d3d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ProductsGetParameterXca1d8d3dNoMatchException("InlineV1ProductsGetParameterXca1d8d3d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ProductsGetParameterXca1d8d3d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1ProductsGetParameterXca1d8d3d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsGetParameterXca1d8d3d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsGetParameterXca1d8d3d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsGetParameterXca1d8d3d) {
      encoder.requireJsonEncoder("InlineV1ProductsGetParameterXca1d8d3d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ProductsGetParameterXca1d8d3d(element: JsonElement): InlineV1ProductsGetParameterXca1d8d3dInspection {
  val matchesInlineV1ProductsGetParameterAnyOf1X448cc4a9 = element.isJsonDecodable<InlineV1ProductsGetParameterAnyOf1X448cc4a9>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1ProductsGetParameterXca1d8d3dInspection(
    matchesInlineV1ProductsGetParameterAnyOf1X448cc4a9 = matchesInlineV1ProductsGetParameterAnyOf1X448cc4a9,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1ProductsGetParameterAnyOf1X448cc4a9) add("InlineV1ProductsGetParameterAnyOf1X448cc4a9: value does not match InlineV1ProductsGetParameterAnyOf1X448cc4a9")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
