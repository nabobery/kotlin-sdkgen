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

public enum class InlineGelatoDocumentReportErrorX9e751596Branch {
  GelatoDocumentReportError,
}

public sealed class InlineGelatoDocumentReportErrorX9e751596DecodingException(
  message: String,
) : SerializationException(message)

public class InlineGelatoDocumentReportErrorX9e751596NoMatchException(
  message: String,
) : InlineGelatoDocumentReportErrorX9e751596DecodingException(message)

internal data class InlineGelatoDocumentReportErrorX9e751596Inspection(
  public val matchesGelatoDocumentReportError: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoDocumentReportError).count { it }
}

/**
 * Details on the verification error. Present when status is `unverified`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_document_report/properties/error
 */
@Serializable(with = InlineGelatoDocumentReportErrorX9e751596.Serializer::class)
public class InlineGelatoDocumentReportErrorX9e751596 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineGelatoDocumentReportErrorX9e751596Inspection,
) {
  public val gelatoDocumentReportError: GelatoDocumentReportErrorView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoDocumentReportError) json.decodeFromJsonElement<GelatoDocumentReportErrorView>(raw) else null }

  public val matchedBranches: Set<InlineGelatoDocumentReportErrorX9e751596Branch>
    get() = buildSet {
      if (inspection.matchesGelatoDocumentReportError) add(InlineGelatoDocumentReportErrorX9e751596Branch.GelatoDocumentReportError)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineGelatoDocumentReportErrorX9e751596 {
      val inspection = inspectInlineGelatoDocumentReportErrorX9e751596(raw)
      if (inspection.matchCount == 0) {
        throw InlineGelatoDocumentReportErrorX9e751596NoMatchException("InlineGelatoDocumentReportErrorX9e751596 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineGelatoDocumentReportErrorX9e751596(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoDocumentReportErrorX9e751596> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGelatoDocumentReportErrorX9e751596 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoDocumentReportErrorX9e751596")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineGelatoDocumentReportErrorX9e751596) {
      encoder.requireJsonEncoder("InlineGelatoDocumentReportErrorX9e751596").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineGelatoDocumentReportErrorX9e751596(element: JsonElement): InlineGelatoDocumentReportErrorX9e751596Inspection {
  val raw = element as? JsonObject ?: return InlineGelatoDocumentReportErrorX9e751596Inspection(
    matchesGelatoDocumentReportError = false,
    failures = listOf("GelatoDocumentReportError: expected JSON object"),
  )
  val matchesGelatoDocumentReportError = true
  return InlineGelatoDocumentReportErrorX9e751596Inspection(
    matchesGelatoDocumentReportError = matchesGelatoDocumentReportError,
    failures = buildList {
      if (!matchesGelatoDocumentReportError) add("GelatoDocumentReportError: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
