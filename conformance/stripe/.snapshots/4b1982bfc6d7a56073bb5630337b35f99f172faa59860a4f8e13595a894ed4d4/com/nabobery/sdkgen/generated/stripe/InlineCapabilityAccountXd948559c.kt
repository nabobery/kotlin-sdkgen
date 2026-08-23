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

public enum class InlineCapabilityAccountXd948559cBranch {
  Branch1,
  Account,
}

public sealed class InlineCapabilityAccountXd948559cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCapabilityAccountXd948559cNoMatchException(
  message: String,
) : InlineCapabilityAccountXd948559cDecodingException(message)

internal data class InlineCapabilityAccountXd948559cInspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The account for which the capability enables functionality.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/capability/properties/account
 */
@Serializable(with = InlineCapabilityAccountXd948559c.Serializer::class)
public class InlineCapabilityAccountXd948559c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCapabilityAccountXd948559cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineCapabilityAccountXd948559cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCapabilityAccountXd948559cBranch.Branch1)
      if (inspection.matchesAccount) add(InlineCapabilityAccountXd948559cBranch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCapabilityAccountXd948559c {
      val inspection = inspectInlineCapabilityAccountXd948559c(raw)
      if (inspection.matchCount == 0) {
        throw InlineCapabilityAccountXd948559cNoMatchException("InlineCapabilityAccountXd948559c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCapabilityAccountXd948559c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCapabilityAccountXd948559c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCapabilityAccountXd948559c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCapabilityAccountXd948559c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCapabilityAccountXd948559c) {
      encoder.requireJsonEncoder("InlineCapabilityAccountXd948559c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCapabilityAccountXd948559c(element: JsonElement): InlineCapabilityAccountXd948559cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineCapabilityAccountXd948559cInspection(
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
