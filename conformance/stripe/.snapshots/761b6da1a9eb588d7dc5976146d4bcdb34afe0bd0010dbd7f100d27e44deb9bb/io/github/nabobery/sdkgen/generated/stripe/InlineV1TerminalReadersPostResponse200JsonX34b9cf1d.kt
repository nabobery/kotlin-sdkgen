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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1TerminalReadersPostResponse200JsonX34b9cf1dBranch {
  TerminalReader,
  DeletedTerminalReader,
}

public sealed class InlineV1TerminalReadersPostResponse200JsonX34b9cf1dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalReadersPostResponse200JsonX34b9cf1dNoMatchException(
  message: String,
) : InlineV1TerminalReadersPostResponse200JsonX34b9cf1dDecodingException(message)

internal data class InlineV1TerminalReadersPostResponse200JsonX34b9cf1dInspection(
  public val matchesTerminalReader: Boolean,
  public val matchesDeletedTerminalReader: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTerminalReader, matchesDeletedTerminalReader).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}/post/responses/200/content/application~1json/sc
 * hema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}/post/responses/200/content/application~1json/sc
 * hema
 */
@Serializable(with = InlineV1TerminalReadersPostResponse200JsonX34b9cf1d.Serializer::class)
public class InlineV1TerminalReadersPostResponse200JsonX34b9cf1d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalReadersPostResponse200JsonX34b9cf1dInspection,
) {
  public val terminalReader: TerminalReaderView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTerminalReader) json.decodeFromJsonElement<TerminalReaderView>(raw) else null }

  public val deletedTerminalReader: DeletedTerminalReaderView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedTerminalReader) json.decodeFromJsonElement<DeletedTerminalReaderView>(raw) else null }

  public val matchedBranches: Set<InlineV1TerminalReadersPostResponse200JsonX34b9cf1dBranch>
    get() = buildSet {
      if (inspection.matchesTerminalReader) add(InlineV1TerminalReadersPostResponse200JsonX34b9cf1dBranch.TerminalReader)
      if (inspection.matchesDeletedTerminalReader) add(InlineV1TerminalReadersPostResponse200JsonX34b9cf1dBranch.DeletedTerminalReader)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalReadersPostResponse200JsonX34b9cf1d {
      val inspection = inspectInlineV1TerminalReadersPostResponse200JsonX34b9cf1d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalReadersPostResponse200JsonX34b9cf1dNoMatchException("InlineV1TerminalReadersPostResponse200JsonX34b9cf1d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalReadersPostResponse200JsonX34b9cf1d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersPostResponse200JsonX34b9cf1d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersPostResponse200JsonX34b9cf1d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersPostResponse200JsonX34b9cf1d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersPostResponse200JsonX34b9cf1d) {
      encoder.requireJsonEncoder("InlineV1TerminalReadersPostResponse200JsonX34b9cf1d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalReadersPostResponse200JsonX34b9cf1d(element: JsonElement): InlineV1TerminalReadersPostResponse200JsonX34b9cf1dInspection {
  val raw = element as? JsonObject ?: return InlineV1TerminalReadersPostResponse200JsonX34b9cf1dInspection(
    matchesTerminalReader = false,
    matchesDeletedTerminalReader = false,
    failures = listOf("TerminalReader: expected JSON object", "DeletedTerminalReader: expected JSON object"),
  )
  val matchesTerminalReader = raw["device_type"] != null && raw["id"].isString() && raw["label"].isString() && raw["livemode"] != null && raw["metadata"] != null && raw["object"] != null && raw["serial_number"].isString()
  val matchesDeletedTerminalReader = raw["deleted"] != null && raw["device_type"] != null && raw["id"].isString() && raw["object"] != null && raw["serial_number"].isString()
  return InlineV1TerminalReadersPostResponse200JsonX34b9cf1dInspection(
    matchesTerminalReader = matchesTerminalReader,
    matchesDeletedTerminalReader = matchesDeletedTerminalReader,
    failures = buildList {
      if (!matchesTerminalReader) add("TerminalReader: required properties 'device_type', 'id', 'label', 'livemode', 'metadata', 'object', 'serial_number' do not match their declared types")
      if (!matchesDeletedTerminalReader) add("DeletedTerminalReader: required properties 'deleted', 'device_type', 'id', 'object', 'serial_number' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
