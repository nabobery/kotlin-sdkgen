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

public enum class InlineDisputeEvidenceCancellationPolicyXcaf1ed70Branch {
  Branch1,
  File,
}

public sealed class InlineDisputeEvidenceCancellationPolicyXcaf1ed70DecodingException(
  message: String,
) : SerializationException(message)

public class InlineDisputeEvidenceCancellationPolicyXcaf1ed70NoMatchException(
  message: String,
) : InlineDisputeEvidenceCancellationPolicyXcaf1ed70DecodingException(message)

internal data class InlineDisputeEvidenceCancellationPolicyXcaf1ed70Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your subscription cancellation policy, as shown
 * to the customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_evidence/properties/cancellation_policy
 */
@Serializable(with = InlineDisputeEvidenceCancellationPolicyXcaf1ed70.Serializer::class)
public class InlineDisputeEvidenceCancellationPolicyXcaf1ed70 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDisputeEvidenceCancellationPolicyXcaf1ed70Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineDisputeEvidenceCancellationPolicyXcaf1ed70Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDisputeEvidenceCancellationPolicyXcaf1ed70Branch.Branch1)
      if (inspection.matchesFile) add(InlineDisputeEvidenceCancellationPolicyXcaf1ed70Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDisputeEvidenceCancellationPolicyXcaf1ed70 {
      val inspection = inspectInlineDisputeEvidenceCancellationPolicyXcaf1ed70(raw)
      if (inspection.matchCount == 0) {
        throw InlineDisputeEvidenceCancellationPolicyXcaf1ed70NoMatchException("InlineDisputeEvidenceCancellationPolicyXcaf1ed70 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDisputeEvidenceCancellationPolicyXcaf1ed70(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEvidenceCancellationPolicyXcaf1ed70> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDisputeEvidenceCancellationPolicyXcaf1ed70 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeEvidenceCancellationPolicyXcaf1ed70")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEvidenceCancellationPolicyXcaf1ed70) {
      encoder.requireJsonEncoder("InlineDisputeEvidenceCancellationPolicyXcaf1ed70").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDisputeEvidenceCancellationPolicyXcaf1ed70(element: JsonElement): InlineDisputeEvidenceCancellationPolicyXcaf1ed70Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineDisputeEvidenceCancellationPolicyXcaf1ed70Inspection(
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
