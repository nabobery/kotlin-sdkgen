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

public enum class InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dBranch {
  LegalEntityPersonVerificationDocument,
}

public sealed class InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dNoMatchException(
  message: String,
) : InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dDecodingException(message)

internal data class InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dInspection(
  public val matchesLegalEntityPersonVerificationDocument: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesLegalEntityPersonVerificationDocument).count { it }
}

/**
 * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/legal_entity_person_verification/properties/additional_document
 */
@Serializable(with = InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d.Serializer::class)
public class InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dInspection,
) {
  public val legalEntityPersonVerificationDocument: LegalEntityPersonVerificationDocumentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLegalEntityPersonVerificationDocument) json.decodeFromJsonElement<LegalEntityPersonVerificationDocumentView>(raw) else null }

  public val matchedBranches:
      Set<InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dBranch>
    get() = buildSet {
      if (inspection.matchesLegalEntityPersonVerificationDocument) add(InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dBranch.LegalEntityPersonVerificationDocument)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d {
      val inspection = inspectInlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d(raw)
      if (inspection.matchCount == 0) {
        throw InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dNoMatchException("InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d) {
      encoder.requireJsonEncoder("InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d(element: JsonElement): InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dInspection {
  val raw = element as? JsonObject ?: return InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dInspection(
    matchesLegalEntityPersonVerificationDocument = false,
    failures = listOf("LegalEntityPersonVerificationDocument: expected JSON object"),
  )
  val matchesLegalEntityPersonVerificationDocument = true
  return InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13dInspection(
    matchesLegalEntityPersonVerificationDocument = matchesLegalEntityPersonVerificationDocument,
    failures = buildList {
      if (!matchesLegalEntityPersonVerificationDocument) add("LegalEntityPersonVerificationDocument: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
