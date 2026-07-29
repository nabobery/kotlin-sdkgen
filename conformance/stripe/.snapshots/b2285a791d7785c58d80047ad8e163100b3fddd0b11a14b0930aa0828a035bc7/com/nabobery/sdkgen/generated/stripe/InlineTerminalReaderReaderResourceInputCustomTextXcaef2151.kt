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

public enum class InlineTerminalReaderReaderResourceInputCustomTextXcaef2151Branch {
  TerminalReaderReaderResourceCustomText,
}

public sealed class InlineTerminalReaderReaderResourceInputCustomTextXcaef2151DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTerminalReaderReaderResourceInputCustomTextXcaef2151NoMatchException(
  message: String,
) : InlineTerminalReaderReaderResourceInputCustomTextXcaef2151DecodingException(message)

internal data class InlineTerminalReaderReaderResourceInputCustomTextXcaef2151Inspection(
  public val matchesTerminalReaderReaderResourceCustomText: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTerminalReaderReaderResourceCustomText).count { it }
}

/**
 * Default text of input being collected.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_input/properties/custom_text
 */
@Serializable(with = InlineTerminalReaderReaderResourceInputCustomTextXcaef2151.Serializer::class)
public class InlineTerminalReaderReaderResourceInputCustomTextXcaef2151 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTerminalReaderReaderResourceInputCustomTextXcaef2151Inspection,
) {
  public val terminalReaderReaderResourceCustomText: TerminalReaderReaderResourceCustomTextView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTerminalReaderReaderResourceCustomText) json.decodeFromJsonElement<TerminalReaderReaderResourceCustomTextView>(raw) else null }

  public val matchedBranches: Set<InlineTerminalReaderReaderResourceInputCustomTextXcaef2151Branch>
    get() = buildSet {
      if (inspection.matchesTerminalReaderReaderResourceCustomText) add(InlineTerminalReaderReaderResourceInputCustomTextXcaef2151Branch.TerminalReaderReaderResourceCustomText)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTerminalReaderReaderResourceInputCustomTextXcaef2151 {
      val inspection = inspectInlineTerminalReaderReaderResourceInputCustomTextXcaef2151(raw)
      if (inspection.matchCount == 0) {
        throw InlineTerminalReaderReaderResourceInputCustomTextXcaef2151NoMatchException("InlineTerminalReaderReaderResourceInputCustomTextXcaef2151 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTerminalReaderReaderResourceInputCustomTextXcaef2151(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTerminalReaderReaderResourceInputCustomTextXcaef2151> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourceInputCustomTextXcaef2151 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTerminalReaderReaderResourceInputCustomTextXcaef2151")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderResourceInputCustomTextXcaef2151) {
      encoder.requireJsonEncoder("InlineTerminalReaderReaderResourceInputCustomTextXcaef2151").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTerminalReaderReaderResourceInputCustomTextXcaef2151(element: JsonElement): InlineTerminalReaderReaderResourceInputCustomTextXcaef2151Inspection {
  val raw = element as? JsonObject ?: return InlineTerminalReaderReaderResourceInputCustomTextXcaef2151Inspection(
    matchesTerminalReaderReaderResourceCustomText = false,
    failures = listOf("TerminalReaderReaderResourceCustomText: expected JSON object"),
  )
  val matchesTerminalReaderReaderResourceCustomText = true
  return InlineTerminalReaderReaderResourceInputCustomTextXcaef2151Inspection(
    matchesTerminalReaderReaderResourceCustomText = matchesTerminalReaderReaderResourceCustomText,
    failures = buildList {
      if (!matchesTerminalReaderReaderResourceCustomText) add("TerminalReaderReaderResourceCustomText: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
