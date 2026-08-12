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

public enum class InlineIssuingTransactionDisputeXddd279daBranch {
  Branch1,
  IssuingDispute,
}

public sealed class InlineIssuingTransactionDisputeXddd279daDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionDisputeXddd279daNoMatchException(
  message: String,
) : InlineIssuingTransactionDisputeXddd279daDecodingException(message)

internal data class InlineIssuingTransactionDisputeXddd279daInspection(
  public val matchesBranch1: Boolean,
  public val matchesIssuingDispute: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesIssuingDispute).count { it }
}

/**
 * If you've disputed the transaction, the ID of the dispute.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/dispute
 */
@Serializable(with = InlineIssuingTransactionDisputeXddd279da.Serializer::class)
public class InlineIssuingTransactionDisputeXddd279da internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionDisputeXddd279daInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val issuingDispute: IssuingDispute? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingDispute) json.decodeFromJsonElement<IssuingDispute>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionDisputeXddd279daBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingTransactionDisputeXddd279daBranch.Branch1)
      if (inspection.matchesIssuingDispute) add(InlineIssuingTransactionDisputeXddd279daBranch.IssuingDispute)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionDisputeXddd279da {
      val inspection = inspectInlineIssuingTransactionDisputeXddd279da(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionDisputeXddd279daNoMatchException("InlineIssuingTransactionDisputeXddd279da matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionDisputeXddd279da(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTransactionDisputeXddd279da> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionDisputeXddd279da {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionDisputeXddd279da")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionDisputeXddd279da) {
      encoder.requireJsonEncoder("InlineIssuingTransactionDisputeXddd279da").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionDisputeXddd279da(element: JsonElement): InlineIssuingTransactionDisputeXddd279daInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesIssuingDispute = element.isJsonDecodable<IssuingDispute>()
  return InlineIssuingTransactionDisputeXddd279daInspection(
    matchesBranch1 = matchesBranch1,
    matchesIssuingDispute = matchesIssuingDispute,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesIssuingDispute) add("IssuingDispute: value does not match IssuingDispute")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
