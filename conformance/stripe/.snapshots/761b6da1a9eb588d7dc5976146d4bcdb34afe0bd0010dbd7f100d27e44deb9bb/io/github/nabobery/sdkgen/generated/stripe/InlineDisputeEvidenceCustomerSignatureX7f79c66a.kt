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

public enum class InlineDisputeEvidenceCustomerSignatureX7f79c66aBranch {
  Branch1,
  File,
}

public sealed class InlineDisputeEvidenceCustomerSignatureX7f79c66aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineDisputeEvidenceCustomerSignatureX7f79c66aNoMatchException(
  message: String,
) : InlineDisputeEvidenceCustomerSignatureX7f79c66aDecodingException(message)

internal data class InlineDisputeEvidenceCustomerSignatureX7f79c66aInspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A relevant document or contract showing the
 * customer's signature.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_evidence/properties/customer_signature
 */
@Serializable(with = InlineDisputeEvidenceCustomerSignatureX7f79c66a.Serializer::class)
public class InlineDisputeEvidenceCustomerSignatureX7f79c66a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDisputeEvidenceCustomerSignatureX7f79c66aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineDisputeEvidenceCustomerSignatureX7f79c66aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDisputeEvidenceCustomerSignatureX7f79c66aBranch.Branch1)
      if (inspection.matchesFile) add(InlineDisputeEvidenceCustomerSignatureX7f79c66aBranch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDisputeEvidenceCustomerSignatureX7f79c66a {
      val inspection = inspectInlineDisputeEvidenceCustomerSignatureX7f79c66a(raw)
      if (inspection.matchCount == 0) {
        throw InlineDisputeEvidenceCustomerSignatureX7f79c66aNoMatchException("InlineDisputeEvidenceCustomerSignatureX7f79c66a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDisputeEvidenceCustomerSignatureX7f79c66a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEvidenceCustomerSignatureX7f79c66a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDisputeEvidenceCustomerSignatureX7f79c66a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeEvidenceCustomerSignatureX7f79c66a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEvidenceCustomerSignatureX7f79c66a) {
      encoder.requireJsonEncoder("InlineDisputeEvidenceCustomerSignatureX7f79c66a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDisputeEvidenceCustomerSignatureX7f79c66a(element: JsonElement): InlineDisputeEvidenceCustomerSignatureX7f79c66aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineDisputeEvidenceCustomerSignatureX7f79c66aInspection(
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
