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

public enum class InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8Branch {
  TerminalReaderReaderResourceCart,
}

public sealed class InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8NoMatchException(
  message: String,
) : InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8DecodingException(message)

internal data class InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8Inspection(
  public val matchesTerminalReaderReaderResourceCart: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTerminalReaderReaderResourceCart).count { it }
}

/**
 * Cart object to be displayed by the reader, including line items, amounts, and currency.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_set_reader_display_action/properties
 * /cart
 */
@Serializable(with = InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8.Serializer::class)
public class InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8Inspection,
) {
  public val terminalReaderReaderResourceCart: TerminalReaderReaderResourceCartView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTerminalReaderReaderResourceCart) json.decodeFromJsonElement<TerminalReaderReaderResourceCartView>(raw) else null }

  public val matchedBranches:
      Set<InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8Branch>
    get() = buildSet {
      if (inspection.matchesTerminalReaderReaderResourceCart) add(InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8Branch.TerminalReaderReaderResourceCart)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8 {
      val inspection = inspectInlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8(raw)
      if (inspection.matchCount == 0) {
        throw InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8NoMatchException("InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8) {
      encoder.requireJsonEncoder("InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8(element: JsonElement): InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8Inspection {
  val raw = element as? JsonObject ?: return InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8Inspection(
    matchesTerminalReaderReaderResourceCart = false,
    failures = listOf("TerminalReaderReaderResourceCart: expected JSON object"),
  )
  val matchesTerminalReaderReaderResourceCart = raw["currency"].isString() && raw["line_items"] != null && raw["total"] != null
  return InlineTerminalReaderReaderResourceSetReaderDisplayActionCartXcada7ad8Inspection(
    matchesTerminalReaderReaderResourceCart = matchesTerminalReaderReaderResourceCart,
    failures = buildList {
      if (!matchesTerminalReaderReaderResourceCart) add("TerminalReaderReaderResourceCart: required properties 'currency', 'line_items', 'total' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
