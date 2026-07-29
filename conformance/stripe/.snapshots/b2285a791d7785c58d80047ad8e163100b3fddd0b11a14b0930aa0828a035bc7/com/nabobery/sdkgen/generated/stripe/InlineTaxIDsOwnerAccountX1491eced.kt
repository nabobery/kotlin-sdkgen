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

public enum class InlineTaxIDsOwnerAccountX1491ecedBranch {
  Branch1,
  Account,
}

public sealed class InlineTaxIDsOwnerAccountX1491ecedDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxIDsOwnerAccountX1491ecedNoMatchException(
  message: String,
) : InlineTaxIDsOwnerAccountX1491ecedDecodingException(message)

internal data class InlineTaxIDsOwnerAccountX1491ecedInspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The account being referenced when `type` is `account`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_i_ds_owner/properties/account
 */
@Serializable(with = InlineTaxIDsOwnerAccountX1491eced.Serializer::class)
public class InlineTaxIDsOwnerAccountX1491eced internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxIDsOwnerAccountX1491ecedInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineTaxIDsOwnerAccountX1491ecedBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTaxIDsOwnerAccountX1491ecedBranch.Branch1)
      if (inspection.matchesAccount) add(InlineTaxIDsOwnerAccountX1491ecedBranch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxIDsOwnerAccountX1491eced {
      val inspection = inspectInlineTaxIDsOwnerAccountX1491eced(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxIDsOwnerAccountX1491ecedNoMatchException("InlineTaxIDsOwnerAccountX1491eced matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxIDsOwnerAccountX1491eced(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTaxIDsOwnerAccountX1491eced> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxIDsOwnerAccountX1491eced {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxIDsOwnerAccountX1491eced")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxIDsOwnerAccountX1491eced) {
      encoder.requireJsonEncoder("InlineTaxIDsOwnerAccountX1491eced").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxIDsOwnerAccountX1491eced(element: JsonElement): InlineTaxIDsOwnerAccountX1491ecedInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineTaxIDsOwnerAccountX1491ecedInspection(
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
