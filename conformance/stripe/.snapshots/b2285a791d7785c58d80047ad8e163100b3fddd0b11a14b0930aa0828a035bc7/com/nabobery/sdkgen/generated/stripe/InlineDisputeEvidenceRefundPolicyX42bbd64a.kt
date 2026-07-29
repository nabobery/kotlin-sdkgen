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

public enum class InlineDisputeEvidenceRefundPolicyX42bbd64aBranch {
  Branch1,
  File,
}

public sealed class InlineDisputeEvidenceRefundPolicyX42bbd64aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineDisputeEvidenceRefundPolicyX42bbd64aNoMatchException(
  message: String,
) : InlineDisputeEvidenceRefundPolicyX42bbd64aDecodingException(message)

internal data class InlineDisputeEvidenceRefundPolicyX42bbd64aInspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your refund policy, as shown to the customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_evidence/properties/refund_policy
 */
@Serializable(with = InlineDisputeEvidenceRefundPolicyX42bbd64a.Serializer::class)
public class InlineDisputeEvidenceRefundPolicyX42bbd64a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDisputeEvidenceRefundPolicyX42bbd64aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineDisputeEvidenceRefundPolicyX42bbd64aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDisputeEvidenceRefundPolicyX42bbd64aBranch.Branch1)
      if (inspection.matchesFile) add(InlineDisputeEvidenceRefundPolicyX42bbd64aBranch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDisputeEvidenceRefundPolicyX42bbd64a {
      val inspection = inspectInlineDisputeEvidenceRefundPolicyX42bbd64a(raw)
      if (inspection.matchCount == 0) {
        throw InlineDisputeEvidenceRefundPolicyX42bbd64aNoMatchException("InlineDisputeEvidenceRefundPolicyX42bbd64a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDisputeEvidenceRefundPolicyX42bbd64a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineDisputeEvidenceRefundPolicyX42bbd64a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDisputeEvidenceRefundPolicyX42bbd64a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeEvidenceRefundPolicyX42bbd64a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEvidenceRefundPolicyX42bbd64a) {
      encoder.requireJsonEncoder("InlineDisputeEvidenceRefundPolicyX42bbd64a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDisputeEvidenceRefundPolicyX42bbd64a(element: JsonElement): InlineDisputeEvidenceRefundPolicyX42bbd64aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineDisputeEvidenceRefundPolicyX42bbd64aInspection(
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
