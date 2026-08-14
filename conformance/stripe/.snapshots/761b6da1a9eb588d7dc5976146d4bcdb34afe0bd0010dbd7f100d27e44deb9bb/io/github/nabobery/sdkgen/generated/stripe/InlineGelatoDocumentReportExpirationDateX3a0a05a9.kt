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

public enum class InlineGelatoDocumentReportExpirationDateX3a0a05a9Branch {
  GelatoDataDocumentReportExpirationDate,
}

public sealed class InlineGelatoDocumentReportExpirationDateX3a0a05a9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineGelatoDocumentReportExpirationDateX3a0a05a9NoMatchException(
  message: String,
) : InlineGelatoDocumentReportExpirationDateX3a0a05a9DecodingException(message)

internal data class InlineGelatoDocumentReportExpirationDateX3a0a05a9Inspection(
  public val matchesGelatoDataDocumentReportExpirationDate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoDataDocumentReportExpirationDate).count { it }
}

/**
 * Expiration date of the document.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_document_report/properties/expiration_date
 */
@Serializable(with = InlineGelatoDocumentReportExpirationDateX3a0a05a9.Serializer::class)
public class InlineGelatoDocumentReportExpirationDateX3a0a05a9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineGelatoDocumentReportExpirationDateX3a0a05a9Inspection,
) {
  public val gelatoDataDocumentReportExpirationDate: GelatoDataDocumentReportExpirationDateView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoDataDocumentReportExpirationDate) json.decodeFromJsonElement<GelatoDataDocumentReportExpirationDateView>(raw) else null }

  public val matchedBranches: Set<InlineGelatoDocumentReportExpirationDateX3a0a05a9Branch>
    get() = buildSet {
      if (inspection.matchesGelatoDataDocumentReportExpirationDate) add(InlineGelatoDocumentReportExpirationDateX3a0a05a9Branch.GelatoDataDocumentReportExpirationDate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineGelatoDocumentReportExpirationDateX3a0a05a9 {
      val inspection = inspectInlineGelatoDocumentReportExpirationDateX3a0a05a9(raw)
      if (inspection.matchCount == 0) {
        throw InlineGelatoDocumentReportExpirationDateX3a0a05a9NoMatchException("InlineGelatoDocumentReportExpirationDateX3a0a05a9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineGelatoDocumentReportExpirationDateX3a0a05a9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoDocumentReportExpirationDateX3a0a05a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGelatoDocumentReportExpirationDateX3a0a05a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoDocumentReportExpirationDateX3a0a05a9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineGelatoDocumentReportExpirationDateX3a0a05a9) {
      encoder.requireJsonEncoder("InlineGelatoDocumentReportExpirationDateX3a0a05a9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineGelatoDocumentReportExpirationDateX3a0a05a9(element: JsonElement): InlineGelatoDocumentReportExpirationDateX3a0a05a9Inspection {
  val raw = element as? JsonObject ?: return InlineGelatoDocumentReportExpirationDateX3a0a05a9Inspection(
    matchesGelatoDataDocumentReportExpirationDate = false,
    failures = listOf("GelatoDataDocumentReportExpirationDate: expected JSON object"),
  )
  val matchesGelatoDataDocumentReportExpirationDate = true
  return InlineGelatoDocumentReportExpirationDateX3a0a05a9Inspection(
    matchesGelatoDataDocumentReportExpirationDate = matchesGelatoDataDocumentReportExpirationDate,
    failures = buildList {
      if (!matchesGelatoDataDocumentReportExpirationDate) add("GelatoDataDocumentReportExpirationDate: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
