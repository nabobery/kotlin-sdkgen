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

public enum class InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cBranch {
  Branch1,
  File,
}

public sealed class InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cNoMatchException(
  message: String,
) : InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cDecodingException(message)

internal data class InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cInspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Copy of the receipt showing that the product had
 * been paid for in cash.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_duplicate_evidence/properties/cash_receipt
 */
@Serializable(with = InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c.Serializer::class)
public class InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cBranch.Branch1)
      if (inspection.matchesFile) add(InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cBranch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c {
      val inspection = inspectInlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cNoMatchException("InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c) {
      encoder.requireJsonEncoder("InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54c(element: JsonElement): InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineIssuingDisputeDuplicateEvidenceCashReceiptX56eae54cInspection(
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
