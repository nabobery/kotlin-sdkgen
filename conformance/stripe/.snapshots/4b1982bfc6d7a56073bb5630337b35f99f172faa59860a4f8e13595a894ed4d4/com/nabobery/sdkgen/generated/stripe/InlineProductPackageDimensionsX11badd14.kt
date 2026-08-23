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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineProductPackageDimensionsX11badd14Branch {
  PackageDimensions,
}

public sealed class InlineProductPackageDimensionsX11badd14DecodingException(
  message: String,
) : SerializationException(message)

public class InlineProductPackageDimensionsX11badd14NoMatchException(
  message: String,
) : InlineProductPackageDimensionsX11badd14DecodingException(message)

internal data class InlineProductPackageDimensionsX11badd14Inspection(
  public val matchesPackageDimensions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPackageDimensions).count { it }
}

/**
 * The dimensions of this product for shipping purposes.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/product/properties/package_dimensions
 */
@Serializable(with = InlineProductPackageDimensionsX11badd14.Serializer::class)
public class InlineProductPackageDimensionsX11badd14 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineProductPackageDimensionsX11badd14Inspection,
) {
  public val packageDimensions: PackageDimensionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPackageDimensions) json.decodeFromJsonElement<PackageDimensionsView>(raw) else null }

  public val matchedBranches: Set<InlineProductPackageDimensionsX11badd14Branch>
    get() = buildSet {
      if (inspection.matchesPackageDimensions) add(InlineProductPackageDimensionsX11badd14Branch.PackageDimensions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineProductPackageDimensionsX11badd14 {
      val inspection = inspectInlineProductPackageDimensionsX11badd14(raw)
      if (inspection.matchCount == 0) {
        throw InlineProductPackageDimensionsX11badd14NoMatchException("InlineProductPackageDimensionsX11badd14 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineProductPackageDimensionsX11badd14(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineProductPackageDimensionsX11badd14> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProductPackageDimensionsX11badd14 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProductPackageDimensionsX11badd14")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineProductPackageDimensionsX11badd14) {
      encoder.requireJsonEncoder("InlineProductPackageDimensionsX11badd14").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineProductPackageDimensionsX11badd14(element: JsonElement): InlineProductPackageDimensionsX11badd14Inspection {
  val raw = element as? JsonObject ?: return InlineProductPackageDimensionsX11badd14Inspection(
    matchesPackageDimensions = false,
    failures = listOf("PackageDimensions: expected JSON object"),
  )
  val matchesPackageDimensions = raw["height"] != null && raw["length"] != null && raw["weight"] != null && raw["width"] != null
  return InlineProductPackageDimensionsX11badd14Inspection(
    matchesPackageDimensions = matchesPackageDimensions,
    failures = buildList {
      if (!matchesPackageDimensions) add("PackageDimensions: required properties 'height', 'length', 'weight', 'width' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
