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

public enum class InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846Branch {
  Branch1,
  File,
}

public sealed class InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846NoMatchException(
  message: String,
) : InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846DecodingException(message)

internal data class InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846Inspection(
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
 * sdkgen://source/openapi.json#/components/schemas/issuing_dispute_no_valid_authorization_evidence/properties/additiona
 * l_documentation
 */
@Serializable(with = InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846.Serializer::class)
public class InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846Branch.Branch1)
      if (inspection.matchesFile) add(InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846 {
      val inspection = inspectInlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846NoMatchException("InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846) {
      encoder.requireJsonEncoder("InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846(element: JsonElement): InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineIssuingDisputeNoValidAuthorizationEvidenceAdditionalDocumentationX8cce1846Inspection(
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
