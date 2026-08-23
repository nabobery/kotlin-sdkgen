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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448Branch {
  Branch1,
  File,
}

public sealed class InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448NoMatchException(
  message: String,
) : InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448DecodingException(message)

internal data class InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the dispute.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_dispute_fraudulent_evidence/properties/additional_documentat
 * ion
 */
@Serializable(with = InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448.Serializer::class)
public class InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448Branch.Branch1)
      if (inspection.matchesFile) add(InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448 {
      val inspection = inspectInlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448NoMatchException("InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448) {
      encoder.requireJsonEncoder("InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448(element: JsonElement): InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineIssuingDisputeFraudulentEvidenceAdditionalDocumentationXfbcd8448Inspection(
    matchesBranch1 = matchesBranch1,
    matchesFile = matchesFile,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesFile) add("File: value does not match File")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
