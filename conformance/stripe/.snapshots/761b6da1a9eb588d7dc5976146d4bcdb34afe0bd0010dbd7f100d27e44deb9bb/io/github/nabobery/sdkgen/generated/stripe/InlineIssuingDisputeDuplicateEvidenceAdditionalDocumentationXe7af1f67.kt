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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67Branch {
  Branch1,
  File,
}

public sealed class InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67NoMatchException(
  message: String,
) : InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67DecodingException(message)

internal data class InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67Inspection(
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
 * sdkgen://source/openapi.json#/components/schemas/issuing_dispute_duplicate_evidence/properties/additional_documentati
 * on
 */
@Serializable(with = InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67.Serializer::class)
public class InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67Branch.Branch1)
      if (inspection.matchesFile) add(InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67 {
      val inspection = inspectInlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67NoMatchException("InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67) {
      encoder.requireJsonEncoder("InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67(element: JsonElement): InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineIssuingDisputeDuplicateEvidenceAdditionalDocumentationXe7af1f67Inspection(
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
