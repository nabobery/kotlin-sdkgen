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

public enum class InlineBankConnectionsResourceAccountholderAccountX9870ade7Branch {
  Branch1,
  Account,
}

public sealed class InlineBankConnectionsResourceAccountholderAccountX9870ade7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBankConnectionsResourceAccountholderAccountX9870ade7NoMatchException(
  message: String,
) : InlineBankConnectionsResourceAccountholderAccountX9870ade7DecodingException(message)

internal data class InlineBankConnectionsResourceAccountholderAccountX9870ade7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The ID of the Stripe account that this account belongs to. Only available when `account_holder.type` is `account`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_accountholder/properties/account
 */
@Serializable(with = InlineBankConnectionsResourceAccountholderAccountX9870ade7.Serializer::class)
public class InlineBankConnectionsResourceAccountholderAccountX9870ade7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBankConnectionsResourceAccountholderAccountX9870ade7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineBankConnectionsResourceAccountholderAccountX9870ade7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBankConnectionsResourceAccountholderAccountX9870ade7Branch.Branch1)
      if (inspection.matchesAccount) add(InlineBankConnectionsResourceAccountholderAccountX9870ade7Branch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBankConnectionsResourceAccountholderAccountX9870ade7 {
      val inspection = inspectInlineBankConnectionsResourceAccountholderAccountX9870ade7(raw)
      if (inspection.matchCount == 0) {
        throw InlineBankConnectionsResourceAccountholderAccountX9870ade7NoMatchException("InlineBankConnectionsResourceAccountholderAccountX9870ade7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBankConnectionsResourceAccountholderAccountX9870ade7(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineBankConnectionsResourceAccountholderAccountX9870ade7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBankConnectionsResourceAccountholderAccountX9870ade7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBankConnectionsResourceAccountholderAccountX9870ade7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBankConnectionsResourceAccountholderAccountX9870ade7) {
      encoder.requireJsonEncoder("InlineBankConnectionsResourceAccountholderAccountX9870ade7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBankConnectionsResourceAccountholderAccountX9870ade7(element: JsonElement): InlineBankConnectionsResourceAccountholderAccountX9870ade7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineBankConnectionsResourceAccountholderAccountX9870ade7Inspection(
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
