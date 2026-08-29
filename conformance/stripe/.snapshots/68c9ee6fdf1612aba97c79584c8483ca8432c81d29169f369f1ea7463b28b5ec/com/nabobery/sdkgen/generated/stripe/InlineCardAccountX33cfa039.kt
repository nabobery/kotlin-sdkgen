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

public enum class InlineCardAccountX33cfa039Branch {
  Branch1,
  Account,
}

public sealed class InlineCardAccountX33cfa039DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCardAccountX33cfa039NoMatchException(
  message: String,
) : InlineCardAccountX33cfa039DecodingException(message)

internal data class InlineCardAccountX33cfa039Inspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/card/properties/account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/card/properties/account
 */
@Serializable(with = InlineCardAccountX33cfa039.Serializer::class)
public class InlineCardAccountX33cfa039 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCardAccountX33cfa039Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineCardAccountX33cfa039Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCardAccountX33cfa039Branch.Branch1)
      if (inspection.matchesAccount) add(InlineCardAccountX33cfa039Branch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCardAccountX33cfa039 {
      val inspection = inspectInlineCardAccountX33cfa039(raw)
      if (inspection.matchCount == 0) {
        throw InlineCardAccountX33cfa039NoMatchException("InlineCardAccountX33cfa039 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCardAccountX33cfa039(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCardAccountX33cfa039> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCardAccountX33cfa039 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCardAccountX33cfa039")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCardAccountX33cfa039) {
      encoder.requireJsonEncoder("InlineCardAccountX33cfa039").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCardAccountX33cfa039(element: JsonElement): InlineCardAccountX33cfa039Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineCardAccountX33cfa039Inspection(
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
