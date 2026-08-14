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

public enum class InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848Branch {
  Branch1,
  File,
}

public sealed class InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848DecodingException(
  message: String,
) : SerializationException(message)

public class InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848NoMatchException(
  message: String,
) : InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848DecodingException(message)

internal data class InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation for the prior charge that can
 * uniquely identify the charge, such as a receipt, shipping label, work order, etc. This document should be paired with
 * a similar document from the disputed payment that proves the two payments are separate.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_evidence/properties/duplicate_charge_documentation
 */
@Serializable(with = InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848.Serializer::class)
public class InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848Branch.Branch1)
      if (inspection.matchesFile) add(InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848 {
      val inspection = inspectInlineDisputeEvidenceDuplicateChargeDocumentationXa3255848(raw)
      if (inspection.matchCount == 0) {
        throw InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848NoMatchException("InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848) {
      encoder.requireJsonEncoder("InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDisputeEvidenceDuplicateChargeDocumentationXa3255848(element: JsonElement): InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848Inspection(
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
