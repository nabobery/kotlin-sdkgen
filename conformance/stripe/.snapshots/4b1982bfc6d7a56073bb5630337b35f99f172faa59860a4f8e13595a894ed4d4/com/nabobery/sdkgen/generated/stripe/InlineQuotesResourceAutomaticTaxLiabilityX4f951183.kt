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

public enum class InlineQuotesResourceAutomaticTaxLiabilityX4f951183Branch {
  ConnectAccountReference,
}

public sealed class InlineQuotesResourceAutomaticTaxLiabilityX4f951183DecodingException(
  message: String,
) : SerializationException(message)

public class InlineQuotesResourceAutomaticTaxLiabilityX4f951183NoMatchException(
  message: String,
) : InlineQuotesResourceAutomaticTaxLiabilityX4f951183DecodingException(message)

internal data class InlineQuotesResourceAutomaticTaxLiabilityX4f951183Inspection(
  public val matchesConnectAccountReference: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesConnectAccountReference).count { it }
}

/**
 * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
 * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_automatic_tax/properties/liability
 */
@Serializable(with = InlineQuotesResourceAutomaticTaxLiabilityX4f951183.Serializer::class)
public class InlineQuotesResourceAutomaticTaxLiabilityX4f951183 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineQuotesResourceAutomaticTaxLiabilityX4f951183Inspection,
) {
  public val connectAccountReference: ConnectAccountReferenceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConnectAccountReference) json.decodeFromJsonElement<ConnectAccountReferenceView>(raw) else null }

  public val matchedBranches: Set<InlineQuotesResourceAutomaticTaxLiabilityX4f951183Branch>
    get() = buildSet {
      if (inspection.matchesConnectAccountReference) add(InlineQuotesResourceAutomaticTaxLiabilityX4f951183Branch.ConnectAccountReference)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineQuotesResourceAutomaticTaxLiabilityX4f951183 {
      val inspection = inspectInlineQuotesResourceAutomaticTaxLiabilityX4f951183(raw)
      if (inspection.matchCount == 0) {
        throw InlineQuotesResourceAutomaticTaxLiabilityX4f951183NoMatchException("InlineQuotesResourceAutomaticTaxLiabilityX4f951183 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineQuotesResourceAutomaticTaxLiabilityX4f951183(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineQuotesResourceAutomaticTaxLiabilityX4f951183> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineQuotesResourceAutomaticTaxLiabilityX4f951183 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineQuotesResourceAutomaticTaxLiabilityX4f951183")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineQuotesResourceAutomaticTaxLiabilityX4f951183) {
      encoder.requireJsonEncoder("InlineQuotesResourceAutomaticTaxLiabilityX4f951183").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineQuotesResourceAutomaticTaxLiabilityX4f951183(element: JsonElement): InlineQuotesResourceAutomaticTaxLiabilityX4f951183Inspection {
  val raw = element as? JsonObject ?: return InlineQuotesResourceAutomaticTaxLiabilityX4f951183Inspection(
    matchesConnectAccountReference = false,
    failures = listOf("ConnectAccountReference: expected JSON object"),
  )
  val matchesConnectAccountReference = raw["type"] != null
  return InlineQuotesResourceAutomaticTaxLiabilityX4f951183Inspection(
    matchesConnectAccountReference = matchesConnectAccountReference,
    failures = buildList {
      if (!matchesConnectAccountReference) add("ConnectAccountReference: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
