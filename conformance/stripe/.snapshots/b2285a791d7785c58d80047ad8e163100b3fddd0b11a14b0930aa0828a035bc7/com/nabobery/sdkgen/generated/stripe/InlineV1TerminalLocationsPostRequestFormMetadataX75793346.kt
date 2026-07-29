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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1TerminalLocationsPostRequestFormMetadataX75793346Branch {
  Branch1,
  InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b,
}

public sealed class InlineV1TerminalLocationsPostRequestFormMetadataX75793346DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalLocationsPostRequestFormMetadataX75793346NoMatchException(
  message: String,
) : InlineV1TerminalLocationsPostRequestFormMetadataX75793346DecodingException(message)

internal data class InlineV1TerminalLocationsPostRequestFormMetadataX75793346Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/metadata
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormMetadataX75793346.Serializer::class)
public class InlineV1TerminalLocationsPostRequestFormMetadataX75793346 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalLocationsPostRequestFormMetadataX75793346Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b:
      InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b) json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b>(raw) else null }

  public val matchedBranches: Set<InlineV1TerminalLocationsPostRequestFormMetadataX75793346Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TerminalLocationsPostRequestFormMetadataX75793346Branch.Branch1)
      if (inspection.matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b) add(InlineV1TerminalLocationsPostRequestFormMetadataX75793346Branch.InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalLocationsPostRequestFormMetadataX75793346 {
      val inspection = inspectInlineV1TerminalLocationsPostRequestFormMetadataX75793346(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalLocationsPostRequestFormMetadataX75793346NoMatchException("InlineV1TerminalLocationsPostRequestFormMetadataX75793346 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalLocationsPostRequestFormMetadataX75793346(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormMetadataX75793346> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormMetadataX75793346 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalLocationsPostRequestFormMetadataX75793346")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalLocationsPostRequestFormMetadataX75793346) {
      encoder.requireJsonEncoder("InlineV1TerminalLocationsPostRequestFormMetadataX75793346").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalLocationsPostRequestFormMetadataX75793346(element: JsonElement): InlineV1TerminalLocationsPostRequestFormMetadataX75793346Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b = element.isJsonDecodable<InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b>()
  return InlineV1TerminalLocationsPostRequestFormMetadataX75793346Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b = matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b) add("InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b: value does not match InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
