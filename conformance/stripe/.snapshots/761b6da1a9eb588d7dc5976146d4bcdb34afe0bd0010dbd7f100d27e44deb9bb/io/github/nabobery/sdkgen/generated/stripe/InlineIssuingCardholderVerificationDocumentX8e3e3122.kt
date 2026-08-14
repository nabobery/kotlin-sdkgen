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

public enum class InlineIssuingCardholderVerificationDocumentX8e3e3122Branch {
  IssuingCardholderIdDocument,
}

public sealed class InlineIssuingCardholderVerificationDocumentX8e3e3122DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardholderVerificationDocumentX8e3e3122NoMatchException(
  message: String,
) : InlineIssuingCardholderVerificationDocumentX8e3e3122DecodingException(message)

internal data class InlineIssuingCardholderVerificationDocumentX8e3e3122Inspection(
  public val matchesIssuingCardholderIdDocument: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingCardholderIdDocument).count { it }
}

/**
 * An identifying document, either a passport or local ID card.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_verification/properties/document
 */
@Serializable(with = InlineIssuingCardholderVerificationDocumentX8e3e3122.Serializer::class)
public class InlineIssuingCardholderVerificationDocumentX8e3e3122 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardholderVerificationDocumentX8e3e3122Inspection,
) {
  public val issuingCardholderIdDocument: IssuingCardholderIdDocumentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardholderIdDocument) json.decodeFromJsonElement<IssuingCardholderIdDocumentView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardholderVerificationDocumentX8e3e3122Branch>
    get() = buildSet {
      if (inspection.matchesIssuingCardholderIdDocument) add(InlineIssuingCardholderVerificationDocumentX8e3e3122Branch.IssuingCardholderIdDocument)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardholderVerificationDocumentX8e3e3122 {
      val inspection = inspectInlineIssuingCardholderVerificationDocumentX8e3e3122(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardholderVerificationDocumentX8e3e3122NoMatchException("InlineIssuingCardholderVerificationDocumentX8e3e3122 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardholderVerificationDocumentX8e3e3122(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardholderVerificationDocumentX8e3e3122> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderVerificationDocumentX8e3e3122 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardholderVerificationDocumentX8e3e3122")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderVerificationDocumentX8e3e3122) {
      encoder.requireJsonEncoder("InlineIssuingCardholderVerificationDocumentX8e3e3122").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardholderVerificationDocumentX8e3e3122(element: JsonElement): InlineIssuingCardholderVerificationDocumentX8e3e3122Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingCardholderVerificationDocumentX8e3e3122Inspection(
    matchesIssuingCardholderIdDocument = false,
    failures = listOf("IssuingCardholderIdDocument: expected JSON object"),
  )
  val matchesIssuingCardholderIdDocument = true
  return InlineIssuingCardholderVerificationDocumentX8e3e3122Inspection(
    matchesIssuingCardholderIdDocument = matchesIssuingCardholderIdDocument,
    failures = buildList {
      if (!matchesIssuingCardholderIdDocument) add("IssuingCardholderIdDocument: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
