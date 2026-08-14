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

public enum class InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0Branch {
  Branch1,
  File,
}

public sealed class InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0NoMatchException(
  message: String,
) : InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0DecodingException(message)

internal data class InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0Inspection(
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
 * sdkgen://source/openapi.json#/components/schemas/issuing_dispute_merchandise_not_as_described_evidence/properties/add
 * itional_documentation
 */
@Serializable(with = InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0.Serializer::class)
public class InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0Branch.Branch1)
      if (inspection.matchesFile) add(InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0 {
      val inspection = inspectInlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0NoMatchException("InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0) {
      encoder.requireJsonEncoder("InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0(element: JsonElement): InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineIssuingDisputeMercha6387AdditionalDocumentationX3578dfd0Inspection(
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
