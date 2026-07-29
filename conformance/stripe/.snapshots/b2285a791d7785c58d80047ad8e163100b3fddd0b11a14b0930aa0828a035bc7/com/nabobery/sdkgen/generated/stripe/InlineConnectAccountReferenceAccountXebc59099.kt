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

public enum class InlineConnectAccountReferenceAccountXebc59099Branch {
  Branch1,
  Account,
}

public sealed class InlineConnectAccountReferenceAccountXebc59099DecodingException(
  message: String,
) : SerializationException(message)

public class InlineConnectAccountReferenceAccountXebc59099NoMatchException(
  message: String,
) : InlineConnectAccountReferenceAccountXebc59099DecodingException(message)

internal data class InlineConnectAccountReferenceAccountXebc59099Inspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The connected account being referenced when `type` is `account`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_account_reference/properties/account
 */
@Serializable(with = InlineConnectAccountReferenceAccountXebc59099.Serializer::class)
public class InlineConnectAccountReferenceAccountXebc59099 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineConnectAccountReferenceAccountXebc59099Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineConnectAccountReferenceAccountXebc59099Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineConnectAccountReferenceAccountXebc59099Branch.Branch1)
      if (inspection.matchesAccount) add(InlineConnectAccountReferenceAccountXebc59099Branch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineConnectAccountReferenceAccountXebc59099 {
      val inspection = inspectInlineConnectAccountReferenceAccountXebc59099(raw)
      if (inspection.matchCount == 0) {
        throw InlineConnectAccountReferenceAccountXebc59099NoMatchException("InlineConnectAccountReferenceAccountXebc59099 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineConnectAccountReferenceAccountXebc59099(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineConnectAccountReferenceAccountXebc59099> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineConnectAccountReferenceAccountXebc59099 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineConnectAccountReferenceAccountXebc59099")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineConnectAccountReferenceAccountXebc59099) {
      encoder.requireJsonEncoder("InlineConnectAccountReferenceAccountXebc59099").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineConnectAccountReferenceAccountXebc59099(element: JsonElement): InlineConnectAccountReferenceAccountXebc59099Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineConnectAccountReferenceAccountXebc59099Inspection(
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
