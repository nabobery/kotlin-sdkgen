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

public enum class InlineIssuingTransactionCardXb7a677c1Branch {
  Branch1,
  IssuingCard,
}

public sealed class InlineIssuingTransactionCardXb7a677c1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionCardXb7a677c1NoMatchException(
  message: String,
) : InlineIssuingTransactionCardXb7a677c1DecodingException(message)

internal data class InlineIssuingTransactionCardXb7a677c1Inspection(
  public val matchesBranch1: Boolean,
  public val matchesIssuingCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesIssuingCard).count { it }
}

/**
 * The card used to make this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/card
 */
@Serializable(with = InlineIssuingTransactionCardXb7a677c1.Serializer::class)
public class InlineIssuingTransactionCardXb7a677c1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionCardXb7a677c1Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val issuingCard: IssuingCard? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCard) json.decodeFromJsonElement<IssuingCard>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionCardXb7a677c1Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingTransactionCardXb7a677c1Branch.Branch1)
      if (inspection.matchesIssuingCard) add(InlineIssuingTransactionCardXb7a677c1Branch.IssuingCard)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionCardXb7a677c1 {
      val inspection = inspectInlineIssuingTransactionCardXb7a677c1(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionCardXb7a677c1NoMatchException("InlineIssuingTransactionCardXb7a677c1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionCardXb7a677c1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTransactionCardXb7a677c1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionCardXb7a677c1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionCardXb7a677c1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionCardXb7a677c1) {
      encoder.requireJsonEncoder("InlineIssuingTransactionCardXb7a677c1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionCardXb7a677c1(element: JsonElement): InlineIssuingTransactionCardXb7a677c1Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesIssuingCard = element.isJsonDecodable<IssuingCard>()
  return InlineIssuingTransactionCardXb7a677c1Inspection(
    matchesBranch1 = matchesBranch1,
    matchesIssuingCard = matchesIssuingCard,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesIssuingCard) add("IssuingCard: value does not match IssuingCard")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
