package io.github.nabobery.sdkgen.generated

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

@Serializable
public data class InlineCustomToolFormatXe591d582InlineCustomToolFormatAnyOf1Xf9026382View(
  public val type: InlineCustomToolFormatAnyOf1TypeX7b071c68,
)

@Serializable
public data class InlineCustomToolFormatXe591d582InlineCustomToolFormatAnyOf2X95660593View(
  public val definition: String,
  public val syntax: InlineCustomToolFormatAnyOf2SyntaxX3ad1799a,
  public val type: InlineCustomToolFormatAnyOf2TypeXd6ef7a4a,
)

public enum class InlineCustomToolFormatXe591d582Branch {
  InlineCustomToolFormatAnyOf1Xf9026382,
  InlineCustomToolFormatAnyOf2X95660593,
}

public sealed class InlineCustomToolFormatXe591d582DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomToolFormatXe591d582NoMatchException(
  message: String,
) : InlineCustomToolFormatXe591d582DecodingException(message)

internal data class InlineCustomToolFormatXe591d582Inspection(
  public val matchesInlineCustomToolFormatAnyOf1Xf9026382: Boolean,
  public val matchesInlineCustomToolFormatAnyOf2X95660593: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineCustomToolFormatAnyOf1Xf9026382, matchesInlineCustomToolFormatAnyOf2X95660593).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format
 */
@Serializable(with = InlineCustomToolFormatXe591d582.Serializer::class)
public class InlineCustomToolFormatXe591d582 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomToolFormatXe591d582Inspection,
) {
  public val inlineCustomToolFormatAnyOf1Xf9026382:
      InlineCustomToolFormatXe591d582InlineCustomToolFormatAnyOf1Xf9026382View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineCustomToolFormatAnyOf1Xf9026382) json.decodeFromJsonElement<InlineCustomToolFormatXe591d582InlineCustomToolFormatAnyOf1Xf9026382View>(raw) else null }

  public val inlineCustomToolFormatAnyOf2X95660593:
      InlineCustomToolFormatXe591d582InlineCustomToolFormatAnyOf2X95660593View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineCustomToolFormatAnyOf2X95660593) json.decodeFromJsonElement<InlineCustomToolFormatXe591d582InlineCustomToolFormatAnyOf2X95660593View>(raw) else null }

  public val matchedBranches: Set<InlineCustomToolFormatXe591d582Branch>
    get() = buildSet {
      if (inspection.matchesInlineCustomToolFormatAnyOf1Xf9026382) add(InlineCustomToolFormatXe591d582Branch.InlineCustomToolFormatAnyOf1Xf9026382)
      if (inspection.matchesInlineCustomToolFormatAnyOf2X95660593) add(InlineCustomToolFormatXe591d582Branch.InlineCustomToolFormatAnyOf2X95660593)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomToolFormatXe591d582 {
      val inspection = inspectInlineCustomToolFormatXe591d582(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomToolFormatXe591d582NoMatchException("InlineCustomToolFormatXe591d582 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomToolFormatXe591d582(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCustomToolFormatXe591d582> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomToolFormatXe591d582 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomToolFormatXe591d582")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomToolFormatXe591d582) {
      encoder.requireJsonEncoder("InlineCustomToolFormatXe591d582").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomToolFormatXe591d582(element: JsonElement): InlineCustomToolFormatXe591d582Inspection {
  val raw = element as? JsonObject ?: return InlineCustomToolFormatXe591d582Inspection(
    matchesInlineCustomToolFormatAnyOf1Xf9026382 = false,
    matchesInlineCustomToolFormatAnyOf2X95660593 = false,
    failures = listOf("InlineCustomToolFormatAnyOf1Xf9026382: expected JSON object", "InlineCustomToolFormatAnyOf2X95660593: expected JSON object"),
  )
  val matchesInlineCustomToolFormatAnyOf1Xf9026382 = raw["type"] != null
  val matchesInlineCustomToolFormatAnyOf2X95660593 = raw["definition"].isString() && raw["syntax"] != null && raw["type"] != null
  return InlineCustomToolFormatXe591d582Inspection(
    matchesInlineCustomToolFormatAnyOf1Xf9026382 = matchesInlineCustomToolFormatAnyOf1Xf9026382,
    matchesInlineCustomToolFormatAnyOf2X95660593 = matchesInlineCustomToolFormatAnyOf2X95660593,
    failures = buildList {
      if (!matchesInlineCustomToolFormatAnyOf1Xf9026382) add("InlineCustomToolFormatAnyOf1Xf9026382: required properties 'type' do not match their declared types")
      if (!matchesInlineCustomToolFormatAnyOf2X95660593) add("InlineCustomToolFormatAnyOf2X95660593: required properties 'definition', 'syntax', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
