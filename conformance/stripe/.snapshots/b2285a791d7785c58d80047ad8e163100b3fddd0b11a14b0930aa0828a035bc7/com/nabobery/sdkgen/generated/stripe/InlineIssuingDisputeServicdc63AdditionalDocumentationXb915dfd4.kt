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

public enum class InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4Branch {
  Branch1,
  File,
}

public sealed class InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4NoMatchException(
  message: String,
) : InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4DecodingException(message)

internal data class InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4Inspection(
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
 * sdkgen://source/openapi.json#/components/schemas/issuing_dispute_service_not_as_described_evidence/properties/additio
 * nal_documentation
 */
@Serializable(with = InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4.Serializer::class)
public class InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4Branch.Branch1)
      if (inspection.matchesFile) add(InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4 {
      val inspection = inspectInlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4NoMatchException("InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4) {
      encoder.requireJsonEncoder("InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4(element: JsonElement): InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineIssuingDisputeServicdc63AdditionalDocumentationXb915dfd4Inspection(
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
