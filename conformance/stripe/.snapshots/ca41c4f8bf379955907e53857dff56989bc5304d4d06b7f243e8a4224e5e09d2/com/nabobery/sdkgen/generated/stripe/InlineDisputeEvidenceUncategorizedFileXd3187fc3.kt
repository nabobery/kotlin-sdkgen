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

public enum class InlineDisputeEvidenceUncategorizedFileXd3187fc3Branch {
  Branch1,
  File,
}

public sealed class InlineDisputeEvidenceUncategorizedFileXd3187fc3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineDisputeEvidenceUncategorizedFileXd3187fc3NoMatchException(
  message: String,
) : InlineDisputeEvidenceUncategorizedFileXd3187fc3DecodingException(message)

internal data class InlineDisputeEvidenceUncategorizedFileXd3187fc3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any additional evidence or statements.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_evidence/properties/uncategorized_file
 */
@Serializable(with = InlineDisputeEvidenceUncategorizedFileXd3187fc3.Serializer::class)
public class InlineDisputeEvidenceUncategorizedFileXd3187fc3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDisputeEvidenceUncategorizedFileXd3187fc3Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineDisputeEvidenceUncategorizedFileXd3187fc3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDisputeEvidenceUncategorizedFileXd3187fc3Branch.Branch1)
      if (inspection.matchesFile) add(InlineDisputeEvidenceUncategorizedFileXd3187fc3Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDisputeEvidenceUncategorizedFileXd3187fc3 {
      val inspection = inspectInlineDisputeEvidenceUncategorizedFileXd3187fc3(raw)
      if (inspection.matchCount == 0) {
        throw InlineDisputeEvidenceUncategorizedFileXd3187fc3NoMatchException("InlineDisputeEvidenceUncategorizedFileXd3187fc3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDisputeEvidenceUncategorizedFileXd3187fc3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEvidenceUncategorizedFileXd3187fc3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDisputeEvidenceUncategorizedFileXd3187fc3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeEvidenceUncategorizedFileXd3187fc3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEvidenceUncategorizedFileXd3187fc3) {
      encoder.requireJsonEncoder("InlineDisputeEvidenceUncategorizedFileXd3187fc3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDisputeEvidenceUncategorizedFileXd3187fc3(element: JsonElement): InlineDisputeEvidenceUncategorizedFileXd3187fc3Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineDisputeEvidenceUncategorizedFileXd3187fc3Inspection(
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
