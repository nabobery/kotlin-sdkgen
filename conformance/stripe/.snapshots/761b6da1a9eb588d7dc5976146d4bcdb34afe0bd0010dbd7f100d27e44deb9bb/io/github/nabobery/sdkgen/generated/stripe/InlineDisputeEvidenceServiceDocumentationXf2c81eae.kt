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

public enum class InlineDisputeEvidenceServiceDocumentationXf2c81eaeBranch {
  Branch1,
  File,
}

public sealed class InlineDisputeEvidenceServiceDocumentationXf2c81eaeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineDisputeEvidenceServiceDocumentationXf2c81eaeNoMatchException(
  message: String,
) : InlineDisputeEvidenceServiceDocumentationXf2c81eaeDecodingException(message)

internal data class InlineDisputeEvidenceServiceDocumentationXf2c81eaeInspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a service was
 * provided to the customer. This could include a copy of a signed contract, work order, or other form of written
 * agreement.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_evidence/properties/service_documentation
 */
@Serializable(with = InlineDisputeEvidenceServiceDocumentationXf2c81eae.Serializer::class)
public class InlineDisputeEvidenceServiceDocumentationXf2c81eae internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDisputeEvidenceServiceDocumentationXf2c81eaeInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineDisputeEvidenceServiceDocumentationXf2c81eaeBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDisputeEvidenceServiceDocumentationXf2c81eaeBranch.Branch1)
      if (inspection.matchesFile) add(InlineDisputeEvidenceServiceDocumentationXf2c81eaeBranch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDisputeEvidenceServiceDocumentationXf2c81eae {
      val inspection = inspectInlineDisputeEvidenceServiceDocumentationXf2c81eae(raw)
      if (inspection.matchCount == 0) {
        throw InlineDisputeEvidenceServiceDocumentationXf2c81eaeNoMatchException("InlineDisputeEvidenceServiceDocumentationXf2c81eae matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDisputeEvidenceServiceDocumentationXf2c81eae(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEvidenceServiceDocumentationXf2c81eae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDisputeEvidenceServiceDocumentationXf2c81eae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeEvidenceServiceDocumentationXf2c81eae")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEvidenceServiceDocumentationXf2c81eae) {
      encoder.requireJsonEncoder("InlineDisputeEvidenceServiceDocumentationXf2c81eae").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDisputeEvidenceServiceDocumentationXf2c81eae(element: JsonElement): InlineDisputeEvidenceServiceDocumentationXf2c81eaeInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineDisputeEvidenceServiceDocumentationXf2c81eaeInspection(
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
