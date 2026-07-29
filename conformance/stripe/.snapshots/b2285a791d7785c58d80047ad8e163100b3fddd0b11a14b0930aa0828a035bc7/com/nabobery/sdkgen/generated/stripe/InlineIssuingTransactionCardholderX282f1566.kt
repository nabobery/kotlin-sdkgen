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

public enum class InlineIssuingTransactionCardholderX282f1566Branch {
  Branch1,
  IssuingCardholder,
}

public sealed class InlineIssuingTransactionCardholderX282f1566DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionCardholderX282f1566NoMatchException(
  message: String,
) : InlineIssuingTransactionCardholderX282f1566DecodingException(message)

internal data class InlineIssuingTransactionCardholderX282f1566Inspection(
  public val matchesBranch1: Boolean,
  public val matchesIssuingCardholder: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesIssuingCardholder).count { it }
}

/**
 * The cardholder to whom this transaction belongs.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/cardholder
 */
@Serializable(with = InlineIssuingTransactionCardholderX282f1566.Serializer::class)
public class InlineIssuingTransactionCardholderX282f1566 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionCardholderX282f1566Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val issuingCardholder: IssuingCardholder? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardholder) json.decodeFromJsonElement<IssuingCardholder>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionCardholderX282f1566Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingTransactionCardholderX282f1566Branch.Branch1)
      if (inspection.matchesIssuingCardholder) add(InlineIssuingTransactionCardholderX282f1566Branch.IssuingCardholder)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionCardholderX282f1566 {
      val inspection = inspectInlineIssuingTransactionCardholderX282f1566(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionCardholderX282f1566NoMatchException("InlineIssuingTransactionCardholderX282f1566 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionCardholderX282f1566(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingTransactionCardholderX282f1566> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionCardholderX282f1566 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionCardholderX282f1566")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionCardholderX282f1566) {
      encoder.requireJsonEncoder("InlineIssuingTransactionCardholderX282f1566").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionCardholderX282f1566(element: JsonElement): InlineIssuingTransactionCardholderX282f1566Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesIssuingCardholder = element.isJsonDecodable<IssuingCardholder>()
  return InlineIssuingTransactionCardholderX282f1566Inspection(
    matchesBranch1 = matchesBranch1,
    matchesIssuingCardholder = matchesIssuingCardholder,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesIssuingCardholder) add("IssuingCardholder: value does not match IssuingCardholder")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
