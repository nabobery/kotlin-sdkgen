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

public enum class InlineGelatoDocumentReportIssuedDateX5d222158Branch {
  GelatoDataDocumentReportIssuedDate,
}

public sealed class InlineGelatoDocumentReportIssuedDateX5d222158DecodingException(
  message: String,
) : SerializationException(message)

public class InlineGelatoDocumentReportIssuedDateX5d222158NoMatchException(
  message: String,
) : InlineGelatoDocumentReportIssuedDateX5d222158DecodingException(message)

internal data class InlineGelatoDocumentReportIssuedDateX5d222158Inspection(
  public val matchesGelatoDataDocumentReportIssuedDate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoDataDocumentReportIssuedDate).count { it }
}

/**
 * Issued date of the document.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_document_report/properties/issued_date
 */
@Serializable(with = InlineGelatoDocumentReportIssuedDateX5d222158.Serializer::class)
public class InlineGelatoDocumentReportIssuedDateX5d222158 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineGelatoDocumentReportIssuedDateX5d222158Inspection,
) {
  public val gelatoDataDocumentReportIssuedDate: GelatoDataDocumentReportIssuedDateView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoDataDocumentReportIssuedDate) json.decodeFromJsonElement<GelatoDataDocumentReportIssuedDateView>(raw) else null }

  public val matchedBranches: Set<InlineGelatoDocumentReportIssuedDateX5d222158Branch>
    get() = buildSet {
      if (inspection.matchesGelatoDataDocumentReportIssuedDate) add(InlineGelatoDocumentReportIssuedDateX5d222158Branch.GelatoDataDocumentReportIssuedDate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineGelatoDocumentReportIssuedDateX5d222158 {
      val inspection = inspectInlineGelatoDocumentReportIssuedDateX5d222158(raw)
      if (inspection.matchCount == 0) {
        throw InlineGelatoDocumentReportIssuedDateX5d222158NoMatchException("InlineGelatoDocumentReportIssuedDateX5d222158 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineGelatoDocumentReportIssuedDateX5d222158(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoDocumentReportIssuedDateX5d222158> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGelatoDocumentReportIssuedDateX5d222158 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoDocumentReportIssuedDateX5d222158")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineGelatoDocumentReportIssuedDateX5d222158) {
      encoder.requireJsonEncoder("InlineGelatoDocumentReportIssuedDateX5d222158").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineGelatoDocumentReportIssuedDateX5d222158(element: JsonElement): InlineGelatoDocumentReportIssuedDateX5d222158Inspection {
  val raw = element as? JsonObject ?: return InlineGelatoDocumentReportIssuedDateX5d222158Inspection(
    matchesGelatoDataDocumentReportIssuedDate = false,
    failures = listOf("GelatoDataDocumentReportIssuedDate: expected JSON object"),
  )
  val matchesGelatoDataDocumentReportIssuedDate = true
  return InlineGelatoDocumentReportIssuedDateX5d222158Inspection(
    matchesGelatoDataDocumentReportIssuedDate = matchesGelatoDataDocumentReportIssuedDate,
    failures = buildList {
      if (!matchesGelatoDataDocumentReportIssuedDate) add("GelatoDataDocumentReportIssuedDate: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
