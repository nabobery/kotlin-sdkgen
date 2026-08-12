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

public enum class InlineV1TerminalReadersPostRequestFormMetadataXda47b1edBranch {
  Branch1,
  InlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50,
}

public sealed class InlineV1TerminalReadersPostRequestFormMetadataXda47b1edDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalReadersPostRequestFormMetadataXda47b1edNoMatchException(
  message: String,
) : InlineV1TerminalReadersPostRequestFormMetadataXda47b1edDecodingException(message)

internal data class InlineV1TerminalReadersPostRequestFormMetadataXda47b1edInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/metadata
 */
@Serializable(with = InlineV1TerminalReadersPostRequestFormMetadataXda47b1ed.Serializer::class)
public class InlineV1TerminalReadersPostRequestFormMetadataXda47b1ed internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalReadersPostRequestFormMetadataXda47b1edInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50:
      InlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50) json.decodeFromJsonElement<InlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50>(raw) else null }

  public val matchedBranches: Set<InlineV1TerminalReadersPostRequestFormMetadataXda47b1edBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TerminalReadersPostRequestFormMetadataXda47b1edBranch.Branch1)
      if (inspection.matchesInlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50) add(InlineV1TerminalReadersPostRequestFormMetadataXda47b1edBranch.InlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalReadersPostRequestFormMetadataXda47b1ed {
      val inspection = inspectInlineV1TerminalReadersPostRequestFormMetadataXda47b1ed(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalReadersPostRequestFormMetadataXda47b1edNoMatchException("InlineV1TerminalReadersPostRequestFormMetadataXda47b1ed matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalReadersPostRequestFormMetadataXda47b1ed(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersPostRequestFormMetadataXda47b1ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersPostRequestFormMetadataXda47b1ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersPostRequestFormMetadataXda47b1ed")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersPostRequestFormMetadataXda47b1ed) {
      encoder.requireJsonEncoder("InlineV1TerminalReadersPostRequestFormMetadataXda47b1ed").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalReadersPostRequestFormMetadataXda47b1ed(element: JsonElement): InlineV1TerminalReadersPostRequestFormMetadataXda47b1edInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50 = element.isJsonDecodable<InlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50>()
  return InlineV1TerminalReadersPostRequestFormMetadataXda47b1edInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50 = matchesInlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50) add("InlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50: value does not match InlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
