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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5Branch {
  IssuingTransactionLodgingData,
}

public sealed class InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5NoMatchException(
  message: String,
) : InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5DecodingException(message)

internal data class InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5Inspection(
  public val matchesIssuingTransactionLodgingData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingTransactionLodgingData).count { it }
}

/**
 * Information about lodging that was purchased with this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_purchase_details/properties/lodging
 */
@Serializable(with = InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5.Serializer::class)
public class InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5Inspection,
) {
  public val issuingTransactionLodgingData: IssuingTransactionLodgingDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingTransactionLodgingData) json.decodeFromJsonElement<IssuingTransactionLodgingDataView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5Branch>
    get() = buildSet {
      if (inspection.matchesIssuingTransactionLodgingData) add(InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5Branch.IssuingTransactionLodgingData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5 {
      val inspection = inspectInlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5NoMatchException("InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5) {
      encoder.requireJsonEncoder("InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5(element: JsonElement): InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5Inspection(
    matchesIssuingTransactionLodgingData = false,
    failures = listOf("IssuingTransactionLodgingData: expected JSON object"),
  )
  val matchesIssuingTransactionLodgingData = true
  return InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5Inspection(
    matchesIssuingTransactionLodgingData = matchesIssuingTransactionLodgingData,
    failures = buildList {
      if (!matchesIssuingTransactionLodgingData) add("IssuingTransactionLodgingData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
