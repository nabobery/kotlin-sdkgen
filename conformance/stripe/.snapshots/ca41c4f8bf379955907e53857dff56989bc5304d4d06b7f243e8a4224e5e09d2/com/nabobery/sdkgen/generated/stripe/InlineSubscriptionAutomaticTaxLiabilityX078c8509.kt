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

public enum class InlineSubscriptionAutomaticTaxLiabilityX078c8509Branch {
  ConnectAccountReference,
}

public sealed class InlineSubscriptionAutomaticTaxLiabilityX078c8509DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionAutomaticTaxLiabilityX078c8509NoMatchException(
  message: String,
) : InlineSubscriptionAutomaticTaxLiabilityX078c8509DecodingException(message)

internal data class InlineSubscriptionAutomaticTaxLiabilityX078c8509Inspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_automatic_tax/properties/liability
 */
@Serializable(with = InlineSubscriptionAutomaticTaxLiabilityX078c8509.Serializer::class)
public class InlineSubscriptionAutomaticTaxLiabilityX078c8509 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionAutomaticTaxLiabilityX078c8509Inspection,
) {
  public val connectAccountReference: ConnectAccountReferenceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConnectAccountReference) json.decodeFromJsonElement<ConnectAccountReferenceView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionAutomaticTaxLiabilityX078c8509Branch>
    get() = buildSet {
      if (inspection.matchesConnectAccountReference) add(InlineSubscriptionAutomaticTaxLiabilityX078c8509Branch.ConnectAccountReference)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionAutomaticTaxLiabilityX078c8509 {
      val inspection = inspectInlineSubscriptionAutomaticTaxLiabilityX078c8509(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionAutomaticTaxLiabilityX078c8509NoMatchException("InlineSubscriptionAutomaticTaxLiabilityX078c8509 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionAutomaticTaxLiabilityX078c8509(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionAutomaticTaxLiabilityX078c8509> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionAutomaticTaxLiabilityX078c8509 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionAutomaticTaxLiabilityX078c8509")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionAutomaticTaxLiabilityX078c8509) {
      encoder.requireJsonEncoder("InlineSubscriptionAutomaticTaxLiabilityX078c8509").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionAutomaticTaxLiabilityX078c8509(element: JsonElement): InlineSubscriptionAutomaticTaxLiabilityX078c8509Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionAutomaticTaxLiabilityX078c8509Inspection(
    matchesConnectAccountReference = false,
    failures = listOf("ConnectAccountReference: expected JSON object"),
  )
  val matchesConnectAccountReference = raw["type"] != null
  return InlineSubscriptionAutomaticTaxLiabilityX078c8509Inspection(
    matchesConnectAccountReference = matchesConnectAccountReference,
    failures = buildList {
      if (!matchesConnectAccountReference) add("ConnectAccountReference: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
