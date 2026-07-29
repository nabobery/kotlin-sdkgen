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

public enum class InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3Branch {
  Branch1,
  InlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c,
}

public sealed class InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3DecodingException(message)

internal data class InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/metadata
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c:
      InlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c>(raw) else null }

  public val matchedBranches: Set<InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c) add(InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3Branch.InlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3 {
      val inspection = inspectInlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3NoMatchException("InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3(element: JsonElement): InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c = element.isJsonDecodable<InlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c>()
  return InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c = matchesInlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c) add("InlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c: value does not match InlineV1AccountsPostRequestFormIndividualMetadataAnyOf2X81410a8c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
