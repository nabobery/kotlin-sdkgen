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

public enum class InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baBranch {
  Branch1,
  File,
}

public sealed class InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baNoMatchException(
  message: String,
) : InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baDecodingException(message)

internal data class InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baInspection(
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
 * sdkgen://source/openapi.json#/components/schemas/issuing_dispute_other_evidence/properties/additional_documentation
 */
@Serializable(with = InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba.Serializer::class)
public class InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baBranch.Branch1)
      if (inspection.matchesFile) add(InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baBranch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba {
      val inspection = inspectInlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baNoMatchException("InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba) {
      encoder.requireJsonEncoder("InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4ba(element: JsonElement): InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineIssuingDisputeOtherEvidenceAdditionalDocumentationX2ea3e4baInspection(
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
