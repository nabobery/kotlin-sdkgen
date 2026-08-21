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

public enum class InlineDisputeEvidenceCustomerCommunicationXdea508c4Branch {
  Branch1,
  File,
}

public sealed class InlineDisputeEvidenceCustomerCommunicationXdea508c4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineDisputeEvidenceCustomerCommunicationXdea508c4NoMatchException(
  message: String,
) : InlineDisputeEvidenceCustomerCommunicationXdea508c4DecodingException(message)

internal data class InlineDisputeEvidenceCustomerCommunicationXdea508c4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any communication with the customer that you feel
 * is relevant to your case. Examples include emails proving that the customer received the product or service, or
 * demonstrating their use of or satisfaction with the product or service.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_evidence/properties/customer_communication
 */
@Serializable(with = InlineDisputeEvidenceCustomerCommunicationXdea508c4.Serializer::class)
public class InlineDisputeEvidenceCustomerCommunicationXdea508c4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDisputeEvidenceCustomerCommunicationXdea508c4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineDisputeEvidenceCustomerCommunicationXdea508c4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDisputeEvidenceCustomerCommunicationXdea508c4Branch.Branch1)
      if (inspection.matchesFile) add(InlineDisputeEvidenceCustomerCommunicationXdea508c4Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDisputeEvidenceCustomerCommunicationXdea508c4 {
      val inspection = inspectInlineDisputeEvidenceCustomerCommunicationXdea508c4(raw)
      if (inspection.matchCount == 0) {
        throw InlineDisputeEvidenceCustomerCommunicationXdea508c4NoMatchException("InlineDisputeEvidenceCustomerCommunicationXdea508c4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDisputeEvidenceCustomerCommunicationXdea508c4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEvidenceCustomerCommunicationXdea508c4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDisputeEvidenceCustomerCommunicationXdea508c4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeEvidenceCustomerCommunicationXdea508c4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEvidenceCustomerCommunicationXdea508c4) {
      encoder.requireJsonEncoder("InlineDisputeEvidenceCustomerCommunicationXdea508c4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDisputeEvidenceCustomerCommunicationXdea508c4(element: JsonElement): InlineDisputeEvidenceCustomerCommunicationXdea508c4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineDisputeEvidenceCustomerCommunicationXdea508c4Inspection(
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
