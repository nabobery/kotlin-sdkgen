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

public enum class InlineIssuingTransactionNetworkDataXb43544faBranch {
  IssuingTransactionNetworkData,
}

public sealed class InlineIssuingTransactionNetworkDataXb43544faDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionNetworkDataXb43544faNoMatchException(
  message: String,
) : InlineIssuingTransactionNetworkDataXb43544faDecodingException(message)

internal data class InlineIssuingTransactionNetworkDataXb43544faInspection(
  public val matchesIssuingTransactionNetworkData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingTransactionNetworkData).count { it }
}

/**
 * Details about the transaction, such as processing dates, set by the card network.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/network_data
 */
@Serializable(with = InlineIssuingTransactionNetworkDataXb43544fa.Serializer::class)
public class InlineIssuingTransactionNetworkDataXb43544fa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionNetworkDataXb43544faInspection,
) {
  public val issuingTransactionNetworkData: IssuingTransactionNetworkDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingTransactionNetworkData) json.decodeFromJsonElement<IssuingTransactionNetworkDataView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionNetworkDataXb43544faBranch>
    get() = buildSet {
      if (inspection.matchesIssuingTransactionNetworkData) add(InlineIssuingTransactionNetworkDataXb43544faBranch.IssuingTransactionNetworkData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionNetworkDataXb43544fa {
      val inspection = inspectInlineIssuingTransactionNetworkDataXb43544fa(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionNetworkDataXb43544faNoMatchException("InlineIssuingTransactionNetworkDataXb43544fa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionNetworkDataXb43544fa(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingTransactionNetworkDataXb43544fa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionNetworkDataXb43544fa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionNetworkDataXb43544fa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionNetworkDataXb43544fa) {
      encoder.requireJsonEncoder("InlineIssuingTransactionNetworkDataXb43544fa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionNetworkDataXb43544fa(element: JsonElement): InlineIssuingTransactionNetworkDataXb43544faInspection {
  val raw = element as? JsonObject ?: return InlineIssuingTransactionNetworkDataXb43544faInspection(
    matchesIssuingTransactionNetworkData = false,
    failures = listOf("IssuingTransactionNetworkData: expected JSON object"),
  )
  val matchesIssuingTransactionNetworkData = true
  return InlineIssuingTransactionNetworkDataXb43544faInspection(
    matchesIssuingTransactionNetworkData = matchesIssuingTransactionNetworkData,
    failures = buildList {
      if (!matchesIssuingTransactionNetworkData) add("IssuingTransactionNetworkData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
