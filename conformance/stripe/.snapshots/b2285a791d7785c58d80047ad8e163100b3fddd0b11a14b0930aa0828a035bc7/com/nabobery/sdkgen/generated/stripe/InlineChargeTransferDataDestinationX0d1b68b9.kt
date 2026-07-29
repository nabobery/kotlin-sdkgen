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

public enum class InlineChargeTransferDataDestinationX0d1b68b9Branch {
  Branch1,
  Account,
}

public sealed class InlineChargeTransferDataDestinationX0d1b68b9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargeTransferDataDestinationX0d1b68b9NoMatchException(
  message: String,
) : InlineChargeTransferDataDestinationX0d1b68b9DecodingException(message)

internal data class InlineChargeTransferDataDestinationX0d1b68b9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * ID of an existing, connected Stripe account to transfer funds to if `transfer_data` was specified in the charge
 * request.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge_transfer_data/properties/destination
 */
@Serializable(with = InlineChargeTransferDataDestinationX0d1b68b9.Serializer::class)
public class InlineChargeTransferDataDestinationX0d1b68b9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargeTransferDataDestinationX0d1b68b9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineChargeTransferDataDestinationX0d1b68b9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChargeTransferDataDestinationX0d1b68b9Branch.Branch1)
      if (inspection.matchesAccount) add(InlineChargeTransferDataDestinationX0d1b68b9Branch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargeTransferDataDestinationX0d1b68b9 {
      val inspection = inspectInlineChargeTransferDataDestinationX0d1b68b9(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargeTransferDataDestinationX0d1b68b9NoMatchException("InlineChargeTransferDataDestinationX0d1b68b9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargeTransferDataDestinationX0d1b68b9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineChargeTransferDataDestinationX0d1b68b9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargeTransferDataDestinationX0d1b68b9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargeTransferDataDestinationX0d1b68b9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargeTransferDataDestinationX0d1b68b9) {
      encoder.requireJsonEncoder("InlineChargeTransferDataDestinationX0d1b68b9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargeTransferDataDestinationX0d1b68b9(element: JsonElement): InlineChargeTransferDataDestinationX0d1b68b9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineChargeTransferDataDestinationX0d1b68b9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesAccount = matchesAccount,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesAccount) add("Account: value does not match Account")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
