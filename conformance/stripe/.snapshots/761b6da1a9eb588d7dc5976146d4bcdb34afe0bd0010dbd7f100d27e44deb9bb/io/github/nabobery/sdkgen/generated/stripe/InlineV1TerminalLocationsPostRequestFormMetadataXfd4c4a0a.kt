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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aBranch {
  Branch1,
  InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784,
}

public sealed class InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aNoMatchException(
  message: String,
) : InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aDecodingException(message)

internal data class InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a.Serializer::class)
public class InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784:
      InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784) json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784>(raw) else null }

  public val matchedBranches: Set<InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aBranch.Branch1)
      if (inspection.matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784) add(InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aBranch.InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a {
      val inspection = inspectInlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aNoMatchException("InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a) {
      encoder.requireJsonEncoder("InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a(element: JsonElement): InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784 = element.isJsonDecodable<InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784>()
  return InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784 = matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784) add("InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784: value does not match InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X64647784")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
